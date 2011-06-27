application {
    title = 'Msglauncher'
    startupGroups = ['msglauncher']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "msglauncher"
    'msglauncher' {
        model      = 'msglauncher.MsglauncherModel'
        view       = 'msglauncher.MsglauncherView'
        controller = 'msglauncher.MsglauncherController'
    }

}
