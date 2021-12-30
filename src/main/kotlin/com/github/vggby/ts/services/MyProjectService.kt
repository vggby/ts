package com.github.vggby.ts.services

import com.intellij.openapi.project.Project
import com.github.vggby.ts.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
