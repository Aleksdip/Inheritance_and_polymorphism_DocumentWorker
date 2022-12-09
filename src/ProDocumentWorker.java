public class ProDocumentWorker extends DocumentWorker {
    @Override
    protected void editDocument () {
        System.out.println("Документ відредаговано");
    }
    @Override
    protected void saveDocument () {
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Expert");
    }
}
