/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InputSignalKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssIEEE3B;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss IEEE3B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA2 <em>A2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA3 <em>A3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA4 <em>A4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA5 <em>A5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA6 <em>A6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA7 <em>A7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getA8 <em>A8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getInputSignal1Type <em>Input Signal1 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getInputSignal2Type <em>Input Signal2 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getTw1 <em>Tw1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getTw2 <em>Tw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getTw3 <em>Tw3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getVstmax <em>Vstmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE3BImpl#getVstmin <em>Vstmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssIEEE3BImpl extends PowerSystemStabilizerDynamicsImpl implements PssIEEE3B {
    /**
     * The default value of the '{@link #getA1() <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA1()
     * @generated
     * @ordered
     */
    protected static final Float A1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA1() <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA1()
     * @generated
     * @ordered
     */
    protected Float a1 = A1_EDEFAULT;

    /**
     * This is true if the A1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a1ESet;

    /**
     * The default value of the '{@link #getA2() <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA2()
     * @generated
     * @ordered
     */
    protected static final Float A2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA2() <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA2()
     * @generated
     * @ordered
     */
    protected Float a2 = A2_EDEFAULT;

    /**
     * This is true if the A2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a2ESet;

    /**
     * The default value of the '{@link #getA3() <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA3()
     * @generated
     * @ordered
     */
    protected static final Float A3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA3() <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA3()
     * @generated
     * @ordered
     */
    protected Float a3 = A3_EDEFAULT;

    /**
     * This is true if the A3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a3ESet;

    /**
     * The default value of the '{@link #getA4() <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA4()
     * @generated
     * @ordered
     */
    protected static final Float A4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA4() <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA4()
     * @generated
     * @ordered
     */
    protected Float a4 = A4_EDEFAULT;

    /**
     * This is true if the A4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a4ESet;

    /**
     * The default value of the '{@link #getA5() <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA5()
     * @generated
     * @ordered
     */
    protected static final Float A5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA5() <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA5()
     * @generated
     * @ordered
     */
    protected Float a5 = A5_EDEFAULT;

    /**
     * This is true if the A5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a5ESet;

    /**
     * The default value of the '{@link #getA6() <em>A6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA6()
     * @generated
     * @ordered
     */
    protected static final Float A6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA6() <em>A6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA6()
     * @generated
     * @ordered
     */
    protected Float a6 = A6_EDEFAULT;

    /**
     * This is true if the A6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a6ESet;

    /**
     * The default value of the '{@link #getA7() <em>A7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA7()
     * @generated
     * @ordered
     */
    protected static final Float A7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA7() <em>A7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA7()
     * @generated
     * @ordered
     */
    protected Float a7 = A7_EDEFAULT;

    /**
     * This is true if the A7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a7ESet;

    /**
     * The default value of the '{@link #getA8() <em>A8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA8()
     * @generated
     * @ordered
     */
    protected static final Float A8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA8() <em>A8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA8()
     * @generated
     * @ordered
     */
    protected Float a8 = A8_EDEFAULT;

    /**
     * This is true if the A8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a8ESet;

    /**
     * The default value of the '{@link #getInputSignal1Type() <em>Input Signal1 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignal1Type()
     * @generated
     * @ordered
     */
    protected static final InputSignalKind INPUT_SIGNAL1_TYPE_EDEFAULT = InputSignalKind.ROTOR_SPEED;

    /**
     * The cached value of the '{@link #getInputSignal1Type() <em>Input Signal1 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignal1Type()
     * @generated
     * @ordered
     */
    protected InputSignalKind inputSignal1Type = INPUT_SIGNAL1_TYPE_EDEFAULT;

    /**
     * This is true if the Input Signal1 Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inputSignal1TypeESet;

    /**
     * The default value of the '{@link #getInputSignal2Type() <em>Input Signal2 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignal2Type()
     * @generated
     * @ordered
     */
    protected static final InputSignalKind INPUT_SIGNAL2_TYPE_EDEFAULT = InputSignalKind.ROTOR_SPEED;

    /**
     * The cached value of the '{@link #getInputSignal2Type() <em>Input Signal2 Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignal2Type()
     * @generated
     * @ordered
     */
    protected InputSignalKind inputSignal2Type = INPUT_SIGNAL2_TYPE_EDEFAULT;

    /**
     * This is true if the Input Signal2 Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inputSignal2TypeESet;

    /**
     * The default value of the '{@link #getKs1() <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs1()
     * @generated
     * @ordered
     */
    protected static final Float KS1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs1() <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs1()
     * @generated
     * @ordered
     */
    protected Float ks1 = KS1_EDEFAULT;

    /**
     * This is true if the Ks1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks1ESet;

    /**
     * The default value of the '{@link #getKs2() <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs2()
     * @generated
     * @ordered
     */
    protected static final Float KS2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs2() <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs2()
     * @generated
     * @ordered
     */
    protected Float ks2 = KS2_EDEFAULT;

    /**
     * This is true if the Ks2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks2ESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Float T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Float t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

    /**
     * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected static final Float T2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected Float t2 = T2_EDEFAULT;

    /**
     * This is true if the T2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t2ESet;

    /**
     * The default value of the '{@link #getTw1() <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw1()
     * @generated
     * @ordered
     */
    protected static final Float TW1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw1() <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw1()
     * @generated
     * @ordered
     */
    protected Float tw1 = TW1_EDEFAULT;

    /**
     * This is true if the Tw1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw1ESet;

    /**
     * The default value of the '{@link #getTw2() <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw2()
     * @generated
     * @ordered
     */
    protected static final Float TW2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw2() <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw2()
     * @generated
     * @ordered
     */
    protected Float tw2 = TW2_EDEFAULT;

    /**
     * This is true if the Tw2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw2ESet;

    /**
     * The default value of the '{@link #getTw3() <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw3()
     * @generated
     * @ordered
     */
    protected static final Float TW3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw3() <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw3()
     * @generated
     * @ordered
     */
    protected Float tw3 = TW3_EDEFAULT;

    /**
     * This is true if the Tw3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw3ESet;

    /**
     * The default value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected static final Float VSTMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected Float vstmax = VSTMAX_EDEFAULT;

    /**
     * This is true if the Vstmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstmaxESet;

    /**
     * The default value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected static final Float VSTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected Float vstmin = VSTMIN_EDEFAULT;

    /**
     * This is true if the Vstmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssIEEE3BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssIEEE3B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA1() {
        return a1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA1( Float newA1 ) {
        Float oldA1 = a1;
        a1 = newA1;
        boolean oldA1ESet = a1ESet;
        a1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A1, oldA1, a1, !oldA1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA1() {
        Float oldA1 = a1;
        boolean oldA1ESet = a1ESet;
        a1 = A1_EDEFAULT;
        a1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A1, oldA1, A1_EDEFAULT, oldA1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA1() {
        return a1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA2() {
        return a2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA2( Float newA2 ) {
        Float oldA2 = a2;
        a2 = newA2;
        boolean oldA2ESet = a2ESet;
        a2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A2, oldA2, a2, !oldA2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA2() {
        Float oldA2 = a2;
        boolean oldA2ESet = a2ESet;
        a2 = A2_EDEFAULT;
        a2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A2, oldA2, A2_EDEFAULT, oldA2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA2() {
        return a2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA3() {
        return a3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA3( Float newA3 ) {
        Float oldA3 = a3;
        a3 = newA3;
        boolean oldA3ESet = a3ESet;
        a3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A3, oldA3, a3, !oldA3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA3() {
        Float oldA3 = a3;
        boolean oldA3ESet = a3ESet;
        a3 = A3_EDEFAULT;
        a3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A3, oldA3, A3_EDEFAULT, oldA3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA3() {
        return a3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA4() {
        return a4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA4( Float newA4 ) {
        Float oldA4 = a4;
        a4 = newA4;
        boolean oldA4ESet = a4ESet;
        a4ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A4, oldA4, a4, !oldA4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA4() {
        Float oldA4 = a4;
        boolean oldA4ESet = a4ESet;
        a4 = A4_EDEFAULT;
        a4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A4, oldA4, A4_EDEFAULT, oldA4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA4() {
        return a4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA5() {
        return a5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA5( Float newA5 ) {
        Float oldA5 = a5;
        a5 = newA5;
        boolean oldA5ESet = a5ESet;
        a5ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A5, oldA5, a5, !oldA5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA5() {
        Float oldA5 = a5;
        boolean oldA5ESet = a5ESet;
        a5 = A5_EDEFAULT;
        a5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A5, oldA5, A5_EDEFAULT, oldA5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA5() {
        return a5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA6() {
        return a6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA6( Float newA6 ) {
        Float oldA6 = a6;
        a6 = newA6;
        boolean oldA6ESet = a6ESet;
        a6ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A6, oldA6, a6, !oldA6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA6() {
        Float oldA6 = a6;
        boolean oldA6ESet = a6ESet;
        a6 = A6_EDEFAULT;
        a6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A6, oldA6, A6_EDEFAULT, oldA6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA6() {
        return a6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA7() {
        return a7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA7( Float newA7 ) {
        Float oldA7 = a7;
        a7 = newA7;
        boolean oldA7ESet = a7ESet;
        a7ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A7, oldA7, a7, !oldA7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA7() {
        Float oldA7 = a7;
        boolean oldA7ESet = a7ESet;
        a7 = A7_EDEFAULT;
        a7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A7, oldA7, A7_EDEFAULT, oldA7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA7() {
        return a7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA8() {
        return a8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA8( Float newA8 ) {
        Float oldA8 = a8;
        a8 = newA8;
        boolean oldA8ESet = a8ESet;
        a8ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A8, oldA8, a8, !oldA8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA8() {
        Float oldA8 = a8;
        boolean oldA8ESet = a8ESet;
        a8 = A8_EDEFAULT;
        a8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__A8, oldA8, A8_EDEFAULT, oldA8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA8() {
        return a8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InputSignalKind getInputSignal1Type() {
        return inputSignal1Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputSignal1Type( InputSignalKind newInputSignal1Type ) {
        InputSignalKind oldInputSignal1Type = inputSignal1Type;
        inputSignal1Type = newInputSignal1Type == null ? INPUT_SIGNAL1_TYPE_EDEFAULT : newInputSignal1Type;
        boolean oldInputSignal1TypeESet = inputSignal1TypeESet;
        inputSignal1TypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__INPUT_SIGNAL1_TYPE,
                    oldInputSignal1Type, inputSignal1Type, !oldInputSignal1TypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInputSignal1Type() {
        InputSignalKind oldInputSignal1Type = inputSignal1Type;
        boolean oldInputSignal1TypeESet = inputSignal1TypeESet;
        inputSignal1Type = INPUT_SIGNAL1_TYPE_EDEFAULT;
        inputSignal1TypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__INPUT_SIGNAL1_TYPE,
                    oldInputSignal1Type, INPUT_SIGNAL1_TYPE_EDEFAULT, oldInputSignal1TypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputSignal1Type() {
        return inputSignal1TypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InputSignalKind getInputSignal2Type() {
        return inputSignal2Type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputSignal2Type( InputSignalKind newInputSignal2Type ) {
        InputSignalKind oldInputSignal2Type = inputSignal2Type;
        inputSignal2Type = newInputSignal2Type == null ? INPUT_SIGNAL2_TYPE_EDEFAULT : newInputSignal2Type;
        boolean oldInputSignal2TypeESet = inputSignal2TypeESet;
        inputSignal2TypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__INPUT_SIGNAL2_TYPE,
                    oldInputSignal2Type, inputSignal2Type, !oldInputSignal2TypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInputSignal2Type() {
        InputSignalKind oldInputSignal2Type = inputSignal2Type;
        boolean oldInputSignal2TypeESet = inputSignal2TypeESet;
        inputSignal2Type = INPUT_SIGNAL2_TYPE_EDEFAULT;
        inputSignal2TypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__INPUT_SIGNAL2_TYPE,
                    oldInputSignal2Type, INPUT_SIGNAL2_TYPE_EDEFAULT, oldInputSignal2TypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputSignal2Type() {
        return inputSignal2TypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKs1() {
        return ks1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs1( Float newKs1 ) {
        Float oldKs1 = ks1;
        ks1 = newKs1;
        boolean oldKs1ESet = ks1ESet;
        ks1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__KS1, oldKs1, ks1, !oldKs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs1() {
        Float oldKs1 = ks1;
        boolean oldKs1ESet = ks1ESet;
        ks1 = KS1_EDEFAULT;
        ks1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__KS1, oldKs1, KS1_EDEFAULT, oldKs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs1() {
        return ks1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKs2() {
        return ks2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs2( Float newKs2 ) {
        Float oldKs2 = ks2;
        ks2 = newKs2;
        boolean oldKs2ESet = ks2ESet;
        ks2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__KS2, oldKs2, ks2, !oldKs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs2() {
        Float oldKs2 = ks2;
        boolean oldKs2ESet = ks2ESet;
        ks2 = KS2_EDEFAULT;
        ks2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__KS2, oldKs2, KS2_EDEFAULT, oldKs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs2() {
        return ks2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Float newT1 ) {
        Float oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__T1, oldT1, t1, !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Float oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__T1, oldT1, T1_EDEFAULT, oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT2() {
        return t2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT2( Float newT2 ) {
        Float oldT2 = t2;
        t2 = newT2;
        boolean oldT2ESet = t2ESet;
        t2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__T2, oldT2, t2, !oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT2() {
        Float oldT2 = t2;
        boolean oldT2ESet = t2ESet;
        t2 = T2_EDEFAULT;
        t2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__T2, oldT2, T2_EDEFAULT, oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT2() {
        return t2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTw1() {
        return tw1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw1( Float newTw1 ) {
        Float oldTw1 = tw1;
        tw1 = newTw1;
        boolean oldTw1ESet = tw1ESet;
        tw1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__TW1, oldTw1, tw1, !oldTw1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw1() {
        Float oldTw1 = tw1;
        boolean oldTw1ESet = tw1ESet;
        tw1 = TW1_EDEFAULT;
        tw1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__TW1, oldTw1, TW1_EDEFAULT, oldTw1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw1() {
        return tw1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTw2() {
        return tw2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw2( Float newTw2 ) {
        Float oldTw2 = tw2;
        tw2 = newTw2;
        boolean oldTw2ESet = tw2ESet;
        tw2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__TW2, oldTw2, tw2, !oldTw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw2() {
        Float oldTw2 = tw2;
        boolean oldTw2ESet = tw2ESet;
        tw2 = TW2_EDEFAULT;
        tw2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__TW2, oldTw2, TW2_EDEFAULT, oldTw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw2() {
        return tw2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTw3() {
        return tw3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw3( Float newTw3 ) {
        Float oldTw3 = tw3;
        tw3 = newTw3;
        boolean oldTw3ESet = tw3ESet;
        tw3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__TW3, oldTw3, tw3, !oldTw3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw3() {
        Float oldTw3 = tw3;
        boolean oldTw3ESet = tw3ESet;
        tw3 = TW3_EDEFAULT;
        tw3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__TW3, oldTw3, TW3_EDEFAULT, oldTw3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw3() {
        return tw3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVstmax() {
        return vstmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmax( Float newVstmax ) {
        Float oldVstmax = vstmax;
        vstmax = newVstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE3B__VSTMAX, oldVstmax, vstmax, !oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmax() {
        Float oldVstmax = vstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmax = VSTMAX_EDEFAULT;
        vstmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__VSTMAX, oldVstmax, VSTMAX_EDEFAULT, oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmax() {
        return vstmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVstmin() {
        return vstmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmin( Float newVstmin ) {
        Float oldVstmin = vstmin;
        vstmin = newVstmin;
        boolean oldVstminESet = vstminESet;
        vstminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE3B__VSTMIN, oldVstmin, vstmin, !oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmin() {
        Float oldVstmin = vstmin;
        boolean oldVstminESet = vstminESet;
        vstmin = VSTMIN_EDEFAULT;
        vstminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE3B__VSTMIN, oldVstmin, VSTMIN_EDEFAULT, oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmin() {
        return vstminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_IEEE3B__A1:
            return getA1();
        case CimPackage.PSS_IEEE3B__A2:
            return getA2();
        case CimPackage.PSS_IEEE3B__A3:
            return getA3();
        case CimPackage.PSS_IEEE3B__A4:
            return getA4();
        case CimPackage.PSS_IEEE3B__A5:
            return getA5();
        case CimPackage.PSS_IEEE3B__A6:
            return getA6();
        case CimPackage.PSS_IEEE3B__A7:
            return getA7();
        case CimPackage.PSS_IEEE3B__A8:
            return getA8();
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL1_TYPE:
            return getInputSignal1Type();
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL2_TYPE:
            return getInputSignal2Type();
        case CimPackage.PSS_IEEE3B__KS1:
            return getKs1();
        case CimPackage.PSS_IEEE3B__KS2:
            return getKs2();
        case CimPackage.PSS_IEEE3B__T1:
            return getT1();
        case CimPackage.PSS_IEEE3B__T2:
            return getT2();
        case CimPackage.PSS_IEEE3B__TW1:
            return getTw1();
        case CimPackage.PSS_IEEE3B__TW2:
            return getTw2();
        case CimPackage.PSS_IEEE3B__TW3:
            return getTw3();
        case CimPackage.PSS_IEEE3B__VSTMAX:
            return getVstmax();
        case CimPackage.PSS_IEEE3B__VSTMIN:
            return getVstmin();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.PSS_IEEE3B__A1:
            setA1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A2:
            setA2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A3:
            setA3( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A4:
            setA4( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A5:
            setA5( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A6:
            setA6( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A7:
            setA7( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A8:
            setA8( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL1_TYPE:
            setInputSignal1Type( ( InputSignalKind ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL2_TYPE:
            setInputSignal2Type( ( InputSignalKind ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__KS1:
            setKs1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__KS2:
            setKs2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__T1:
            setT1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__T2:
            setT2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__TW1:
            setTw1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__TW2:
            setTw2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__TW3:
            setTw3( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__VSTMAX:
            setVstmax( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__VSTMIN:
            setVstmin( ( Float ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.PSS_IEEE3B__A1:
            unsetA1();
            return;
        case CimPackage.PSS_IEEE3B__A2:
            unsetA2();
            return;
        case CimPackage.PSS_IEEE3B__A3:
            unsetA3();
            return;
        case CimPackage.PSS_IEEE3B__A4:
            unsetA4();
            return;
        case CimPackage.PSS_IEEE3B__A5:
            unsetA5();
            return;
        case CimPackage.PSS_IEEE3B__A6:
            unsetA6();
            return;
        case CimPackage.PSS_IEEE3B__A7:
            unsetA7();
            return;
        case CimPackage.PSS_IEEE3B__A8:
            unsetA8();
            return;
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL1_TYPE:
            unsetInputSignal1Type();
            return;
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL2_TYPE:
            unsetInputSignal2Type();
            return;
        case CimPackage.PSS_IEEE3B__KS1:
            unsetKs1();
            return;
        case CimPackage.PSS_IEEE3B__KS2:
            unsetKs2();
            return;
        case CimPackage.PSS_IEEE3B__T1:
            unsetT1();
            return;
        case CimPackage.PSS_IEEE3B__T2:
            unsetT2();
            return;
        case CimPackage.PSS_IEEE3B__TW1:
            unsetTw1();
            return;
        case CimPackage.PSS_IEEE3B__TW2:
            unsetTw2();
            return;
        case CimPackage.PSS_IEEE3B__TW3:
            unsetTw3();
            return;
        case CimPackage.PSS_IEEE3B__VSTMAX:
            unsetVstmax();
            return;
        case CimPackage.PSS_IEEE3B__VSTMIN:
            unsetVstmin();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.PSS_IEEE3B__A1:
            return isSetA1();
        case CimPackage.PSS_IEEE3B__A2:
            return isSetA2();
        case CimPackage.PSS_IEEE3B__A3:
            return isSetA3();
        case CimPackage.PSS_IEEE3B__A4:
            return isSetA4();
        case CimPackage.PSS_IEEE3B__A5:
            return isSetA5();
        case CimPackage.PSS_IEEE3B__A6:
            return isSetA6();
        case CimPackage.PSS_IEEE3B__A7:
            return isSetA7();
        case CimPackage.PSS_IEEE3B__A8:
            return isSetA8();
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL1_TYPE:
            return isSetInputSignal1Type();
        case CimPackage.PSS_IEEE3B__INPUT_SIGNAL2_TYPE:
            return isSetInputSignal2Type();
        case CimPackage.PSS_IEEE3B__KS1:
            return isSetKs1();
        case CimPackage.PSS_IEEE3B__KS2:
            return isSetKs2();
        case CimPackage.PSS_IEEE3B__T1:
            return isSetT1();
        case CimPackage.PSS_IEEE3B__T2:
            return isSetT2();
        case CimPackage.PSS_IEEE3B__TW1:
            return isSetTw1();
        case CimPackage.PSS_IEEE3B__TW2:
            return isSetTw2();
        case CimPackage.PSS_IEEE3B__TW3:
            return isSetTw3();
        case CimPackage.PSS_IEEE3B__VSTMAX:
            return isSetVstmax();
        case CimPackage.PSS_IEEE3B__VSTMIN:
            return isSetVstmin();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (a1: " );
        if( a1ESet )
            result.append( a1 );
        else
            result.append( "<unset>" );
        result.append( ", a2: " );
        if( a2ESet )
            result.append( a2 );
        else
            result.append( "<unset>" );
        result.append( ", a3: " );
        if( a3ESet )
            result.append( a3 );
        else
            result.append( "<unset>" );
        result.append( ", a4: " );
        if( a4ESet )
            result.append( a4 );
        else
            result.append( "<unset>" );
        result.append( ", a5: " );
        if( a5ESet )
            result.append( a5 );
        else
            result.append( "<unset>" );
        result.append( ", a6: " );
        if( a6ESet )
            result.append( a6 );
        else
            result.append( "<unset>" );
        result.append( ", a7: " );
        if( a7ESet )
            result.append( a7 );
        else
            result.append( "<unset>" );
        result.append( ", a8: " );
        if( a8ESet )
            result.append( a8 );
        else
            result.append( "<unset>" );
        result.append( ", inputSignal1Type: " );
        if( inputSignal1TypeESet )
            result.append( inputSignal1Type );
        else
            result.append( "<unset>" );
        result.append( ", inputSignal2Type: " );
        if( inputSignal2TypeESet )
            result.append( inputSignal2Type );
        else
            result.append( "<unset>" );
        result.append( ", ks1: " );
        if( ks1ESet )
            result.append( ks1 );
        else
            result.append( "<unset>" );
        result.append( ", ks2: " );
        if( ks2ESet )
            result.append( ks2 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", tw1: " );
        if( tw1ESet )
            result.append( tw1 );
        else
            result.append( "<unset>" );
        result.append( ", tw2: " );
        if( tw2ESet )
            result.append( tw2 );
        else
            result.append( "<unset>" );
        result.append( ", tw3: " );
        if( tw3ESet )
            result.append( tw3 );
        else
            result.append( "<unset>" );
        result.append( ", vstmax: " );
        if( vstmaxESet )
            result.append( vstmax );
        else
            result.append( "<unset>" );
        result.append( ", vstmin: " );
        if( vstminESet )
            result.append( vstmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PssIEEE3BImpl
