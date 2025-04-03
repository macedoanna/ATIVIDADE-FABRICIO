import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = null;
        forwardStack = null;
        currentPage = null;
    }

    // Acessa uma nova página
    public void visit(String url) {
        if (currentPage != null) {
            if (backStack == null) backStack = new Stack<>();
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack = null; // Zera a pilha de avanço ao visitar nova página
        printState("Visitando: " + url);
    }

    // Volta para a página anterior
    public void back() {
        if (backStack != null && !backStack.isEmpty()) {
            if (forwardStack == null) forwardStack = new Stack<>();
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            if (backStack.isEmpty()) backStack = null;
            printState("Voltando para: " + currentPage);
        } else {
            System.out.println("Botão voltar desativado.");
        }
    }

    // Avança para a próxima página
    public void forward() {
        if (forwardStack != null && !forwardStack.isEmpty()) {
            if (backStack == null) backStack = new Stack<>();
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            if (forwardStack.isEmpty()) forwardStack = null;
            printState("Avançando para: " + currentPage);
        } else {
            System.out.println("Botão avançar desativado.");
        }
    }

    // Exibe o estado atual das pilhas e da página
    private void printState(String action) {
        System.out.println("\n" + action);
        System.out.println("Página atual: " + currentPage);
        System.out.println("Pilha Voltar: " + (backStack != null ? backStack : "vazia"));
        System.out.println("Pilha Avançar: " + (forwardStack != null ? forwardStack : "vazia"));
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visit("mozilla.org");
        browser.visit("developer.mozilla.org");
        browser.visit("github.com/mozilla");
        browser.back();
        browser.back();
        browser.forward();
        browser.visit("support.mozilla.org");
        browser.back();
    }
}
