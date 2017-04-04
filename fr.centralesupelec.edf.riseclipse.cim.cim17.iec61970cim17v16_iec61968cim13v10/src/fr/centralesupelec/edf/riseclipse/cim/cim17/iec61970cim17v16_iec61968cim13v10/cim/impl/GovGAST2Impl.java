/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov GAST2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getA <em>A</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getAf1 <em>Af1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getAf2 <em>Af2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getBf1 <em>Bf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getBf2 <em>Bf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getC <em>C</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getCf2 <em>Cf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getEcr <em>Ecr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getEtd <em>Etd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getK4 <em>K4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getK5 <em>K5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getK6 <em>K6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getT <em>T</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTcd <em>Tcd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTmax <em>Tmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTmin <em>Tmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTrate <em>Trate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getTt <em>Tt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getW <em>W</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getY <em>Y</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST2Impl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovGAST2Impl extends TurbineGovernorDynamicsImpl implements GovGAST2 {
    /**
     * The default value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected static final Float A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA() <em>A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA()
     * @generated
     * @ordered
     */
    protected Float a = A_EDEFAULT;

    /**
     * This is true if the A attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aESet;

    /**
     * The default value of the '{@link #getAf1() <em>Af1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf1()
     * @generated
     * @ordered
     */
    protected static final Float AF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAf1() <em>Af1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf1()
     * @generated
     * @ordered
     */
    protected Float af1 = AF1_EDEFAULT;

    /**
     * This is true if the Af1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean af1ESet;

    /**
     * The default value of the '{@link #getAf2() <em>Af2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf2()
     * @generated
     * @ordered
     */
    protected static final Float AF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAf2() <em>Af2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAf2()
     * @generated
     * @ordered
     */
    protected Float af2 = AF2_EDEFAULT;

    /**
     * This is true if the Af2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean af2ESet;

    /**
     * The default value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected static final Float B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected Float b = B_EDEFAULT;

    /**
     * This is true if the B attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bESet;

    /**
     * The default value of the '{@link #getBf1() <em>Bf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf1()
     * @generated
     * @ordered
     */
    protected static final Float BF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBf1() <em>Bf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf1()
     * @generated
     * @ordered
     */
    protected Float bf1 = BF1_EDEFAULT;

    /**
     * This is true if the Bf1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bf1ESet;

    /**
     * The default value of the '{@link #getBf2() <em>Bf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf2()
     * @generated
     * @ordered
     */
    protected static final Float BF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBf2() <em>Bf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBf2()
     * @generated
     * @ordered
     */
    protected Float bf2 = BF2_EDEFAULT;

    /**
     * This is true if the Bf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bf2ESet;

    /**
     * The default value of the '{@link #getC() <em>C</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC()
     * @generated
     * @ordered
     */
    protected static final Float C_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC() <em>C</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC()
     * @generated
     * @ordered
     */
    protected Float c = C_EDEFAULT;

    /**
     * This is true if the C attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cESet;

    /**
     * The default value of the '{@link #getCf2() <em>Cf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCf2()
     * @generated
     * @ordered
     */
    protected static final Float CF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCf2() <em>Cf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCf2()
     * @generated
     * @ordered
     */
    protected Float cf2 = CF2_EDEFAULT;

    /**
     * This is true if the Cf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cf2ESet;

    /**
     * The default value of the '{@link #getEcr() <em>Ecr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEcr()
     * @generated
     * @ordered
     */
    protected static final Float ECR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEcr() <em>Ecr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEcr()
     * @generated
     * @ordered
     */
    protected Float ecr = ECR_EDEFAULT;

    /**
     * This is true if the Ecr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ecrESet;

    /**
     * The default value of the '{@link #getEtd() <em>Etd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEtd()
     * @generated
     * @ordered
     */
    protected static final Float ETD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEtd() <em>Etd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEtd()
     * @generated
     * @ordered
     */
    protected Float etd = ETD_EDEFAULT;

    /**
     * This is true if the Etd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean etdESet;

    /**
     * The default value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected static final Float K3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected Float k3 = K3_EDEFAULT;

    /**
     * This is true if the K3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k3ESet;

    /**
     * The default value of the '{@link #getK4() <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK4()
     * @generated
     * @ordered
     */
    protected static final Float K4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK4() <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK4()
     * @generated
     * @ordered
     */
    protected Float k4 = K4_EDEFAULT;

    /**
     * This is true if the K4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k4ESet;

    /**
     * The default value of the '{@link #getK5() <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK5()
     * @generated
     * @ordered
     */
    protected static final Float K5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK5() <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK5()
     * @generated
     * @ordered
     */
    protected Float k5 = K5_EDEFAULT;

    /**
     * This is true if the K5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k5ESet;

    /**
     * The default value of the '{@link #getK6() <em>K6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK6()
     * @generated
     * @ordered
     */
    protected static final Float K6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK6() <em>K6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK6()
     * @generated
     * @ordered
     */
    protected Float k6 = K6_EDEFAULT;

    /**
     * This is true if the K6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k6ESet;

    /**
     * The default value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected static final Float KF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected Float kf = KF_EDEFAULT;

    /**
     * This is true if the Kf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kfESet;

    /**
     * The default value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected static final Float MWBASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected Float mwbase = MWBASE_EDEFAULT;

    /**
     * This is true if the Mwbase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwbaseESet;

    /**
     * The default value of the '{@link #getT() <em>T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT()
     * @generated
     * @ordered
     */
    protected static final Float T_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT() <em>T</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT()
     * @generated
     * @ordered
     */
    protected Float t = T_EDEFAULT;

    /**
     * This is true if the T attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tESet;

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
     * The default value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected static final Float TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected Float tc = TC_EDEFAULT;

    /**
     * This is true if the Tc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcESet;

    /**
     * The default value of the '{@link #getTcd() <em>Tcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcd()
     * @generated
     * @ordered
     */
    protected static final Float TCD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTcd() <em>Tcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcd()
     * @generated
     * @ordered
     */
    protected Float tcd = TCD_EDEFAULT;

    /**
     * This is true if the Tcd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcdESet;

    /**
     * The default value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected static final Float TF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected Float tf = TF_EDEFAULT;

    /**
     * This is true if the Tf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfESet;

    /**
     * The default value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmax()
     * @generated
     * @ordered
     */
    protected static final Float TMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTmax() <em>Tmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmax()
     * @generated
     * @ordered
     */
    protected Float tmax = TMAX_EDEFAULT;

    /**
     * This is true if the Tmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tmaxESet;

    /**
     * The default value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmin()
     * @generated
     * @ordered
     */
    protected static final Float TMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTmin() <em>Tmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmin()
     * @generated
     * @ordered
     */
    protected Float tmin = TMIN_EDEFAULT;

    /**
     * This is true if the Tmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tminESet;

    /**
     * The default value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected static final Float TR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected Float tr = TR_EDEFAULT;

    /**
     * This is true if the Tr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trESet;

    /**
     * The default value of the '{@link #getTrate() <em>Trate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrate()
     * @generated
     * @ordered
     */
    protected static final Float TRATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrate() <em>Trate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrate()
     * @generated
     * @ordered
     */
    protected Float trate = TRATE_EDEFAULT;

    /**
     * This is true if the Trate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trateESet;

    /**
     * The default value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected static final Float TT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected Float tt = TT_EDEFAULT;

    /**
     * This is true if the Tt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ttESet;

    /**
     * The default value of the '{@link #getW() <em>W</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getW()
     * @generated
     * @ordered
     */
    protected static final Float W_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getW() <em>W</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getW()
     * @generated
     * @ordered
     */
    protected Float w = W_EDEFAULT;

    /**
     * This is true if the W attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected static final Float Y_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY()
     * @generated
     * @ordered
     */
    protected Float y = Y_EDEFAULT;

    /**
     * This is true if the Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean yESet;

    /**
     * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZ()
     * @generated
     * @ordered
     */
    protected static final Boolean Z_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZ()
     * @generated
     * @ordered
     */
    protected Boolean z = Z_EDEFAULT;

    /**
     * This is true if the Z attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovGAST2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovGAST2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getA() {
        return a;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA( Float newA ) {
        Float oldA = a;
        a = newA;
        boolean oldAESet = aESet;
        aESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__A, oldA, a, !oldAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA() {
        Float oldA = a;
        boolean oldAESet = aESet;
        a = A_EDEFAULT;
        aESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__A,
                oldA, A_EDEFAULT, oldAESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA() {
        return aESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAf1() {
        return af1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAf1( Float newAf1 ) {
        Float oldAf1 = af1;
        af1 = newAf1;
        boolean oldAf1ESet = af1ESet;
        af1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__AF1, oldAf1, af1, !oldAf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAf1() {
        Float oldAf1 = af1;
        boolean oldAf1ESet = af1ESet;
        af1 = AF1_EDEFAULT;
        af1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__AF1, oldAf1, AF1_EDEFAULT, oldAf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAf1() {
        return af1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAf2() {
        return af2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAf2( Float newAf2 ) {
        Float oldAf2 = af2;
        af2 = newAf2;
        boolean oldAf2ESet = af2ESet;
        af2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__AF2, oldAf2, af2, !oldAf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAf2() {
        Float oldAf2 = af2;
        boolean oldAf2ESet = af2ESet;
        af2 = AF2_EDEFAULT;
        af2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__AF2, oldAf2, AF2_EDEFAULT, oldAf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAf2() {
        return af2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB() {
        return b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB( Float newB ) {
        Float oldB = b;
        b = newB;
        boolean oldBESet = bESet;
        bESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__B, oldB, b, !oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB() {
        Float oldB = b;
        boolean oldBESet = bESet;
        b = B_EDEFAULT;
        bESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__B,
                oldB, B_EDEFAULT, oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB() {
        return bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBf1() {
        return bf1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBf1( Float newBf1 ) {
        Float oldBf1 = bf1;
        bf1 = newBf1;
        boolean oldBf1ESet = bf1ESet;
        bf1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__BF1, oldBf1, bf1, !oldBf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBf1() {
        Float oldBf1 = bf1;
        boolean oldBf1ESet = bf1ESet;
        bf1 = BF1_EDEFAULT;
        bf1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__BF1, oldBf1, BF1_EDEFAULT, oldBf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBf1() {
        return bf1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBf2() {
        return bf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBf2( Float newBf2 ) {
        Float oldBf2 = bf2;
        bf2 = newBf2;
        boolean oldBf2ESet = bf2ESet;
        bf2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__BF2, oldBf2, bf2, !oldBf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBf2() {
        Float oldBf2 = bf2;
        boolean oldBf2ESet = bf2ESet;
        bf2 = BF2_EDEFAULT;
        bf2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__BF2, oldBf2, BF2_EDEFAULT, oldBf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBf2() {
        return bf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getC() {
        return c;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setC( Float newC ) {
        Float oldC = c;
        c = newC;
        boolean oldCESet = cESet;
        cESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__C, oldC, c, !oldCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetC() {
        Float oldC = c;
        boolean oldCESet = cESet;
        c = C_EDEFAULT;
        cESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__C,
                oldC, C_EDEFAULT, oldCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetC() {
        return cESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCf2() {
        return cf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCf2( Float newCf2 ) {
        Float oldCf2 = cf2;
        cf2 = newCf2;
        boolean oldCf2ESet = cf2ESet;
        cf2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__CF2, oldCf2, cf2, !oldCf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCf2() {
        Float oldCf2 = cf2;
        boolean oldCf2ESet = cf2ESet;
        cf2 = CF2_EDEFAULT;
        cf2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__CF2, oldCf2, CF2_EDEFAULT, oldCf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCf2() {
        return cf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEcr() {
        return ecr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEcr( Float newEcr ) {
        Float oldEcr = ecr;
        ecr = newEcr;
        boolean oldEcrESet = ecrESet;
        ecrESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__ECR, oldEcr, ecr, !oldEcrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEcr() {
        Float oldEcr = ecr;
        boolean oldEcrESet = ecrESet;
        ecr = ECR_EDEFAULT;
        ecrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__ECR, oldEcr, ECR_EDEFAULT, oldEcrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEcr() {
        return ecrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEtd() {
        return etd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEtd( Float newEtd ) {
        Float oldEtd = etd;
        etd = newEtd;
        boolean oldEtdESet = etdESet;
        etdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__ETD, oldEtd, etd, !oldEtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEtd() {
        Float oldEtd = etd;
        boolean oldEtdESet = etdESet;
        etd = ETD_EDEFAULT;
        etdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__ETD, oldEtd, ETD_EDEFAULT, oldEtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEtd() {
        return etdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getK3() {
        return k3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK3( Float newK3 ) {
        Float oldK3 = k3;
        k3 = newK3;
        boolean oldK3ESet = k3ESet;
        k3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__K3, oldK3, k3, !oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK3() {
        Float oldK3 = k3;
        boolean oldK3ESet = k3ESet;
        k3 = K3_EDEFAULT;
        k3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__K3, oldK3, K3_EDEFAULT, oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK3() {
        return k3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getK4() {
        return k4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK4( Float newK4 ) {
        Float oldK4 = k4;
        k4 = newK4;
        boolean oldK4ESet = k4ESet;
        k4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__K4, oldK4, k4, !oldK4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK4() {
        Float oldK4 = k4;
        boolean oldK4ESet = k4ESet;
        k4 = K4_EDEFAULT;
        k4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__K4, oldK4, K4_EDEFAULT, oldK4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK4() {
        return k4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getK5() {
        return k5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK5( Float newK5 ) {
        Float oldK5 = k5;
        k5 = newK5;
        boolean oldK5ESet = k5ESet;
        k5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__K5, oldK5, k5, !oldK5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK5() {
        Float oldK5 = k5;
        boolean oldK5ESet = k5ESet;
        k5 = K5_EDEFAULT;
        k5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__K5, oldK5, K5_EDEFAULT, oldK5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK5() {
        return k5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getK6() {
        return k6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK6( Float newK6 ) {
        Float oldK6 = k6;
        k6 = newK6;
        boolean oldK6ESet = k6ESet;
        k6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__K6, oldK6, k6, !oldK6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK6() {
        Float oldK6 = k6;
        boolean oldK6ESet = k6ESet;
        k6 = K6_EDEFAULT;
        k6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__K6, oldK6, K6_EDEFAULT, oldK6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK6() {
        return k6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKf() {
        return kf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf( Float newKf ) {
        Float oldKf = kf;
        kf = newKf;
        boolean oldKfESet = kfESet;
        kfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__KF, oldKf, kf, !oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf() {
        Float oldKf = kf;
        boolean oldKfESet = kfESet;
        kf = KF_EDEFAULT;
        kfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__KF, oldKf, KF_EDEFAULT, oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf() {
        return kfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMwbase() {
        return mwbase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwbase( Float newMwbase ) {
        Float oldMwbase = mwbase;
        mwbase = newMwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST2__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwbase() {
        Float oldMwbase = mwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbase = MWBASE_EDEFAULT;
        mwbaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwbase() {
        return mwbaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getT() {
        return t;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT( Float newT ) {
        Float oldT = t;
        t = newT;
        boolean oldTESet = tESet;
        tESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__T, oldT, t, !oldTESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT() {
        Float oldT = t;
        boolean oldTESet = tESet;
        t = T_EDEFAULT;
        tESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__T,
                oldT, T_EDEFAULT, oldTESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT() {
        return tESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__T3, oldT3, t3, !oldT3ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__T3, oldT3, T3_EDEFAULT, oldT3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__T4, oldT4, t4, !oldT4ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__T4, oldT4, T4_EDEFAULT, oldT4ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__T5, oldT5, t5, !oldT5ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__T5, oldT5, T5_EDEFAULT, oldT5ESet ) );
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
    public Float getTc() {
        return tc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc( Float newTc ) {
        Float oldTc = tc;
        tc = newTc;
        boolean oldTcESet = tcESet;
        tcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__TC, oldTc, tc, !oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc() {
        Float oldTc = tc;
        boolean oldTcESet = tcESet;
        tc = TC_EDEFAULT;
        tcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TC, oldTc, TC_EDEFAULT, oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc() {
        return tcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTcd() {
        return tcd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTcd( Float newTcd ) {
        Float oldTcd = tcd;
        tcd = newTcd;
        boolean oldTcdESet = tcdESet;
        tcdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__TCD, oldTcd, tcd, !oldTcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTcd() {
        Float oldTcd = tcd;
        boolean oldTcdESet = tcdESet;
        tcd = TCD_EDEFAULT;
        tcdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TCD, oldTcd, TCD_EDEFAULT, oldTcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTcd() {
        return tcdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTf() {
        return tf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf( Float newTf ) {
        Float oldTf = tf;
        tf = newTf;
        boolean oldTfESet = tfESet;
        tfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__TF, oldTf, tf, !oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf() {
        Float oldTf = tf;
        boolean oldTfESet = tfESet;
        tf = TF_EDEFAULT;
        tfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TF, oldTf, TF_EDEFAULT, oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf() {
        return tfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTmax() {
        return tmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTmax( Float newTmax ) {
        Float oldTmax = tmax;
        tmax = newTmax;
        boolean oldTmaxESet = tmaxESet;
        tmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST2__TMAX, oldTmax, tmax, !oldTmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTmax() {
        Float oldTmax = tmax;
        boolean oldTmaxESet = tmaxESet;
        tmax = TMAX_EDEFAULT;
        tmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TMAX, oldTmax, TMAX_EDEFAULT, oldTmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTmax() {
        return tmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTmin() {
        return tmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTmin( Float newTmin ) {
        Float oldTmin = tmin;
        tmin = newTmin;
        boolean oldTminESet = tminESet;
        tminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST2__TMIN, oldTmin, tmin, !oldTminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTmin() {
        Float oldTmin = tmin;
        boolean oldTminESet = tminESet;
        tmin = TMIN_EDEFAULT;
        tminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TMIN, oldTmin, TMIN_EDEFAULT, oldTminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTmin() {
        return tminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTr() {
        return tr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTr( Float newTr ) {
        Float oldTr = tr;
        tr = newTr;
        boolean oldTrESet = trESet;
        trESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__TR, oldTr, tr, !oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTr() {
        Float oldTr = tr;
        boolean oldTrESet = trESet;
        tr = TR_EDEFAULT;
        trESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TR, oldTr, TR_EDEFAULT, oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTr() {
        return trESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTrate() {
        return trate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTrate( Float newTrate ) {
        Float oldTrate = trate;
        trate = newTrate;
        boolean oldTrateESet = trateESet;
        trateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST2__TRATE, oldTrate, trate, !oldTrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTrate() {
        Float oldTrate = trate;
        boolean oldTrateESet = trateESet;
        trate = TRATE_EDEFAULT;
        trateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TRATE, oldTrate, TRATE_EDEFAULT, oldTrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTrate() {
        return trateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTt() {
        return tt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTt( Float newTt ) {
        Float oldTt = tt;
        tt = newTt;
        boolean oldTtESet = ttESet;
        ttESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__TT, oldTt, tt, !oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTt() {
        Float oldTt = tt;
        boolean oldTtESet = ttESet;
        tt = TT_EDEFAULT;
        ttESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST2__TT, oldTt, TT_EDEFAULT, oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTt() {
        return ttESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getW() {
        return w;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setW( Float newW ) {
        Float oldW = w;
        w = newW;
        boolean oldWESet = wESet;
        wESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__W, oldW, w, !oldWESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetW() {
        Float oldW = w;
        boolean oldWESet = wESet;
        w = W_EDEFAULT;
        wESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__W,
                oldW, W_EDEFAULT, oldWESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetW() {
        return wESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__X,
                oldX, X_EDEFAULT, oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getY() {
        return y;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY( Float newY ) {
        Float oldY = y;
        y = newY;
        boolean oldYESet = yESet;
        yESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__Y, oldY, y, !oldYESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY() {
        Float oldY = y;
        boolean oldYESet = yESet;
        y = Y_EDEFAULT;
        yESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__Y,
                oldY, Y_EDEFAULT, oldYESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY() {
        return yESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getZ() {
        return z;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZ( Boolean newZ ) {
        Boolean oldZ = z;
        z = newZ;
        boolean oldZESet = zESet;
        zESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST2__Z, oldZ, z, !oldZESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZ() {
        Boolean oldZ = z;
        boolean oldZESet = zESet;
        z = Z_EDEFAULT;
        zESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST2__Z,
                oldZ, Z_EDEFAULT, oldZESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZ() {
        return zESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_GAST2__A:
            return getA();
        case CimPackage.GOV_GAST2__AF1:
            return getAf1();
        case CimPackage.GOV_GAST2__AF2:
            return getAf2();
        case CimPackage.GOV_GAST2__B:
            return getB();
        case CimPackage.GOV_GAST2__BF1:
            return getBf1();
        case CimPackage.GOV_GAST2__BF2:
            return getBf2();
        case CimPackage.GOV_GAST2__C:
            return getC();
        case CimPackage.GOV_GAST2__CF2:
            return getCf2();
        case CimPackage.GOV_GAST2__ECR:
            return getEcr();
        case CimPackage.GOV_GAST2__ETD:
            return getEtd();
        case CimPackage.GOV_GAST2__K3:
            return getK3();
        case CimPackage.GOV_GAST2__K4:
            return getK4();
        case CimPackage.GOV_GAST2__K5:
            return getK5();
        case CimPackage.GOV_GAST2__K6:
            return getK6();
        case CimPackage.GOV_GAST2__KF:
            return getKf();
        case CimPackage.GOV_GAST2__MWBASE:
            return getMwbase();
        case CimPackage.GOV_GAST2__T:
            return getT();
        case CimPackage.GOV_GAST2__T3:
            return getT3();
        case CimPackage.GOV_GAST2__T4:
            return getT4();
        case CimPackage.GOV_GAST2__T5:
            return getT5();
        case CimPackage.GOV_GAST2__TC:
            return getTc();
        case CimPackage.GOV_GAST2__TCD:
            return getTcd();
        case CimPackage.GOV_GAST2__TF:
            return getTf();
        case CimPackage.GOV_GAST2__TMAX:
            return getTmax();
        case CimPackage.GOV_GAST2__TMIN:
            return getTmin();
        case CimPackage.GOV_GAST2__TR:
            return getTr();
        case CimPackage.GOV_GAST2__TRATE:
            return getTrate();
        case CimPackage.GOV_GAST2__TT:
            return getTt();
        case CimPackage.GOV_GAST2__W:
            return getW();
        case CimPackage.GOV_GAST2__X:
            return getX();
        case CimPackage.GOV_GAST2__Y:
            return getY();
        case CimPackage.GOV_GAST2__Z:
            return getZ();
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
        case CimPackage.GOV_GAST2__A:
            setA( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__AF1:
            setAf1( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__AF2:
            setAf2( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__B:
            setB( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__BF1:
            setBf1( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__BF2:
            setBf2( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__C:
            setC( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__CF2:
            setCf2( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__ECR:
            setEcr( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__ETD:
            setEtd( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__K3:
            setK3( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__K4:
            setK4( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__K5:
            setK5( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__K6:
            setK6( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__T:
            setT( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__T3:
            setT3( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__T4:
            setT4( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__T5:
            setT5( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TCD:
            setTcd( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TF:
            setTf( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TMAX:
            setTmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TMIN:
            setTmin( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TR:
            setTr( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TRATE:
            setTrate( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__TT:
            setTt( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__W:
            setW( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__Y:
            setY( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST2__Z:
            setZ( ( Boolean ) newValue );
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
        case CimPackage.GOV_GAST2__A:
            unsetA();
            return;
        case CimPackage.GOV_GAST2__AF1:
            unsetAf1();
            return;
        case CimPackage.GOV_GAST2__AF2:
            unsetAf2();
            return;
        case CimPackage.GOV_GAST2__B:
            unsetB();
            return;
        case CimPackage.GOV_GAST2__BF1:
            unsetBf1();
            return;
        case CimPackage.GOV_GAST2__BF2:
            unsetBf2();
            return;
        case CimPackage.GOV_GAST2__C:
            unsetC();
            return;
        case CimPackage.GOV_GAST2__CF2:
            unsetCf2();
            return;
        case CimPackage.GOV_GAST2__ECR:
            unsetEcr();
            return;
        case CimPackage.GOV_GAST2__ETD:
            unsetEtd();
            return;
        case CimPackage.GOV_GAST2__K3:
            unsetK3();
            return;
        case CimPackage.GOV_GAST2__K4:
            unsetK4();
            return;
        case CimPackage.GOV_GAST2__K5:
            unsetK5();
            return;
        case CimPackage.GOV_GAST2__K6:
            unsetK6();
            return;
        case CimPackage.GOV_GAST2__KF:
            unsetKf();
            return;
        case CimPackage.GOV_GAST2__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_GAST2__T:
            unsetT();
            return;
        case CimPackage.GOV_GAST2__T3:
            unsetT3();
            return;
        case CimPackage.GOV_GAST2__T4:
            unsetT4();
            return;
        case CimPackage.GOV_GAST2__T5:
            unsetT5();
            return;
        case CimPackage.GOV_GAST2__TC:
            unsetTc();
            return;
        case CimPackage.GOV_GAST2__TCD:
            unsetTcd();
            return;
        case CimPackage.GOV_GAST2__TF:
            unsetTf();
            return;
        case CimPackage.GOV_GAST2__TMAX:
            unsetTmax();
            return;
        case CimPackage.GOV_GAST2__TMIN:
            unsetTmin();
            return;
        case CimPackage.GOV_GAST2__TR:
            unsetTr();
            return;
        case CimPackage.GOV_GAST2__TRATE:
            unsetTrate();
            return;
        case CimPackage.GOV_GAST2__TT:
            unsetTt();
            return;
        case CimPackage.GOV_GAST2__W:
            unsetW();
            return;
        case CimPackage.GOV_GAST2__X:
            unsetX();
            return;
        case CimPackage.GOV_GAST2__Y:
            unsetY();
            return;
        case CimPackage.GOV_GAST2__Z:
            unsetZ();
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
        case CimPackage.GOV_GAST2__A:
            return isSetA();
        case CimPackage.GOV_GAST2__AF1:
            return isSetAf1();
        case CimPackage.GOV_GAST2__AF2:
            return isSetAf2();
        case CimPackage.GOV_GAST2__B:
            return isSetB();
        case CimPackage.GOV_GAST2__BF1:
            return isSetBf1();
        case CimPackage.GOV_GAST2__BF2:
            return isSetBf2();
        case CimPackage.GOV_GAST2__C:
            return isSetC();
        case CimPackage.GOV_GAST2__CF2:
            return isSetCf2();
        case CimPackage.GOV_GAST2__ECR:
            return isSetEcr();
        case CimPackage.GOV_GAST2__ETD:
            return isSetEtd();
        case CimPackage.GOV_GAST2__K3:
            return isSetK3();
        case CimPackage.GOV_GAST2__K4:
            return isSetK4();
        case CimPackage.GOV_GAST2__K5:
            return isSetK5();
        case CimPackage.GOV_GAST2__K6:
            return isSetK6();
        case CimPackage.GOV_GAST2__KF:
            return isSetKf();
        case CimPackage.GOV_GAST2__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_GAST2__T:
            return isSetT();
        case CimPackage.GOV_GAST2__T3:
            return isSetT3();
        case CimPackage.GOV_GAST2__T4:
            return isSetT4();
        case CimPackage.GOV_GAST2__T5:
            return isSetT5();
        case CimPackage.GOV_GAST2__TC:
            return isSetTc();
        case CimPackage.GOV_GAST2__TCD:
            return isSetTcd();
        case CimPackage.GOV_GAST2__TF:
            return isSetTf();
        case CimPackage.GOV_GAST2__TMAX:
            return isSetTmax();
        case CimPackage.GOV_GAST2__TMIN:
            return isSetTmin();
        case CimPackage.GOV_GAST2__TR:
            return isSetTr();
        case CimPackage.GOV_GAST2__TRATE:
            return isSetTrate();
        case CimPackage.GOV_GAST2__TT:
            return isSetTt();
        case CimPackage.GOV_GAST2__W:
            return isSetW();
        case CimPackage.GOV_GAST2__X:
            return isSetX();
        case CimPackage.GOV_GAST2__Y:
            return isSetY();
        case CimPackage.GOV_GAST2__Z:
            return isSetZ();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (a: " );
        if( aESet )
            result.append( a );
        else
            result.append( "<unset>" );
        result.append( ", af1: " );
        if( af1ESet )
            result.append( af1 );
        else
            result.append( "<unset>" );
        result.append( ", af2: " );
        if( af2ESet )
            result.append( af2 );
        else
            result.append( "<unset>" );
        result.append( ", b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", bf1: " );
        if( bf1ESet )
            result.append( bf1 );
        else
            result.append( "<unset>" );
        result.append( ", bf2: " );
        if( bf2ESet )
            result.append( bf2 );
        else
            result.append( "<unset>" );
        result.append( ", c: " );
        if( cESet )
            result.append( c );
        else
            result.append( "<unset>" );
        result.append( ", cf2: " );
        if( cf2ESet )
            result.append( cf2 );
        else
            result.append( "<unset>" );
        result.append( ", ecr: " );
        if( ecrESet )
            result.append( ecr );
        else
            result.append( "<unset>" );
        result.append( ", etd: " );
        if( etdESet )
            result.append( etd );
        else
            result.append( "<unset>" );
        result.append( ", k3: " );
        if( k3ESet )
            result.append( k3 );
        else
            result.append( "<unset>" );
        result.append( ", k4: " );
        if( k4ESet )
            result.append( k4 );
        else
            result.append( "<unset>" );
        result.append( ", k5: " );
        if( k5ESet )
            result.append( k5 );
        else
            result.append( "<unset>" );
        result.append( ", k6: " );
        if( k6ESet )
            result.append( k6 );
        else
            result.append( "<unset>" );
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", t: " );
        if( tESet )
            result.append( t );
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
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", tcd: " );
        if( tcdESet )
            result.append( tcd );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", tmax: " );
        if( tmaxESet )
            result.append( tmax );
        else
            result.append( "<unset>" );
        result.append( ", tmin: " );
        if( tminESet )
            result.append( tmin );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", trate: " );
        if( trateESet )
            result.append( trate );
        else
            result.append( "<unset>" );
        result.append( ", tt: " );
        if( ttESet )
            result.append( tt );
        else
            result.append( "<unset>" );
        result.append( ", w: " );
        if( wESet )
            result.append( w );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", y: " );
        if( yESet )
            result.append( y );
        else
            result.append( "<unset>" );
        result.append( ", z: " );
        if( zESet )
            result.append( z );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovGAST2Impl
