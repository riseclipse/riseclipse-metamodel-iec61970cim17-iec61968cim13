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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Pss2ST;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss2 ST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getInputSignal1Type <em>Input Signal1 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getInputSignal2Type <em>Input Signal2 Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getLsmax <em>Lsmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getLsmin <em>Lsmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT10 <em>T10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT7 <em>T7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT8 <em>T8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getT9 <em>T9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getVcl <em>Vcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.Pss2STImpl#getVcu <em>Vcu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pss2STImpl extends PowerSystemStabilizerDynamicsImpl implements Pss2ST {
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
     * The default value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected static final Float K1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected Float k1 = K1_EDEFAULT;

    /**
     * This is true if the K1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k1ESet;

    /**
     * The default value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected static final Float K2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected Float k2 = K2_EDEFAULT;

    /**
     * This is true if the K2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k2ESet;

    /**
     * The default value of the '{@link #getLsmax() <em>Lsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLsmax()
     * @generated
     * @ordered
     */
    protected static final Float LSMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLsmax() <em>Lsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLsmax()
     * @generated
     * @ordered
     */
    protected Float lsmax = LSMAX_EDEFAULT;

    /**
     * This is true if the Lsmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lsmaxESet;

    /**
     * The default value of the '{@link #getLsmin() <em>Lsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLsmin()
     * @generated
     * @ordered
     */
    protected static final Float LSMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLsmin() <em>Lsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLsmin()
     * @generated
     * @ordered
     */
    protected Float lsmin = LSMIN_EDEFAULT;

    /**
     * This is true if the Lsmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lsminESet;

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
     * The default value of the '{@link #getT10() <em>T10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT10()
     * @generated
     * @ordered
     */
    protected static final Float T10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT10() <em>T10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT10()
     * @generated
     * @ordered
     */
    protected Float t10 = T10_EDEFAULT;

    /**
     * This is true if the T10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t10ESet;

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
     * The default value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected static final Float T3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected Float t3 = T3_EDEFAULT;

    /**
     * This is true if the T3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t3ESet;

    /**
     * The default value of the '{@link #getT4() <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4()
     * @generated
     * @ordered
     */
    protected static final Float T4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4() <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4()
     * @generated
     * @ordered
     */
    protected Float t4 = T4_EDEFAULT;

    /**
     * This is true if the T4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4ESet;

    /**
     * The default value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected static final Float T5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected Float t5 = T5_EDEFAULT;

    /**
     * This is true if the T5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t5ESet;

    /**
     * The default value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected static final Float T6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected Float t6 = T6_EDEFAULT;

    /**
     * This is true if the T6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t6ESet;

    /**
     * The default value of the '{@link #getT7() <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT7()
     * @generated
     * @ordered
     */
    protected static final Float T7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT7() <em>T7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT7()
     * @generated
     * @ordered
     */
    protected Float t7 = T7_EDEFAULT;

    /**
     * This is true if the T7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t7ESet;

    /**
     * The default value of the '{@link #getT8() <em>T8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT8()
     * @generated
     * @ordered
     */
    protected static final Float T8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT8() <em>T8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT8()
     * @generated
     * @ordered
     */
    protected Float t8 = T8_EDEFAULT;

    /**
     * This is true if the T8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t8ESet;

    /**
     * The default value of the '{@link #getT9() <em>T9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT9()
     * @generated
     * @ordered
     */
    protected static final Float T9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT9() <em>T9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT9()
     * @generated
     * @ordered
     */
    protected Float t9 = T9_EDEFAULT;

    /**
     * This is true if the T9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t9ESet;

    /**
     * The default value of the '{@link #getVcl() <em>Vcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVcl()
     * @generated
     * @ordered
     */
    protected static final Float VCL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVcl() <em>Vcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVcl()
     * @generated
     * @ordered
     */
    protected Float vcl = VCL_EDEFAULT;

    /**
     * This is true if the Vcl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vclESet;

    /**
     * The default value of the '{@link #getVcu() <em>Vcu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVcu()
     * @generated
     * @ordered
     */
    protected static final Float VCU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVcu() <em>Vcu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVcu()
     * @generated
     * @ordered
     */
    protected Float vcu = VCU_EDEFAULT;

    /**
     * This is true if the Vcu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vcuESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Pss2STImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPss2ST();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__INPUT_SIGNAL1_TYPE,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__INPUT_SIGNAL1_TYPE,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__INPUT_SIGNAL2_TYPE,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__INPUT_SIGNAL2_TYPE,
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
    public Float getK1() {
        return k1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK1( Float newK1 ) {
        Float oldK1 = k1;
        k1 = newK1;
        boolean oldK1ESet = k1ESet;
        k1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__K1, oldK1, k1, !oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK1() {
        Float oldK1 = k1;
        boolean oldK1ESet = k1ESet;
        k1 = K1_EDEFAULT;
        k1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__K1,
                oldK1, K1_EDEFAULT, oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK1() {
        return k1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getK2() {
        return k2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK2( Float newK2 ) {
        Float oldK2 = k2;
        k2 = newK2;
        boolean oldK2ESet = k2ESet;
        k2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__K2, oldK2, k2, !oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK2() {
        Float oldK2 = k2;
        boolean oldK2ESet = k2ESet;
        k2 = K2_EDEFAULT;
        k2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__K2,
                oldK2, K2_EDEFAULT, oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK2() {
        return k2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLsmax() {
        return lsmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLsmax( Float newLsmax ) {
        Float oldLsmax = lsmax;
        lsmax = newLsmax;
        boolean oldLsmaxESet = lsmaxESet;
        lsmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__LSMAX,
                oldLsmax, lsmax, !oldLsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLsmax() {
        Float oldLsmax = lsmax;
        boolean oldLsmaxESet = lsmaxESet;
        lsmax = LSMAX_EDEFAULT;
        lsmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS2_ST__LSMAX, oldLsmax, LSMAX_EDEFAULT, oldLsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLsmax() {
        return lsmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLsmin() {
        return lsmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLsmin( Float newLsmin ) {
        Float oldLsmin = lsmin;
        lsmin = newLsmin;
        boolean oldLsminESet = lsminESet;
        lsminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__LSMIN,
                oldLsmin, lsmin, !oldLsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLsmin() {
        Float oldLsmin = lsmin;
        boolean oldLsminESet = lsminESet;
        lsmin = LSMIN_EDEFAULT;
        lsminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS2_ST__LSMIN, oldLsmin, LSMIN_EDEFAULT, oldLsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLsmin() {
        return lsminESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T1, oldT1, t1, !oldT1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T1,
                oldT1, T1_EDEFAULT, oldT1ESet ) );
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
    public Float getT10() {
        return t10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT10( Float newT10 ) {
        Float oldT10 = t10;
        t10 = newT10;
        boolean oldT10ESet = t10ESet;
        t10ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T10, oldT10, t10, !oldT10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT10() {
        Float oldT10 = t10;
        boolean oldT10ESet = t10ESet;
        t10 = T10_EDEFAULT;
        t10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T10,
                oldT10, T10_EDEFAULT, oldT10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT10() {
        return t10ESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T2, oldT2, t2, !oldT2ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T2,
                oldT2, T2_EDEFAULT, oldT2ESet ) );
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
    public Float getT3() {
        return t3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT3( Float newT3 ) {
        Float oldT3 = t3;
        t3 = newT3;
        boolean oldT3ESet = t3ESet;
        t3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T3, oldT3, t3, !oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT3() {
        Float oldT3 = t3;
        boolean oldT3ESet = t3ESet;
        t3 = T3_EDEFAULT;
        t3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T3,
                oldT3, T3_EDEFAULT, oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT3() {
        return t3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT4() {
        return t4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4( Float newT4 ) {
        Float oldT4 = t4;
        t4 = newT4;
        boolean oldT4ESet = t4ESet;
        t4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T4, oldT4, t4, !oldT4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4() {
        Float oldT4 = t4;
        boolean oldT4ESet = t4ESet;
        t4 = T4_EDEFAULT;
        t4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T4,
                oldT4, T4_EDEFAULT, oldT4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4() {
        return t4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT5() {
        return t5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT5( Float newT5 ) {
        Float oldT5 = t5;
        t5 = newT5;
        boolean oldT5ESet = t5ESet;
        t5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T5, oldT5, t5, !oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT5() {
        Float oldT5 = t5;
        boolean oldT5ESet = t5ESet;
        t5 = T5_EDEFAULT;
        t5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T5,
                oldT5, T5_EDEFAULT, oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT5() {
        return t5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT6() {
        return t6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT6( Float newT6 ) {
        Float oldT6 = t6;
        t6 = newT6;
        boolean oldT6ESet = t6ESet;
        t6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T6, oldT6, t6, !oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT6() {
        Float oldT6 = t6;
        boolean oldT6ESet = t6ESet;
        t6 = T6_EDEFAULT;
        t6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T6,
                oldT6, T6_EDEFAULT, oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT6() {
        return t6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT7() {
        return t7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT7( Float newT7 ) {
        Float oldT7 = t7;
        t7 = newT7;
        boolean oldT7ESet = t7ESet;
        t7ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T7, oldT7, t7, !oldT7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT7() {
        Float oldT7 = t7;
        boolean oldT7ESet = t7ESet;
        t7 = T7_EDEFAULT;
        t7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T7,
                oldT7, T7_EDEFAULT, oldT7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT7() {
        return t7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT8() {
        return t8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT8( Float newT8 ) {
        Float oldT8 = t8;
        t8 = newT8;
        boolean oldT8ESet = t8ESet;
        t8ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T8, oldT8, t8, !oldT8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT8() {
        Float oldT8 = t8;
        boolean oldT8ESet = t8ESet;
        t8 = T8_EDEFAULT;
        t8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T8,
                oldT8, T8_EDEFAULT, oldT8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT8() {
        return t8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT9() {
        return t9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT9( Float newT9 ) {
        Float oldT9 = t9;
        t9 = newT9;
        boolean oldT9ESet = t9ESet;
        t9ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__T9, oldT9, t9, !oldT9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT9() {
        Float oldT9 = t9;
        boolean oldT9ESet = t9ESet;
        t9 = T9_EDEFAULT;
        t9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__T9,
                oldT9, T9_EDEFAULT, oldT9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT9() {
        return t9ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVcl() {
        return vcl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVcl( Float newVcl ) {
        Float oldVcl = vcl;
        vcl = newVcl;
        boolean oldVclESet = vclESet;
        vclESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__VCL, oldVcl, vcl, !oldVclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVcl() {
        Float oldVcl = vcl;
        boolean oldVclESet = vclESet;
        vcl = VCL_EDEFAULT;
        vclESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__VCL,
                oldVcl, VCL_EDEFAULT, oldVclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVcl() {
        return vclESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVcu() {
        return vcu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVcu( Float newVcu ) {
        Float oldVcu = vcu;
        vcu = newVcu;
        boolean oldVcuESet = vcuESet;
        vcuESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS2_ST__VCU, oldVcu, vcu, !oldVcuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVcu() {
        Float oldVcu = vcu;
        boolean oldVcuESet = vcuESet;
        vcu = VCU_EDEFAULT;
        vcuESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS2_ST__VCU,
                oldVcu, VCU_EDEFAULT, oldVcuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVcu() {
        return vcuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS2_ST__INPUT_SIGNAL1_TYPE:
            return getInputSignal1Type();
        case CimPackage.PSS2_ST__INPUT_SIGNAL2_TYPE:
            return getInputSignal2Type();
        case CimPackage.PSS2_ST__K1:
            return getK1();
        case CimPackage.PSS2_ST__K2:
            return getK2();
        case CimPackage.PSS2_ST__LSMAX:
            return getLsmax();
        case CimPackage.PSS2_ST__LSMIN:
            return getLsmin();
        case CimPackage.PSS2_ST__T1:
            return getT1();
        case CimPackage.PSS2_ST__T10:
            return getT10();
        case CimPackage.PSS2_ST__T2:
            return getT2();
        case CimPackage.PSS2_ST__T3:
            return getT3();
        case CimPackage.PSS2_ST__T4:
            return getT4();
        case CimPackage.PSS2_ST__T5:
            return getT5();
        case CimPackage.PSS2_ST__T6:
            return getT6();
        case CimPackage.PSS2_ST__T7:
            return getT7();
        case CimPackage.PSS2_ST__T8:
            return getT8();
        case CimPackage.PSS2_ST__T9:
            return getT9();
        case CimPackage.PSS2_ST__VCL:
            return getVcl();
        case CimPackage.PSS2_ST__VCU:
            return getVcu();
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
        case CimPackage.PSS2_ST__INPUT_SIGNAL1_TYPE:
            setInputSignal1Type( ( InputSignalKind ) newValue );
            return;
        case CimPackage.PSS2_ST__INPUT_SIGNAL2_TYPE:
            setInputSignal2Type( ( InputSignalKind ) newValue );
            return;
        case CimPackage.PSS2_ST__K1:
            setK1( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__K2:
            setK2( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__LSMAX:
            setLsmax( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__LSMIN:
            setLsmin( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T1:
            setT1( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T10:
            setT10( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T2:
            setT2( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T3:
            setT3( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T4:
            setT4( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T5:
            setT5( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T6:
            setT6( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T7:
            setT7( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T8:
            setT8( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__T9:
            setT9( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__VCL:
            setVcl( ( Float ) newValue );
            return;
        case CimPackage.PSS2_ST__VCU:
            setVcu( ( Float ) newValue );
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
        case CimPackage.PSS2_ST__INPUT_SIGNAL1_TYPE:
            unsetInputSignal1Type();
            return;
        case CimPackage.PSS2_ST__INPUT_SIGNAL2_TYPE:
            unsetInputSignal2Type();
            return;
        case CimPackage.PSS2_ST__K1:
            unsetK1();
            return;
        case CimPackage.PSS2_ST__K2:
            unsetK2();
            return;
        case CimPackage.PSS2_ST__LSMAX:
            unsetLsmax();
            return;
        case CimPackage.PSS2_ST__LSMIN:
            unsetLsmin();
            return;
        case CimPackage.PSS2_ST__T1:
            unsetT1();
            return;
        case CimPackage.PSS2_ST__T10:
            unsetT10();
            return;
        case CimPackage.PSS2_ST__T2:
            unsetT2();
            return;
        case CimPackage.PSS2_ST__T3:
            unsetT3();
            return;
        case CimPackage.PSS2_ST__T4:
            unsetT4();
            return;
        case CimPackage.PSS2_ST__T5:
            unsetT5();
            return;
        case CimPackage.PSS2_ST__T6:
            unsetT6();
            return;
        case CimPackage.PSS2_ST__T7:
            unsetT7();
            return;
        case CimPackage.PSS2_ST__T8:
            unsetT8();
            return;
        case CimPackage.PSS2_ST__T9:
            unsetT9();
            return;
        case CimPackage.PSS2_ST__VCL:
            unsetVcl();
            return;
        case CimPackage.PSS2_ST__VCU:
            unsetVcu();
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
        case CimPackage.PSS2_ST__INPUT_SIGNAL1_TYPE:
            return isSetInputSignal1Type();
        case CimPackage.PSS2_ST__INPUT_SIGNAL2_TYPE:
            return isSetInputSignal2Type();
        case CimPackage.PSS2_ST__K1:
            return isSetK1();
        case CimPackage.PSS2_ST__K2:
            return isSetK2();
        case CimPackage.PSS2_ST__LSMAX:
            return isSetLsmax();
        case CimPackage.PSS2_ST__LSMIN:
            return isSetLsmin();
        case CimPackage.PSS2_ST__T1:
            return isSetT1();
        case CimPackage.PSS2_ST__T10:
            return isSetT10();
        case CimPackage.PSS2_ST__T2:
            return isSetT2();
        case CimPackage.PSS2_ST__T3:
            return isSetT3();
        case CimPackage.PSS2_ST__T4:
            return isSetT4();
        case CimPackage.PSS2_ST__T5:
            return isSetT5();
        case CimPackage.PSS2_ST__T6:
            return isSetT6();
        case CimPackage.PSS2_ST__T7:
            return isSetT7();
        case CimPackage.PSS2_ST__T8:
            return isSetT8();
        case CimPackage.PSS2_ST__T9:
            return isSetT9();
        case CimPackage.PSS2_ST__VCL:
            return isSetVcl();
        case CimPackage.PSS2_ST__VCU:
            return isSetVcu();
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
        result.append( " (inputSignal1Type: " );
        if( inputSignal1TypeESet )
            result.append( inputSignal1Type );
        else
            result.append( "<unset>" );
        result.append( ", inputSignal2Type: " );
        if( inputSignal2TypeESet )
            result.append( inputSignal2Type );
        else
            result.append( "<unset>" );
        result.append( ", k1: " );
        if( k1ESet )
            result.append( k1 );
        else
            result.append( "<unset>" );
        result.append( ", k2: " );
        if( k2ESet )
            result.append( k2 );
        else
            result.append( "<unset>" );
        result.append( ", lsmax: " );
        if( lsmaxESet )
            result.append( lsmax );
        else
            result.append( "<unset>" );
        result.append( ", lsmin: " );
        if( lsminESet )
            result.append( lsmin );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", t10: " );
        if( t10ESet )
            result.append( t10 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t5: " );
        if( t5ESet )
            result.append( t5 );
        else
            result.append( "<unset>" );
        result.append( ", t6: " );
        if( t6ESet )
            result.append( t6 );
        else
            result.append( "<unset>" );
        result.append( ", t7: " );
        if( t7ESet )
            result.append( t7 );
        else
            result.append( "<unset>" );
        result.append( ", t8: " );
        if( t8ESet )
            result.append( t8 );
        else
            result.append( "<unset>" );
        result.append( ", t9: " );
        if( t9ESet )
            result.append( t9 );
        else
            result.append( "<unset>" );
        result.append( ", vcl: " );
        if( vclESet )
            result.append( vcl );
        else
            result.append( "<unset>" );
        result.append( ", vcu: " );
        if( vcuESet )
            result.append( vcu );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //Pss2STImpl
