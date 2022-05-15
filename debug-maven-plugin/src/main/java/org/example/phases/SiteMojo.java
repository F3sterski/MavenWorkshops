package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import static org.apache.maven.plugins.annotations.LifecyclePhase.SITE;

@Mojo( name = "dependency-site", defaultPhase = SITE)
public class SiteMojo extends AbstractMojo {

    static String phase = "SITE";
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(phase);

    }
}
