package auxiliar;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;


public class AccesoUrl implements PhaseListener{
    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext fc = event.getFacesContext();
        String currentPage = fc.getViewRoot().getViewId();
        boolean isPageLogin = currentPage.lastIndexOf("index.xhtml") > -1 ? true : false;

        HttpSession sesion;
        sesion = (HttpSession) fc.getExternalContext().getSession(true);
        Object usuario = sesion.getAttribute("usuario");

        if (!isPageLogin && usuario == null) {
            NavigationHandler nHandler = fc.getApplication().getNavigationHandler();
            nHandler.handleNavigation(fc, null, "/index.xhtml");
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
}
