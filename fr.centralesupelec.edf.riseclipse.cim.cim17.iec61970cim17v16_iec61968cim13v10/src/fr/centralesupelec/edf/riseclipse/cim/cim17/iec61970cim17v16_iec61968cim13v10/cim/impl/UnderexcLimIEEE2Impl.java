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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underexc Lim IEEE2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getKfb <em>Kfb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getKuf <em>Kuf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getKul <em>Kul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP0 <em>P0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP1 <em>P1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP10 <em>P10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP2 <em>P2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP3 <em>P3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP4 <em>P4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP5 <em>P5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP6 <em>P6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP7 <em>P7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP8 <em>P8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getP9 <em>P9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ0 <em>Q0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ1 <em>Q1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ10 <em>Q10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ2 <em>Q2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ3 <em>Q3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ4 <em>Q4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ5 <em>Q5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ6 <em>Q6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ7 <em>Q7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ8 <em>Q8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getQ9 <em>Q9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTu1 <em>Tu1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTu2 <em>Tu2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTu3 <em>Tu3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTu4 <em>Tu4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTul <em>Tul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTup <em>Tup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTuq <em>Tuq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getTuv <em>Tuv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getVuimin <em>Vuimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getVulmax <em>Vulmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLimIEEE2Impl#getVulmin <em>Vulmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnderexcLimIEEE2Impl extends UnderexcitationLimiterDynamicsImpl implements UnderexcLimIEEE2 {
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
     * The default value of the '{@link #getKfb() <em>Kfb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKfb()
     * @generated
     * @ordered
     */
    protected static final Float KFB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKfb() <em>Kfb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKfb()
     * @generated
     * @ordered
     */
    protected Float kfb = KFB_EDEFAULT;

    /**
     * This is true if the Kfb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kfbESet;

    /**
     * The default value of the '{@link #getKuf() <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKuf()
     * @generated
     * @ordered
     */
    protected static final Float KUF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKuf() <em>Kuf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKuf()
     * @generated
     * @ordered
     */
    protected Float kuf = KUF_EDEFAULT;

    /**
     * This is true if the Kuf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kufESet;

    /**
     * The default value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected static final Float KUI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected Float kui = KUI_EDEFAULT;

    /**
     * This is true if the Kui attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kuiESet;

    /**
     * The default value of the '{@link #getKul() <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKul()
     * @generated
     * @ordered
     */
    protected static final Float KUL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKul() <em>Kul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKul()
     * @generated
     * @ordered
     */
    protected Float kul = KUL_EDEFAULT;

    /**
     * This is true if the Kul attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kulESet;

    /**
     * The default value of the '{@link #getP0() <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP0()
     * @generated
     * @ordered
     */
    protected static final Float P0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP0() <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP0()
     * @generated
     * @ordered
     */
    protected Float p0 = P0_EDEFAULT;

    /**
     * This is true if the P0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p0ESet;

    /**
     * The default value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected static final Float P1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected Float p1 = P1_EDEFAULT;

    /**
     * This is true if the P1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p1ESet;

    /**
     * The default value of the '{@link #getP10() <em>P10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP10()
     * @generated
     * @ordered
     */
    protected static final Float P10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP10() <em>P10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP10()
     * @generated
     * @ordered
     */
    protected Float p10 = P10_EDEFAULT;

    /**
     * This is true if the P10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p10ESet;

    /**
     * The default value of the '{@link #getP2() <em>P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP2()
     * @generated
     * @ordered
     */
    protected static final Float P2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP2() <em>P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP2()
     * @generated
     * @ordered
     */
    protected Float p2 = P2_EDEFAULT;

    /**
     * This is true if the P2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p2ESet;

    /**
     * The default value of the '{@link #getP3() <em>P3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP3()
     * @generated
     * @ordered
     */
    protected static final Float P3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP3() <em>P3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP3()
     * @generated
     * @ordered
     */
    protected Float p3 = P3_EDEFAULT;

    /**
     * This is true if the P3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p3ESet;

    /**
     * The default value of the '{@link #getP4() <em>P4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP4()
     * @generated
     * @ordered
     */
    protected static final Float P4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP4() <em>P4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP4()
     * @generated
     * @ordered
     */
    protected Float p4 = P4_EDEFAULT;

    /**
     * This is true if the P4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p4ESet;

    /**
     * The default value of the '{@link #getP5() <em>P5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP5()
     * @generated
     * @ordered
     */
    protected static final Float P5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP5() <em>P5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP5()
     * @generated
     * @ordered
     */
    protected Float p5 = P5_EDEFAULT;

    /**
     * This is true if the P5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p5ESet;

    /**
     * The default value of the '{@link #getP6() <em>P6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP6()
     * @generated
     * @ordered
     */
    protected static final Float P6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP6() <em>P6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP6()
     * @generated
     * @ordered
     */
    protected Float p6 = P6_EDEFAULT;

    /**
     * This is true if the P6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p6ESet;

    /**
     * The default value of the '{@link #getP7() <em>P7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP7()
     * @generated
     * @ordered
     */
    protected static final Float P7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP7() <em>P7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP7()
     * @generated
     * @ordered
     */
    protected Float p7 = P7_EDEFAULT;

    /**
     * This is true if the P7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p7ESet;

    /**
     * The default value of the '{@link #getP8() <em>P8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP8()
     * @generated
     * @ordered
     */
    protected static final Float P8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP8() <em>P8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP8()
     * @generated
     * @ordered
     */
    protected Float p8 = P8_EDEFAULT;

    /**
     * This is true if the P8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p8ESet;

    /**
     * The default value of the '{@link #getP9() <em>P9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP9()
     * @generated
     * @ordered
     */
    protected static final Float P9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP9() <em>P9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP9()
     * @generated
     * @ordered
     */
    protected Float p9 = P9_EDEFAULT;

    /**
     * This is true if the P9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p9ESet;

    /**
     * The default value of the '{@link #getQ0() <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ0()
     * @generated
     * @ordered
     */
    protected static final Float Q0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ0() <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ0()
     * @generated
     * @ordered
     */
    protected Float q0 = Q0_EDEFAULT;

    /**
     * This is true if the Q0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q0ESet;

    /**
     * The default value of the '{@link #getQ1() <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ1()
     * @generated
     * @ordered
     */
    protected static final Float Q1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ1() <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ1()
     * @generated
     * @ordered
     */
    protected Float q1 = Q1_EDEFAULT;

    /**
     * This is true if the Q1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q1ESet;

    /**
     * The default value of the '{@link #getQ10() <em>Q10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ10()
     * @generated
     * @ordered
     */
    protected static final Float Q10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ10() <em>Q10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ10()
     * @generated
     * @ordered
     */
    protected Float q10 = Q10_EDEFAULT;

    /**
     * This is true if the Q10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q10ESet;

    /**
     * The default value of the '{@link #getQ2() <em>Q2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ2()
     * @generated
     * @ordered
     */
    protected static final Float Q2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ2() <em>Q2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ2()
     * @generated
     * @ordered
     */
    protected Float q2 = Q2_EDEFAULT;

    /**
     * This is true if the Q2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q2ESet;

    /**
     * The default value of the '{@link #getQ3() <em>Q3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ3()
     * @generated
     * @ordered
     */
    protected static final Float Q3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ3() <em>Q3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ3()
     * @generated
     * @ordered
     */
    protected Float q3 = Q3_EDEFAULT;

    /**
     * This is true if the Q3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q3ESet;

    /**
     * The default value of the '{@link #getQ4() <em>Q4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ4()
     * @generated
     * @ordered
     */
    protected static final Float Q4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ4() <em>Q4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ4()
     * @generated
     * @ordered
     */
    protected Float q4 = Q4_EDEFAULT;

    /**
     * This is true if the Q4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q4ESet;

    /**
     * The default value of the '{@link #getQ5() <em>Q5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ5()
     * @generated
     * @ordered
     */
    protected static final Float Q5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ5() <em>Q5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ5()
     * @generated
     * @ordered
     */
    protected Float q5 = Q5_EDEFAULT;

    /**
     * This is true if the Q5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q5ESet;

    /**
     * The default value of the '{@link #getQ6() <em>Q6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ6()
     * @generated
     * @ordered
     */
    protected static final Float Q6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ6() <em>Q6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ6()
     * @generated
     * @ordered
     */
    protected Float q6 = Q6_EDEFAULT;

    /**
     * This is true if the Q6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q6ESet;

    /**
     * The default value of the '{@link #getQ7() <em>Q7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ7()
     * @generated
     * @ordered
     */
    protected static final Float Q7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ7() <em>Q7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ7()
     * @generated
     * @ordered
     */
    protected Float q7 = Q7_EDEFAULT;

    /**
     * This is true if the Q7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q7ESet;

    /**
     * The default value of the '{@link #getQ8() <em>Q8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ8()
     * @generated
     * @ordered
     */
    protected static final Float Q8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ8() <em>Q8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ8()
     * @generated
     * @ordered
     */
    protected Float q8 = Q8_EDEFAULT;

    /**
     * This is true if the Q8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q8ESet;

    /**
     * The default value of the '{@link #getQ9() <em>Q9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ9()
     * @generated
     * @ordered
     */
    protected static final Float Q9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ9() <em>Q9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ9()
     * @generated
     * @ordered
     */
    protected Float q9 = Q9_EDEFAULT;

    /**
     * This is true if the Q9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q9ESet;

    /**
     * The default value of the '{@link #getTu1() <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu1()
     * @generated
     * @ordered
     */
    protected static final Float TU1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu1() <em>Tu1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu1()
     * @generated
     * @ordered
     */
    protected Float tu1 = TU1_EDEFAULT;

    /**
     * This is true if the Tu1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu1ESet;

    /**
     * The default value of the '{@link #getTu2() <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu2()
     * @generated
     * @ordered
     */
    protected static final Float TU2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu2() <em>Tu2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu2()
     * @generated
     * @ordered
     */
    protected Float tu2 = TU2_EDEFAULT;

    /**
     * This is true if the Tu2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu2ESet;

    /**
     * The default value of the '{@link #getTu3() <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu3()
     * @generated
     * @ordered
     */
    protected static final Float TU3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu3() <em>Tu3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu3()
     * @generated
     * @ordered
     */
    protected Float tu3 = TU3_EDEFAULT;

    /**
     * This is true if the Tu3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu3ESet;

    /**
     * The default value of the '{@link #getTu4() <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu4()
     * @generated
     * @ordered
     */
    protected static final Float TU4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTu4() <em>Tu4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTu4()
     * @generated
     * @ordered
     */
    protected Float tu4 = TU4_EDEFAULT;

    /**
     * This is true if the Tu4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tu4ESet;

    /**
     * The default value of the '{@link #getTul() <em>Tul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTul()
     * @generated
     * @ordered
     */
    protected static final Float TUL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTul() <em>Tul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTul()
     * @generated
     * @ordered
     */
    protected Float tul = TUL_EDEFAULT;

    /**
     * This is true if the Tul attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tulESet;

    /**
     * The default value of the '{@link #getTup() <em>Tup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTup()
     * @generated
     * @ordered
     */
    protected static final Float TUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTup() <em>Tup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTup()
     * @generated
     * @ordered
     */
    protected Float tup = TUP_EDEFAULT;

    /**
     * This is true if the Tup attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tupESet;

    /**
     * The default value of the '{@link #getTuq() <em>Tuq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuq()
     * @generated
     * @ordered
     */
    protected static final Float TUQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuq() <em>Tuq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuq()
     * @generated
     * @ordered
     */
    protected Float tuq = TUQ_EDEFAULT;

    /**
     * This is true if the Tuq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuqESet;

    /**
     * The default value of the '{@link #getTuv() <em>Tuv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuv()
     * @generated
     * @ordered
     */
    protected static final Float TUV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTuv() <em>Tuv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTuv()
     * @generated
     * @ordered
     */
    protected Float tuv = TUV_EDEFAULT;

    /**
     * This is true if the Tuv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tuvESet;

    /**
     * The default value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected static final Float VUIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected Float vuimax = VUIMAX_EDEFAULT;

    /**
     * This is true if the Vuimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuimaxESet;

    /**
     * The default value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected static final Float VUIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected Float vuimin = VUIMIN_EDEFAULT;

    /**
     * This is true if the Vuimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuiminESet;

    /**
     * The default value of the '{@link #getVulmax() <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmax()
     * @generated
     * @ordered
     */
    protected static final Float VULMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVulmax() <em>Vulmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmax()
     * @generated
     * @ordered
     */
    protected Float vulmax = VULMAX_EDEFAULT;

    /**
     * This is true if the Vulmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vulmaxESet;

    /**
     * The default value of the '{@link #getVulmin() <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmin()
     * @generated
     * @ordered
     */
    protected static final Float VULMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVulmin() <em>Vulmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVulmin()
     * @generated
     * @ordered
     */
    protected Float vulmin = VULMIN_EDEFAULT;

    /**
     * This is true if the Vulmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vulminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnderexcLimIEEE2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUnderexcLimIEEE2();
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__K1, oldK1, k1, !oldK1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__K1, oldK1, K1_EDEFAULT, oldK1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__K2, oldK2, k2, !oldK2ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__K2, oldK2, K2_EDEFAULT, oldK2ESet ) );
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
    public Float getKfb() {
        return kfb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKfb( Float newKfb ) {
        Float oldKfb = kfb;
        kfb = newKfb;
        boolean oldKfbESet = kfbESet;
        kfbESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__KFB, oldKfb, kfb, !oldKfbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKfb() {
        Float oldKfb = kfb;
        boolean oldKfbESet = kfbESet;
        kfb = KFB_EDEFAULT;
        kfbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__KFB, oldKfb, KFB_EDEFAULT, oldKfbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKfb() {
        return kfbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKuf() {
        return kuf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKuf( Float newKuf ) {
        Float oldKuf = kuf;
        kuf = newKuf;
        boolean oldKufESet = kufESet;
        kufESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__KUF, oldKuf, kuf, !oldKufESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKuf() {
        Float oldKuf = kuf;
        boolean oldKufESet = kufESet;
        kuf = KUF_EDEFAULT;
        kufESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__KUF, oldKuf, KUF_EDEFAULT, oldKufESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKuf() {
        return kufESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKui() {
        return kui;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKui( Float newKui ) {
        Float oldKui = kui;
        kui = newKui;
        boolean oldKuiESet = kuiESet;
        kuiESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__KUI, oldKui, kui, !oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKui() {
        Float oldKui = kui;
        boolean oldKuiESet = kuiESet;
        kui = KUI_EDEFAULT;
        kuiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__KUI, oldKui, KUI_EDEFAULT, oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKui() {
        return kuiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKul() {
        return kul;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKul( Float newKul ) {
        Float oldKul = kul;
        kul = newKul;
        boolean oldKulESet = kulESet;
        kulESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__KUL, oldKul, kul, !oldKulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKul() {
        Float oldKul = kul;
        boolean oldKulESet = kulESet;
        kul = KUL_EDEFAULT;
        kulESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__KUL, oldKul, KUL_EDEFAULT, oldKulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKul() {
        return kulESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP0() {
        return p0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP0( Float newP0 ) {
        Float oldP0 = p0;
        p0 = newP0;
        boolean oldP0ESet = p0ESet;
        p0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P0, oldP0, p0, !oldP0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP0() {
        Float oldP0 = p0;
        boolean oldP0ESet = p0ESet;
        p0 = P0_EDEFAULT;
        p0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P0, oldP0, P0_EDEFAULT, oldP0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP0() {
        return p0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP1() {
        return p1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP1( Float newP1 ) {
        Float oldP1 = p1;
        p1 = newP1;
        boolean oldP1ESet = p1ESet;
        p1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P1, oldP1, p1, !oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP1() {
        Float oldP1 = p1;
        boolean oldP1ESet = p1ESet;
        p1 = P1_EDEFAULT;
        p1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P1, oldP1, P1_EDEFAULT, oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP1() {
        return p1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP10() {
        return p10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP10( Float newP10 ) {
        Float oldP10 = p10;
        p10 = newP10;
        boolean oldP10ESet = p10ESet;
        p10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P10, oldP10, p10, !oldP10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP10() {
        Float oldP10 = p10;
        boolean oldP10ESet = p10ESet;
        p10 = P10_EDEFAULT;
        p10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P10, oldP10, P10_EDEFAULT, oldP10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP10() {
        return p10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP2() {
        return p2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP2( Float newP2 ) {
        Float oldP2 = p2;
        p2 = newP2;
        boolean oldP2ESet = p2ESet;
        p2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P2, oldP2, p2, !oldP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP2() {
        Float oldP2 = p2;
        boolean oldP2ESet = p2ESet;
        p2 = P2_EDEFAULT;
        p2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P2, oldP2, P2_EDEFAULT, oldP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP2() {
        return p2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP3() {
        return p3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP3( Float newP3 ) {
        Float oldP3 = p3;
        p3 = newP3;
        boolean oldP3ESet = p3ESet;
        p3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P3, oldP3, p3, !oldP3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP3() {
        Float oldP3 = p3;
        boolean oldP3ESet = p3ESet;
        p3 = P3_EDEFAULT;
        p3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P3, oldP3, P3_EDEFAULT, oldP3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP3() {
        return p3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP4() {
        return p4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP4( Float newP4 ) {
        Float oldP4 = p4;
        p4 = newP4;
        boolean oldP4ESet = p4ESet;
        p4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P4, oldP4, p4, !oldP4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP4() {
        Float oldP4 = p4;
        boolean oldP4ESet = p4ESet;
        p4 = P4_EDEFAULT;
        p4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P4, oldP4, P4_EDEFAULT, oldP4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP4() {
        return p4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP5() {
        return p5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP5( Float newP5 ) {
        Float oldP5 = p5;
        p5 = newP5;
        boolean oldP5ESet = p5ESet;
        p5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P5, oldP5, p5, !oldP5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP5() {
        Float oldP5 = p5;
        boolean oldP5ESet = p5ESet;
        p5 = P5_EDEFAULT;
        p5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P5, oldP5, P5_EDEFAULT, oldP5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP5() {
        return p5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP6() {
        return p6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP6( Float newP6 ) {
        Float oldP6 = p6;
        p6 = newP6;
        boolean oldP6ESet = p6ESet;
        p6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P6, oldP6, p6, !oldP6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP6() {
        Float oldP6 = p6;
        boolean oldP6ESet = p6ESet;
        p6 = P6_EDEFAULT;
        p6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P6, oldP6, P6_EDEFAULT, oldP6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP6() {
        return p6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP7() {
        return p7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP7( Float newP7 ) {
        Float oldP7 = p7;
        p7 = newP7;
        boolean oldP7ESet = p7ESet;
        p7ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P7, oldP7, p7, !oldP7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP7() {
        Float oldP7 = p7;
        boolean oldP7ESet = p7ESet;
        p7 = P7_EDEFAULT;
        p7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P7, oldP7, P7_EDEFAULT, oldP7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP7() {
        return p7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP8() {
        return p8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP8( Float newP8 ) {
        Float oldP8 = p8;
        p8 = newP8;
        boolean oldP8ESet = p8ESet;
        p8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P8, oldP8, p8, !oldP8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP8() {
        Float oldP8 = p8;
        boolean oldP8ESet = p8ESet;
        p8 = P8_EDEFAULT;
        p8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P8, oldP8, P8_EDEFAULT, oldP8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP8() {
        return p8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP9() {
        return p9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP9( Float newP9 ) {
        Float oldP9 = p9;
        p9 = newP9;
        boolean oldP9ESet = p9ESet;
        p9ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__P9, oldP9, p9, !oldP9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP9() {
        Float oldP9 = p9;
        boolean oldP9ESet = p9ESet;
        p9 = P9_EDEFAULT;
        p9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__P9, oldP9, P9_EDEFAULT, oldP9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP9() {
        return p9ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ0() {
        return q0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ0( Float newQ0 ) {
        Float oldQ0 = q0;
        q0 = newQ0;
        boolean oldQ0ESet = q0ESet;
        q0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q0, oldQ0, q0, !oldQ0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ0() {
        Float oldQ0 = q0;
        boolean oldQ0ESet = q0ESet;
        q0 = Q0_EDEFAULT;
        q0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q0, oldQ0, Q0_EDEFAULT, oldQ0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ0() {
        return q0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ1() {
        return q1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ1( Float newQ1 ) {
        Float oldQ1 = q1;
        q1 = newQ1;
        boolean oldQ1ESet = q1ESet;
        q1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q1, oldQ1, q1, !oldQ1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ1() {
        Float oldQ1 = q1;
        boolean oldQ1ESet = q1ESet;
        q1 = Q1_EDEFAULT;
        q1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q1, oldQ1, Q1_EDEFAULT, oldQ1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ1() {
        return q1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ10() {
        return q10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ10( Float newQ10 ) {
        Float oldQ10 = q10;
        q10 = newQ10;
        boolean oldQ10ESet = q10ESet;
        q10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q10, oldQ10, q10, !oldQ10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ10() {
        Float oldQ10 = q10;
        boolean oldQ10ESet = q10ESet;
        q10 = Q10_EDEFAULT;
        q10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q10, oldQ10, Q10_EDEFAULT, oldQ10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ10() {
        return q10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ2() {
        return q2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ2( Float newQ2 ) {
        Float oldQ2 = q2;
        q2 = newQ2;
        boolean oldQ2ESet = q2ESet;
        q2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q2, oldQ2, q2, !oldQ2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ2() {
        Float oldQ2 = q2;
        boolean oldQ2ESet = q2ESet;
        q2 = Q2_EDEFAULT;
        q2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q2, oldQ2, Q2_EDEFAULT, oldQ2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ2() {
        return q2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ3() {
        return q3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ3( Float newQ3 ) {
        Float oldQ3 = q3;
        q3 = newQ3;
        boolean oldQ3ESet = q3ESet;
        q3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q3, oldQ3, q3, !oldQ3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ3() {
        Float oldQ3 = q3;
        boolean oldQ3ESet = q3ESet;
        q3 = Q3_EDEFAULT;
        q3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q3, oldQ3, Q3_EDEFAULT, oldQ3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ3() {
        return q3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ4() {
        return q4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ4( Float newQ4 ) {
        Float oldQ4 = q4;
        q4 = newQ4;
        boolean oldQ4ESet = q4ESet;
        q4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q4, oldQ4, q4, !oldQ4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ4() {
        Float oldQ4 = q4;
        boolean oldQ4ESet = q4ESet;
        q4 = Q4_EDEFAULT;
        q4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q4, oldQ4, Q4_EDEFAULT, oldQ4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ4() {
        return q4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ5() {
        return q5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ5( Float newQ5 ) {
        Float oldQ5 = q5;
        q5 = newQ5;
        boolean oldQ5ESet = q5ESet;
        q5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q5, oldQ5, q5, !oldQ5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ5() {
        Float oldQ5 = q5;
        boolean oldQ5ESet = q5ESet;
        q5 = Q5_EDEFAULT;
        q5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q5, oldQ5, Q5_EDEFAULT, oldQ5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ5() {
        return q5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ6() {
        return q6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ6( Float newQ6 ) {
        Float oldQ6 = q6;
        q6 = newQ6;
        boolean oldQ6ESet = q6ESet;
        q6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q6, oldQ6, q6, !oldQ6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ6() {
        Float oldQ6 = q6;
        boolean oldQ6ESet = q6ESet;
        q6 = Q6_EDEFAULT;
        q6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q6, oldQ6, Q6_EDEFAULT, oldQ6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ6() {
        return q6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ7() {
        return q7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ7( Float newQ7 ) {
        Float oldQ7 = q7;
        q7 = newQ7;
        boolean oldQ7ESet = q7ESet;
        q7ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q7, oldQ7, q7, !oldQ7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ7() {
        Float oldQ7 = q7;
        boolean oldQ7ESet = q7ESet;
        q7 = Q7_EDEFAULT;
        q7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q7, oldQ7, Q7_EDEFAULT, oldQ7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ7() {
        return q7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ8() {
        return q8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ8( Float newQ8 ) {
        Float oldQ8 = q8;
        q8 = newQ8;
        boolean oldQ8ESet = q8ESet;
        q8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q8, oldQ8, q8, !oldQ8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ8() {
        Float oldQ8 = q8;
        boolean oldQ8ESet = q8ESet;
        q8 = Q8_EDEFAULT;
        q8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q8, oldQ8, Q8_EDEFAULT, oldQ8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ8() {
        return q8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ9() {
        return q9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ9( Float newQ9 ) {
        Float oldQ9 = q9;
        q9 = newQ9;
        boolean oldQ9ESet = q9ESet;
        q9ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q9, oldQ9, q9, !oldQ9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ9() {
        Float oldQ9 = q9;
        boolean oldQ9ESet = q9ESet;
        q9 = Q9_EDEFAULT;
        q9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__Q9, oldQ9, Q9_EDEFAULT, oldQ9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ9() {
        return q9ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu1() {
        return tu1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu1( Float newTu1 ) {
        Float oldTu1 = tu1;
        tu1 = newTu1;
        boolean oldTu1ESet = tu1ESet;
        tu1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU1, oldTu1, tu1, !oldTu1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu1() {
        Float oldTu1 = tu1;
        boolean oldTu1ESet = tu1ESet;
        tu1 = TU1_EDEFAULT;
        tu1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU1, oldTu1, TU1_EDEFAULT, oldTu1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu1() {
        return tu1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu2() {
        return tu2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu2( Float newTu2 ) {
        Float oldTu2 = tu2;
        tu2 = newTu2;
        boolean oldTu2ESet = tu2ESet;
        tu2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU2, oldTu2, tu2, !oldTu2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu2() {
        Float oldTu2 = tu2;
        boolean oldTu2ESet = tu2ESet;
        tu2 = TU2_EDEFAULT;
        tu2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU2, oldTu2, TU2_EDEFAULT, oldTu2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu2() {
        return tu2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu3() {
        return tu3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu3( Float newTu3 ) {
        Float oldTu3 = tu3;
        tu3 = newTu3;
        boolean oldTu3ESet = tu3ESet;
        tu3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU3, oldTu3, tu3, !oldTu3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu3() {
        Float oldTu3 = tu3;
        boolean oldTu3ESet = tu3ESet;
        tu3 = TU3_EDEFAULT;
        tu3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU3, oldTu3, TU3_EDEFAULT, oldTu3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu3() {
        return tu3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTu4() {
        return tu4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTu4( Float newTu4 ) {
        Float oldTu4 = tu4;
        tu4 = newTu4;
        boolean oldTu4ESet = tu4ESet;
        tu4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU4, oldTu4, tu4, !oldTu4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTu4() {
        Float oldTu4 = tu4;
        boolean oldTu4ESet = tu4ESet;
        tu4 = TU4_EDEFAULT;
        tu4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TU4, oldTu4, TU4_EDEFAULT, oldTu4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTu4() {
        return tu4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTul() {
        return tul;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTul( Float newTul ) {
        Float oldTul = tul;
        tul = newTul;
        boolean oldTulESet = tulESet;
        tulESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUL, oldTul, tul, !oldTulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTul() {
        Float oldTul = tul;
        boolean oldTulESet = tulESet;
        tul = TUL_EDEFAULT;
        tulESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUL, oldTul, TUL_EDEFAULT, oldTulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTul() {
        return tulESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTup() {
        return tup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTup( Float newTup ) {
        Float oldTup = tup;
        tup = newTup;
        boolean oldTupESet = tupESet;
        tupESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUP, oldTup, tup, !oldTupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTup() {
        Float oldTup = tup;
        boolean oldTupESet = tupESet;
        tup = TUP_EDEFAULT;
        tupESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUP, oldTup, TUP_EDEFAULT, oldTupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTup() {
        return tupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTuq() {
        return tuq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuq( Float newTuq ) {
        Float oldTuq = tuq;
        tuq = newTuq;
        boolean oldTuqESet = tuqESet;
        tuqESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUQ, oldTuq, tuq, !oldTuqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuq() {
        Float oldTuq = tuq;
        boolean oldTuqESet = tuqESet;
        tuq = TUQ_EDEFAULT;
        tuqESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUQ, oldTuq, TUQ_EDEFAULT, oldTuqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuq() {
        return tuqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTuv() {
        return tuv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTuv( Float newTuv ) {
        Float oldTuv = tuv;
        tuv = newTuv;
        boolean oldTuvESet = tuvESet;
        tuvESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUV, oldTuv, tuv, !oldTuvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTuv() {
        Float oldTuv = tuv;
        boolean oldTuvESet = tuvESet;
        tuv = TUV_EDEFAULT;
        tuvESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__TUV, oldTuv, TUV_EDEFAULT, oldTuvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTuv() {
        return tuvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVuimax() {
        return vuimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimax( Float newVuimax ) {
        Float oldVuimax = vuimax;
        vuimax = newVuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__VUIMAX, oldVuimax, vuimax, !oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimax() {
        Float oldVuimax = vuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimax = VUIMAX_EDEFAULT;
        vuimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__VUIMAX, oldVuimax, VUIMAX_EDEFAULT, oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimax() {
        return vuimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVuimin() {
        return vuimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimin( Float newVuimin ) {
        Float oldVuimin = vuimin;
        vuimin = newVuimin;
        boolean oldVuiminESet = vuiminESet;
        vuiminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__VUIMIN, oldVuimin, vuimin, !oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimin() {
        Float oldVuimin = vuimin;
        boolean oldVuiminESet = vuiminESet;
        vuimin = VUIMIN_EDEFAULT;
        vuiminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__VUIMIN, oldVuimin, VUIMIN_EDEFAULT, oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimin() {
        return vuiminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVulmax() {
        return vulmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVulmax( Float newVulmax ) {
        Float oldVulmax = vulmax;
        vulmax = newVulmax;
        boolean oldVulmaxESet = vulmaxESet;
        vulmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__VULMAX, oldVulmax, vulmax, !oldVulmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVulmax() {
        Float oldVulmax = vulmax;
        boolean oldVulmaxESet = vulmaxESet;
        vulmax = VULMAX_EDEFAULT;
        vulmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__VULMAX, oldVulmax, VULMAX_EDEFAULT, oldVulmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVulmax() {
        return vulmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVulmin() {
        return vulmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVulmin( Float newVulmin ) {
        Float oldVulmin = vulmin;
        vulmin = newVulmin;
        boolean oldVulminESet = vulminESet;
        vulminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM_IEEE2__VULMIN, oldVulmin, vulmin, !oldVulminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVulmin() {
        Float oldVulmin = vulmin;
        boolean oldVulminESet = vulminESet;
        vulmin = VULMIN_EDEFAULT;
        vulminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM_IEEE2__VULMIN, oldVulmin, VULMIN_EDEFAULT, oldVulminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVulmin() {
        return vulminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.UNDEREXC_LIM_IEEE2__K1:
            return getK1();
        case CimPackage.UNDEREXC_LIM_IEEE2__K2:
            return getK2();
        case CimPackage.UNDEREXC_LIM_IEEE2__KFB:
            return getKfb();
        case CimPackage.UNDEREXC_LIM_IEEE2__KUF:
            return getKuf();
        case CimPackage.UNDEREXC_LIM_IEEE2__KUI:
            return getKui();
        case CimPackage.UNDEREXC_LIM_IEEE2__KUL:
            return getKul();
        case CimPackage.UNDEREXC_LIM_IEEE2__P0:
            return getP0();
        case CimPackage.UNDEREXC_LIM_IEEE2__P1:
            return getP1();
        case CimPackage.UNDEREXC_LIM_IEEE2__P10:
            return getP10();
        case CimPackage.UNDEREXC_LIM_IEEE2__P2:
            return getP2();
        case CimPackage.UNDEREXC_LIM_IEEE2__P3:
            return getP3();
        case CimPackage.UNDEREXC_LIM_IEEE2__P4:
            return getP4();
        case CimPackage.UNDEREXC_LIM_IEEE2__P5:
            return getP5();
        case CimPackage.UNDEREXC_LIM_IEEE2__P6:
            return getP6();
        case CimPackage.UNDEREXC_LIM_IEEE2__P7:
            return getP7();
        case CimPackage.UNDEREXC_LIM_IEEE2__P8:
            return getP8();
        case CimPackage.UNDEREXC_LIM_IEEE2__P9:
            return getP9();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q0:
            return getQ0();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q1:
            return getQ1();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q10:
            return getQ10();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q2:
            return getQ2();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q3:
            return getQ3();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q4:
            return getQ4();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q5:
            return getQ5();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q6:
            return getQ6();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q7:
            return getQ7();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q8:
            return getQ8();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q9:
            return getQ9();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU1:
            return getTu1();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU2:
            return getTu2();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU3:
            return getTu3();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU4:
            return getTu4();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUL:
            return getTul();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUP:
            return getTup();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUQ:
            return getTuq();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUV:
            return getTuv();
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMAX:
            return getVuimax();
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMIN:
            return getVuimin();
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMAX:
            return getVulmax();
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMIN:
            return getVulmin();
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
        case CimPackage.UNDEREXC_LIM_IEEE2__K1:
            setK1( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__K2:
            setK2( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KFB:
            setKfb( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KUF:
            setKuf( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KUI:
            setKui( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KUL:
            setKul( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P0:
            setP0( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P1:
            setP1( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P10:
            setP10( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P2:
            setP2( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P3:
            setP3( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P4:
            setP4( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P5:
            setP5( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P6:
            setP6( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P7:
            setP7( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P8:
            setP8( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P9:
            setP9( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q0:
            setQ0( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q1:
            setQ1( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q10:
            setQ10( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q2:
            setQ2( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q3:
            setQ3( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q4:
            setQ4( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q5:
            setQ5( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q6:
            setQ6( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q7:
            setQ7( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q8:
            setQ8( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q9:
            setQ9( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU1:
            setTu1( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU2:
            setTu2( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU3:
            setTu3( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU4:
            setTu4( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUL:
            setTul( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUP:
            setTup( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUQ:
            setTuq( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUV:
            setTuv( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMAX:
            setVuimax( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMIN:
            setVuimin( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMAX:
            setVulmax( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMIN:
            setVulmin( ( Float ) newValue );
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
        case CimPackage.UNDEREXC_LIM_IEEE2__K1:
            unsetK1();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__K2:
            unsetK2();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KFB:
            unsetKfb();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KUF:
            unsetKuf();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KUI:
            unsetKui();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__KUL:
            unsetKul();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P0:
            unsetP0();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P1:
            unsetP1();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P10:
            unsetP10();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P2:
            unsetP2();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P3:
            unsetP3();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P4:
            unsetP4();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P5:
            unsetP5();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P6:
            unsetP6();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P7:
            unsetP7();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P8:
            unsetP8();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__P9:
            unsetP9();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q0:
            unsetQ0();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q1:
            unsetQ1();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q10:
            unsetQ10();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q2:
            unsetQ2();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q3:
            unsetQ3();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q4:
            unsetQ4();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q5:
            unsetQ5();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q6:
            unsetQ6();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q7:
            unsetQ7();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q8:
            unsetQ8();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__Q9:
            unsetQ9();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU1:
            unsetTu1();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU2:
            unsetTu2();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU3:
            unsetTu3();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TU4:
            unsetTu4();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUL:
            unsetTul();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUP:
            unsetTup();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUQ:
            unsetTuq();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__TUV:
            unsetTuv();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMAX:
            unsetVuimax();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMIN:
            unsetVuimin();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMAX:
            unsetVulmax();
            return;
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMIN:
            unsetVulmin();
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
        case CimPackage.UNDEREXC_LIM_IEEE2__K1:
            return isSetK1();
        case CimPackage.UNDEREXC_LIM_IEEE2__K2:
            return isSetK2();
        case CimPackage.UNDEREXC_LIM_IEEE2__KFB:
            return isSetKfb();
        case CimPackage.UNDEREXC_LIM_IEEE2__KUF:
            return isSetKuf();
        case CimPackage.UNDEREXC_LIM_IEEE2__KUI:
            return isSetKui();
        case CimPackage.UNDEREXC_LIM_IEEE2__KUL:
            return isSetKul();
        case CimPackage.UNDEREXC_LIM_IEEE2__P0:
            return isSetP0();
        case CimPackage.UNDEREXC_LIM_IEEE2__P1:
            return isSetP1();
        case CimPackage.UNDEREXC_LIM_IEEE2__P10:
            return isSetP10();
        case CimPackage.UNDEREXC_LIM_IEEE2__P2:
            return isSetP2();
        case CimPackage.UNDEREXC_LIM_IEEE2__P3:
            return isSetP3();
        case CimPackage.UNDEREXC_LIM_IEEE2__P4:
            return isSetP4();
        case CimPackage.UNDEREXC_LIM_IEEE2__P5:
            return isSetP5();
        case CimPackage.UNDEREXC_LIM_IEEE2__P6:
            return isSetP6();
        case CimPackage.UNDEREXC_LIM_IEEE2__P7:
            return isSetP7();
        case CimPackage.UNDEREXC_LIM_IEEE2__P8:
            return isSetP8();
        case CimPackage.UNDEREXC_LIM_IEEE2__P9:
            return isSetP9();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q0:
            return isSetQ0();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q1:
            return isSetQ1();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q10:
            return isSetQ10();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q2:
            return isSetQ2();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q3:
            return isSetQ3();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q4:
            return isSetQ4();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q5:
            return isSetQ5();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q6:
            return isSetQ6();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q7:
            return isSetQ7();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q8:
            return isSetQ8();
        case CimPackage.UNDEREXC_LIM_IEEE2__Q9:
            return isSetQ9();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU1:
            return isSetTu1();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU2:
            return isSetTu2();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU3:
            return isSetTu3();
        case CimPackage.UNDEREXC_LIM_IEEE2__TU4:
            return isSetTu4();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUL:
            return isSetTul();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUP:
            return isSetTup();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUQ:
            return isSetTuq();
        case CimPackage.UNDEREXC_LIM_IEEE2__TUV:
            return isSetTuv();
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMAX:
            return isSetVuimax();
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMIN:
            return isSetVuimin();
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMAX:
            return isSetVulmax();
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMIN:
            return isSetVulmin();
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
        result.append( " (k1: " );
        if( k1ESet )
            result.append( k1 );
        else
            result.append( "<unset>" );
        result.append( ", k2: " );
        if( k2ESet )
            result.append( k2 );
        else
            result.append( "<unset>" );
        result.append( ", kfb: " );
        if( kfbESet )
            result.append( kfb );
        else
            result.append( "<unset>" );
        result.append( ", kuf: " );
        if( kufESet )
            result.append( kuf );
        else
            result.append( "<unset>" );
        result.append( ", kui: " );
        if( kuiESet )
            result.append( kui );
        else
            result.append( "<unset>" );
        result.append( ", kul: " );
        if( kulESet )
            result.append( kul );
        else
            result.append( "<unset>" );
        result.append( ", p0: " );
        if( p0ESet )
            result.append( p0 );
        else
            result.append( "<unset>" );
        result.append( ", p1: " );
        if( p1ESet )
            result.append( p1 );
        else
            result.append( "<unset>" );
        result.append( ", p10: " );
        if( p10ESet )
            result.append( p10 );
        else
            result.append( "<unset>" );
        result.append( ", p2: " );
        if( p2ESet )
            result.append( p2 );
        else
            result.append( "<unset>" );
        result.append( ", p3: " );
        if( p3ESet )
            result.append( p3 );
        else
            result.append( "<unset>" );
        result.append( ", p4: " );
        if( p4ESet )
            result.append( p4 );
        else
            result.append( "<unset>" );
        result.append( ", p5: " );
        if( p5ESet )
            result.append( p5 );
        else
            result.append( "<unset>" );
        result.append( ", p6: " );
        if( p6ESet )
            result.append( p6 );
        else
            result.append( "<unset>" );
        result.append( ", p7: " );
        if( p7ESet )
            result.append( p7 );
        else
            result.append( "<unset>" );
        result.append( ", p8: " );
        if( p8ESet )
            result.append( p8 );
        else
            result.append( "<unset>" );
        result.append( ", p9: " );
        if( p9ESet )
            result.append( p9 );
        else
            result.append( "<unset>" );
        result.append( ", q0: " );
        if( q0ESet )
            result.append( q0 );
        else
            result.append( "<unset>" );
        result.append( ", q1: " );
        if( q1ESet )
            result.append( q1 );
        else
            result.append( "<unset>" );
        result.append( ", q10: " );
        if( q10ESet )
            result.append( q10 );
        else
            result.append( "<unset>" );
        result.append( ", q2: " );
        if( q2ESet )
            result.append( q2 );
        else
            result.append( "<unset>" );
        result.append( ", q3: " );
        if( q3ESet )
            result.append( q3 );
        else
            result.append( "<unset>" );
        result.append( ", q4: " );
        if( q4ESet )
            result.append( q4 );
        else
            result.append( "<unset>" );
        result.append( ", q5: " );
        if( q5ESet )
            result.append( q5 );
        else
            result.append( "<unset>" );
        result.append( ", q6: " );
        if( q6ESet )
            result.append( q6 );
        else
            result.append( "<unset>" );
        result.append( ", q7: " );
        if( q7ESet )
            result.append( q7 );
        else
            result.append( "<unset>" );
        result.append( ", q8: " );
        if( q8ESet )
            result.append( q8 );
        else
            result.append( "<unset>" );
        result.append( ", q9: " );
        if( q9ESet )
            result.append( q9 );
        else
            result.append( "<unset>" );
        result.append( ", tu1: " );
        if( tu1ESet )
            result.append( tu1 );
        else
            result.append( "<unset>" );
        result.append( ", tu2: " );
        if( tu2ESet )
            result.append( tu2 );
        else
            result.append( "<unset>" );
        result.append( ", tu3: " );
        if( tu3ESet )
            result.append( tu3 );
        else
            result.append( "<unset>" );
        result.append( ", tu4: " );
        if( tu4ESet )
            result.append( tu4 );
        else
            result.append( "<unset>" );
        result.append( ", tul: " );
        if( tulESet )
            result.append( tul );
        else
            result.append( "<unset>" );
        result.append( ", tup: " );
        if( tupESet )
            result.append( tup );
        else
            result.append( "<unset>" );
        result.append( ", tuq: " );
        if( tuqESet )
            result.append( tuq );
        else
            result.append( "<unset>" );
        result.append( ", tuv: " );
        if( tuvESet )
            result.append( tuv );
        else
            result.append( "<unset>" );
        result.append( ", vuimax: " );
        if( vuimaxESet )
            result.append( vuimax );
        else
            result.append( "<unset>" );
        result.append( ", vuimin: " );
        if( vuiminESet )
            result.append( vuimin );
        else
            result.append( "<unset>" );
        result.append( ", vulmax: " );
        if( vulmaxESet )
            result.append( vulmax );
        else
            result.append( "<unset>" );
        result.append( ", vulmin: " );
        if( vulminESet )
            result.append( vulmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //UnderexcLimIEEE2Impl
