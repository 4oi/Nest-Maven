/*
 * Copyright 2017 toyblocks All rights reserved.
 */
package jp.llv.nest.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Nest document generator plugin.
 *
 * @author toyblocks
 */
@Mojo(name = "nestdoc")
@Execute(phase = LifecyclePhase.PROCESS_CLASSES)
public class NestMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
    }

}
