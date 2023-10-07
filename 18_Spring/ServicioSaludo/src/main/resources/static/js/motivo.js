function confirmTurno(link) {
    console.log("confirmTurno function called"); // Debugging message
    const motivoInput = document.getElementById("motivoInput");
    const motivoTextarea = document.getElementById("motivo");
    const motivo = link.getAttribute("th:data-motivo");

    console.log("motivoTextarea.value:", motivoTextarea.value); // Debug the textarea value
    console.log("motivo:", motivo); // Debug the motivo value

    motivoInput.value = motivoTextarea.value; // Update 'motivo' input with textarea value
    document.getElementById("confirmForm").submit(); // Submit the form
}