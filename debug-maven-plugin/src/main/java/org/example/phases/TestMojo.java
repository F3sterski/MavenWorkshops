package org.example.phases;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import static org.apache.maven.plugins.annotations.LifecyclePhase.TEST;

@Mojo( name = "dependency-test", defaultPhase = TEST)
public class TestMojo extends AbstractMojo {

    static String phase = "TEST";


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(phase);
        getPluginContext().put(phase, System.currentTimeMillis());

        long time = System.currentTimeMillis() - (long)getPluginContext().get("COMPILE");

        getLog().info("compile time: " + time  + "ms");

    }
}
