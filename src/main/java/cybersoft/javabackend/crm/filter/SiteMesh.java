package cybersoft.javabackend.crm.filter;

import javax.servlet.annotation.WebFilter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
@WebFilter(filterName = "sitemesh" ,urlPatterns = "/dashboard")
public class SiteMesh extends SiteMeshFilter {

}
