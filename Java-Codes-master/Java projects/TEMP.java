midBar.setLayout( new GridBagLayout() );


		JLabel l1 = new JLabel("NAME");
		JLabel l2 = new JLabel(s1.getLastName()+" , "+s1.getFirstName() );
		addComp(midBar, l1, 0, 0, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l2, 1, 0, 2, 1, GridBagConstraints.WEST);

		JLabel l3 = new JLabel("BIRTH DATE");
		JLabel l4 = new JLabel(s1.getBirthDate());
		addComp(midBar, l3, 0, 1, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l4, 1, 1, 2, 1, GridBagConstraints.WEST);

		JLabel l5 = new JLabel("ADDRESS");
		JLabel l6 = new JLabel(s1.getAddress());
		addComp(midBar, l5, 0, 2, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l6, 1, 2, 2, 1, GridBagConstraints.WEST);


		JLabel l7 = new JLabel("CONTACT NUMBER");
		JLabel l8 = new JLabel(s1.getContactNo());
		//b7 =  new JButton("CHANGE");
		addComp(midBar, l7, 0, 3, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l8, 1, 3, 2, 1, GridBagConstraints.WEST);
		//addComp(midBar, b7, 2, 4, 1, 1, GridBagConstraints.WEST);	

		JLabel l9 = new JLabel("EMAIL");
		JLabel l10 = new JLabel(s1.getEmail());
		//b8 = new JButton("CHANGE");
		addComp(midBar, l9, 0, 5, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l10, 1, 5, 2, 1, GridBagConstraints.WEST);
		//addComp(midBar, b7, 2, 6, 1, 1, GridBagConstraints.WEST);



		JLabel l11 = new JLabel("PARENTS NAME");
		JLabel l12 = new JLabel(s1.getParentsName());
		addComp(midBar, l11, 0, 7, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l12, 1, 7, 2, 1, GridBagConstraints.WEST);


		JLabel l13 = new JLabel("PARENTS CONTACT NUMBER");
		JLabel l14 = new JLabel(s1.getParentsContactNo());
		addComp(midBar, l11, 0, 8, 1, 1, GridBagConstraints.EAST);
		addComp(midBar, l12, 1, 8, 2, 1, GridBagConstraints.WEST);