root {
    'groovy.swing.SwingBuilder' {
        controller = ['Threading']
        view = '*'
    }
    'griffon.app.ApplicationBuilder' {
        view = '*'
    }
}
root.'SpringGriffonAddon'.addon=true

root.'QuartzGriffonAddon'.addon=true
