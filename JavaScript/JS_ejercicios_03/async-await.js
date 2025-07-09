async function buscarPersonaje(id) {
    try{
        const response = await fetch(`https://mhw-db.com/ailments/${id}`);
        if (!response.ok) {
            throw new Error(`Error: ${response.status} - ${response.statusText}`);
        }
        const data = await response.json();
        console.log(`id: ${data.id}`);
        console.log(`Nombre: ${data.name}`);
        console.log(`Descripción: ${data.description}`);
    } 
    catch (error) {
        console.error(`Error al buscar el personaje: ${error.message}`);
    }
}

buscarPersonaje("8");