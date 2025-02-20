function submitRecommendation() {
    const recommendationText = prompt("Enter your recommendation:");
    if (recommendationText) {
        const newRecommendation = document.createElement('div');
        newRecommendation.classList.add('recommendation');
        newRecommendation.innerHTML = `<p>${recommendationText}</p>`;
        document.getElementById('recommendations-list').appendChild(newRecommendation);
        alert('Recommendation Submitted Successfully!');
    }
}