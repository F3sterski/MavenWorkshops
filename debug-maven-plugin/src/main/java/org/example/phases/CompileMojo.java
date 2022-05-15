package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import static org.apache.maven.plugins.annotations.LifecyclePhase.COMPILE;

@Mojo( name = "dependency-compile", defaultPhase = COMPILE)
public class CompileMojo extends AbstractMojo {

    static String phase = "COMPILE";

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(phase);
        getPluginContext().put(phase, System.currentTimeMillis());

        long time = System.currentTimeMillis() - (long)getPluginContext().get(ValidateMojo.phase);

        getLog().info("time: " + time  + "ms");

    }
}
