function analyzeExcel() {
    const fileInput = document.getElementById('excelFileInput');
    const outputDiv = document.getElementById('output');
    
    const file = fileInput.files[0];

    if (file) {
        outputDiv.innerHTML = 'Processing...';

        setTimeout(() => {

            const serverResponse = 'Results from server...';
            outputDiv.innerHTML = serverResponse;
        }, 2000); 
    } else {
        outputDiv.innerHTML = 'Please select an Excel file.';
    }
}