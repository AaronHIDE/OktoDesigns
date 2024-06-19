const {Router } = require('express');
const router = Router();

router.get('/',(req, res) => {
	res.render('pago');
});

router.post('/checkout', async(req, res) => {
	
})

module export = router;