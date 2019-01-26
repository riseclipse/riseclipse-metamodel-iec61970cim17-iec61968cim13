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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov GAST1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getA <em>A</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getEps <em>Eps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getFidle <em>Fidle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getGv6 <em>Gv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getKt <em>Kt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getLmax <em>Lmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getLoadinc <em>Loadinc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getLtrate <em>Ltrate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getPgv4 <em>Pgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getPgv5 <em>Pgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getPgv6 <em>Pgv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getRmax <em>Rmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getTltr <em>Tltr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getVmax <em>Vmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST1Impl#getVmin <em>Vmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovGAST1Impl extends TurbineGovernorDynamicsImpl implements GovGAST1 {
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
     * The default value of the '{@link #getDb1() <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb1()
     * @generated
     * @ordered
     */
    protected static final Float DB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDb1() <em>Db1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb1()
     * @generated
     * @ordered
     */
    protected Float db1 = DB1_EDEFAULT;

    /**
     * This is true if the Db1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean db1ESet;

    /**
     * The default value of the '{@link #getDb2() <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb2()
     * @generated
     * @ordered
     */
    protected static final Float DB2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDb2() <em>Db2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb2()
     * @generated
     * @ordered
     */
    protected Float db2 = DB2_EDEFAULT;

    /**
     * This is true if the Db2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean db2ESet;

    /**
     * The default value of the '{@link #getEps() <em>Eps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEps()
     * @generated
     * @ordered
     */
    protected static final Float EPS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEps() <em>Eps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEps()
     * @generated
     * @ordered
     */
    protected Float eps = EPS_EDEFAULT;

    /**
     * This is true if the Eps attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean epsESet;

    /**
     * The default value of the '{@link #getFidle() <em>Fidle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFidle()
     * @generated
     * @ordered
     */
    protected static final Float FIDLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFidle() <em>Fidle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFidle()
     * @generated
     * @ordered
     */
    protected Float fidle = FIDLE_EDEFAULT;

    /**
     * This is true if the Fidle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fidleESet;

    /**
     * The default value of the '{@link #getGv1() <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv1()
     * @generated
     * @ordered
     */
    protected static final Float GV1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv1() <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv1()
     * @generated
     * @ordered
     */
    protected Float gv1 = GV1_EDEFAULT;

    /**
     * This is true if the Gv1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv1ESet;

    /**
     * The default value of the '{@link #getGv2() <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv2()
     * @generated
     * @ordered
     */
    protected static final Float GV2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv2() <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv2()
     * @generated
     * @ordered
     */
    protected Float gv2 = GV2_EDEFAULT;

    /**
     * This is true if the Gv2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv2ESet;

    /**
     * The default value of the '{@link #getGv3() <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv3()
     * @generated
     * @ordered
     */
    protected static final Float GV3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv3() <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv3()
     * @generated
     * @ordered
     */
    protected Float gv3 = GV3_EDEFAULT;

    /**
     * This is true if the Gv3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv3ESet;

    /**
     * The default value of the '{@link #getGv4() <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv4()
     * @generated
     * @ordered
     */
    protected static final Float GV4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv4() <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv4()
     * @generated
     * @ordered
     */
    protected Float gv4 = GV4_EDEFAULT;

    /**
     * This is true if the Gv4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv4ESet;

    /**
     * The default value of the '{@link #getGv5() <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv5()
     * @generated
     * @ordered
     */
    protected static final Float GV5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv5() <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv5()
     * @generated
     * @ordered
     */
    protected Float gv5 = GV5_EDEFAULT;

    /**
     * This is true if the Gv5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv5ESet;

    /**
     * The default value of the '{@link #getGv6() <em>Gv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv6()
     * @generated
     * @ordered
     */
    protected static final Float GV6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv6() <em>Gv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv6()
     * @generated
     * @ordered
     */
    protected Float gv6 = GV6_EDEFAULT;

    /**
     * This is true if the Gv6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv6ESet;

    /**
     * The default value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected static final Float KA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected Float ka = KA_EDEFAULT;

    /**
     * This is true if the Ka attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kaESet;

    /**
     * The default value of the '{@link #getKt() <em>Kt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKt()
     * @generated
     * @ordered
     */
    protected static final Float KT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKt() <em>Kt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKt()
     * @generated
     * @ordered
     */
    protected Float kt = KT_EDEFAULT;

    /**
     * This is true if the Kt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ktESet;

    /**
     * The default value of the '{@link #getLmax() <em>Lmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLmax()
     * @generated
     * @ordered
     */
    protected static final Float LMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLmax() <em>Lmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLmax()
     * @generated
     * @ordered
     */
    protected Float lmax = LMAX_EDEFAULT;

    /**
     * This is true if the Lmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lmaxESet;

    /**
     * The default value of the '{@link #getLoadinc() <em>Loadinc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadinc()
     * @generated
     * @ordered
     */
    protected static final Float LOADINC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLoadinc() <em>Loadinc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadinc()
     * @generated
     * @ordered
     */
    protected Float loadinc = LOADINC_EDEFAULT;

    /**
     * This is true if the Loadinc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadincESet;

    /**
     * The default value of the '{@link #getLtrate() <em>Ltrate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLtrate()
     * @generated
     * @ordered
     */
    protected static final Float LTRATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLtrate() <em>Ltrate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLtrate()
     * @generated
     * @ordered
     */
    protected Float ltrate = LTRATE_EDEFAULT;

    /**
     * This is true if the Ltrate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ltrateESet;

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
     * The default value of the '{@link #getPgv1() <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv1()
     * @generated
     * @ordered
     */
    protected static final Float PGV1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv1() <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv1()
     * @generated
     * @ordered
     */
    protected Float pgv1 = PGV1_EDEFAULT;

    /**
     * This is true if the Pgv1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv1ESet;

    /**
     * The default value of the '{@link #getPgv2() <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv2()
     * @generated
     * @ordered
     */
    protected static final Float PGV2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv2() <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv2()
     * @generated
     * @ordered
     */
    protected Float pgv2 = PGV2_EDEFAULT;

    /**
     * This is true if the Pgv2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv2ESet;

    /**
     * The default value of the '{@link #getPgv3() <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv3()
     * @generated
     * @ordered
     */
    protected static final Float PGV3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv3() <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv3()
     * @generated
     * @ordered
     */
    protected Float pgv3 = PGV3_EDEFAULT;

    /**
     * This is true if the Pgv3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv3ESet;

    /**
     * The default value of the '{@link #getPgv4() <em>Pgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv4()
     * @generated
     * @ordered
     */
    protected static final Float PGV4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv4() <em>Pgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv4()
     * @generated
     * @ordered
     */
    protected Float pgv4 = PGV4_EDEFAULT;

    /**
     * This is true if the Pgv4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv4ESet;

    /**
     * The default value of the '{@link #getPgv5() <em>Pgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv5()
     * @generated
     * @ordered
     */
    protected static final Float PGV5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv5() <em>Pgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv5()
     * @generated
     * @ordered
     */
    protected Float pgv5 = PGV5_EDEFAULT;

    /**
     * This is true if the Pgv5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv5ESet;

    /**
     * The default value of the '{@link #getPgv6() <em>Pgv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv6()
     * @generated
     * @ordered
     */
    protected static final Float PGV6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv6() <em>Pgv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv6()
     * @generated
     * @ordered
     */
    protected Float pgv6 = PGV6_EDEFAULT;

    /**
     * This is true if the Pgv6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv6ESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getRmax() <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmax()
     * @generated
     * @ordered
     */
    protected static final Float RMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRmax() <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRmax()
     * @generated
     * @ordered
     */
    protected Float rmax = RMAX_EDEFAULT;

    /**
     * This is true if the Rmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rmaxESet;

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
     * The default value of the '{@link #getTltr() <em>Tltr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTltr()
     * @generated
     * @ordered
     */
    protected static final Float TLTR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTltr() <em>Tltr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTltr()
     * @generated
     * @ordered
     */
    protected Float tltr = TLTR_EDEFAULT;

    /**
     * This is true if the Tltr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tltrESet;

    /**
     * The default value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax()
     * @generated
     * @ordered
     */
    protected static final Float VMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax()
     * @generated
     * @ordered
     */
    protected Float vmax = VMAX_EDEFAULT;

    /**
     * This is true if the Vmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmaxESet;

    /**
     * The default value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin()
     * @generated
     * @ordered
     */
    protected static final Float VMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin()
     * @generated
     * @ordered
     */
    protected Float vmin = VMIN_EDEFAULT;

    /**
     * This is true if the Vmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovGAST1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovGAST1();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__A, oldA, a, !oldAESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST1__A,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__B, oldB, b, !oldBESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST1__B,
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
    public Float getDb1() {
        return db1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDb1( Float newDb1 ) {
        Float oldDb1 = db1;
        db1 = newDb1;
        boolean oldDb1ESet = db1ESet;
        db1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__DB1, oldDb1, db1, !oldDb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDb1() {
        Float oldDb1 = db1;
        boolean oldDb1ESet = db1ESet;
        db1 = DB1_EDEFAULT;
        db1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__DB1, oldDb1, DB1_EDEFAULT, oldDb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDb1() {
        return db1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDb2() {
        return db2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDb2( Float newDb2 ) {
        Float oldDb2 = db2;
        db2 = newDb2;
        boolean oldDb2ESet = db2ESet;
        db2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__DB2, oldDb2, db2, !oldDb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDb2() {
        Float oldDb2 = db2;
        boolean oldDb2ESet = db2ESet;
        db2 = DB2_EDEFAULT;
        db2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__DB2, oldDb2, DB2_EDEFAULT, oldDb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDb2() {
        return db2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEps() {
        return eps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEps( Float newEps ) {
        Float oldEps = eps;
        eps = newEps;
        boolean oldEpsESet = epsESet;
        epsESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__EPS, oldEps, eps, !oldEpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEps() {
        Float oldEps = eps;
        boolean oldEpsESet = epsESet;
        eps = EPS_EDEFAULT;
        epsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__EPS, oldEps, EPS_EDEFAULT, oldEpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEps() {
        return epsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFidle() {
        return fidle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFidle( Float newFidle ) {
        Float oldFidle = fidle;
        fidle = newFidle;
        boolean oldFidleESet = fidleESet;
        fidleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__FIDLE, oldFidle, fidle, !oldFidleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFidle() {
        Float oldFidle = fidle;
        boolean oldFidleESet = fidleESet;
        fidle = FIDLE_EDEFAULT;
        fidleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__FIDLE, oldFidle, FIDLE_EDEFAULT, oldFidleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFidle() {
        return fidleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGv1() {
        return gv1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv1( Float newGv1 ) {
        Float oldGv1 = gv1;
        gv1 = newGv1;
        boolean oldGv1ESet = gv1ESet;
        gv1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__GV1, oldGv1, gv1, !oldGv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv1() {
        Float oldGv1 = gv1;
        boolean oldGv1ESet = gv1ESet;
        gv1 = GV1_EDEFAULT;
        gv1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__GV1, oldGv1, GV1_EDEFAULT, oldGv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv1() {
        return gv1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGv2() {
        return gv2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv2( Float newGv2 ) {
        Float oldGv2 = gv2;
        gv2 = newGv2;
        boolean oldGv2ESet = gv2ESet;
        gv2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__GV2, oldGv2, gv2, !oldGv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv2() {
        Float oldGv2 = gv2;
        boolean oldGv2ESet = gv2ESet;
        gv2 = GV2_EDEFAULT;
        gv2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__GV2, oldGv2, GV2_EDEFAULT, oldGv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv2() {
        return gv2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGv3() {
        return gv3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv3( Float newGv3 ) {
        Float oldGv3 = gv3;
        gv3 = newGv3;
        boolean oldGv3ESet = gv3ESet;
        gv3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__GV3, oldGv3, gv3, !oldGv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv3() {
        Float oldGv3 = gv3;
        boolean oldGv3ESet = gv3ESet;
        gv3 = GV3_EDEFAULT;
        gv3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__GV3, oldGv3, GV3_EDEFAULT, oldGv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv3() {
        return gv3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGv4() {
        return gv4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv4( Float newGv4 ) {
        Float oldGv4 = gv4;
        gv4 = newGv4;
        boolean oldGv4ESet = gv4ESet;
        gv4ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__GV4, oldGv4, gv4, !oldGv4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv4() {
        Float oldGv4 = gv4;
        boolean oldGv4ESet = gv4ESet;
        gv4 = GV4_EDEFAULT;
        gv4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__GV4, oldGv4, GV4_EDEFAULT, oldGv4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv4() {
        return gv4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGv5() {
        return gv5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv5( Float newGv5 ) {
        Float oldGv5 = gv5;
        gv5 = newGv5;
        boolean oldGv5ESet = gv5ESet;
        gv5ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__GV5, oldGv5, gv5, !oldGv5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv5() {
        Float oldGv5 = gv5;
        boolean oldGv5ESet = gv5ESet;
        gv5 = GV5_EDEFAULT;
        gv5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__GV5, oldGv5, GV5_EDEFAULT, oldGv5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv5() {
        return gv5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGv6() {
        return gv6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv6( Float newGv6 ) {
        Float oldGv6 = gv6;
        gv6 = newGv6;
        boolean oldGv6ESet = gv6ESet;
        gv6ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__GV6, oldGv6, gv6, !oldGv6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv6() {
        Float oldGv6 = gv6;
        boolean oldGv6ESet = gv6ESet;
        gv6 = GV6_EDEFAULT;
        gv6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__GV6, oldGv6, GV6_EDEFAULT, oldGv6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv6() {
        return gv6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKa() {
        return ka;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKa( Float newKa ) {
        Float oldKa = ka;
        ka = newKa;
        boolean oldKaESet = kaESet;
        kaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__KA, oldKa, ka, !oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKa() {
        Float oldKa = ka;
        boolean oldKaESet = kaESet;
        ka = KA_EDEFAULT;
        kaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__KA, oldKa, KA_EDEFAULT, oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKa() {
        return kaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKt() {
        return kt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKt( Float newKt ) {
        Float oldKt = kt;
        kt = newKt;
        boolean oldKtESet = ktESet;
        ktESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__KT, oldKt, kt, !oldKtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKt() {
        Float oldKt = kt;
        boolean oldKtESet = ktESet;
        kt = KT_EDEFAULT;
        ktESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__KT, oldKt, KT_EDEFAULT, oldKtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKt() {
        return ktESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLmax() {
        return lmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLmax( Float newLmax ) {
        Float oldLmax = lmax;
        lmax = newLmax;
        boolean oldLmaxESet = lmaxESet;
        lmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__LMAX, oldLmax, lmax, !oldLmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLmax() {
        Float oldLmax = lmax;
        boolean oldLmaxESet = lmaxESet;
        lmax = LMAX_EDEFAULT;
        lmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__LMAX, oldLmax, LMAX_EDEFAULT, oldLmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLmax() {
        return lmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLoadinc() {
        return loadinc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoadinc( Float newLoadinc ) {
        Float oldLoadinc = loadinc;
        loadinc = newLoadinc;
        boolean oldLoadincESet = loadincESet;
        loadincESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__LOADINC, oldLoadinc, loadinc, !oldLoadincESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLoadinc() {
        Float oldLoadinc = loadinc;
        boolean oldLoadincESet = loadincESet;
        loadinc = LOADINC_EDEFAULT;
        loadincESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__LOADINC, oldLoadinc, LOADINC_EDEFAULT, oldLoadincESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadinc() {
        return loadincESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLtrate() {
        return ltrate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLtrate( Float newLtrate ) {
        Float oldLtrate = ltrate;
        ltrate = newLtrate;
        boolean oldLtrateESet = ltrateESet;
        ltrateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__LTRATE, oldLtrate, ltrate, !oldLtrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLtrate() {
        Float oldLtrate = ltrate;
        boolean oldLtrateESet = ltrateESet;
        ltrate = LTRATE_EDEFAULT;
        ltrateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__LTRATE, oldLtrate, LTRATE_EDEFAULT, oldLtrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLtrate() {
        return ltrateESet;
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
                CimPackage.GOV_GAST1__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
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
                CimPackage.GOV_GAST1__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
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
    public Float getPgv1() {
        return pgv1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv1( Float newPgv1 ) {
        Float oldPgv1 = pgv1;
        pgv1 = newPgv1;
        boolean oldPgv1ESet = pgv1ESet;
        pgv1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__PGV1, oldPgv1, pgv1, !oldPgv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv1() {
        Float oldPgv1 = pgv1;
        boolean oldPgv1ESet = pgv1ESet;
        pgv1 = PGV1_EDEFAULT;
        pgv1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__PGV1, oldPgv1, PGV1_EDEFAULT, oldPgv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv1() {
        return pgv1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPgv2() {
        return pgv2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv2( Float newPgv2 ) {
        Float oldPgv2 = pgv2;
        pgv2 = newPgv2;
        boolean oldPgv2ESet = pgv2ESet;
        pgv2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__PGV2, oldPgv2, pgv2, !oldPgv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv2() {
        Float oldPgv2 = pgv2;
        boolean oldPgv2ESet = pgv2ESet;
        pgv2 = PGV2_EDEFAULT;
        pgv2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__PGV2, oldPgv2, PGV2_EDEFAULT, oldPgv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv2() {
        return pgv2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPgv3() {
        return pgv3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv3( Float newPgv3 ) {
        Float oldPgv3 = pgv3;
        pgv3 = newPgv3;
        boolean oldPgv3ESet = pgv3ESet;
        pgv3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__PGV3, oldPgv3, pgv3, !oldPgv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv3() {
        Float oldPgv3 = pgv3;
        boolean oldPgv3ESet = pgv3ESet;
        pgv3 = PGV3_EDEFAULT;
        pgv3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__PGV3, oldPgv3, PGV3_EDEFAULT, oldPgv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv3() {
        return pgv3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPgv4() {
        return pgv4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv4( Float newPgv4 ) {
        Float oldPgv4 = pgv4;
        pgv4 = newPgv4;
        boolean oldPgv4ESet = pgv4ESet;
        pgv4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__PGV4, oldPgv4, pgv4, !oldPgv4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv4() {
        Float oldPgv4 = pgv4;
        boolean oldPgv4ESet = pgv4ESet;
        pgv4 = PGV4_EDEFAULT;
        pgv4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__PGV4, oldPgv4, PGV4_EDEFAULT, oldPgv4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv4() {
        return pgv4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPgv5() {
        return pgv5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv5( Float newPgv5 ) {
        Float oldPgv5 = pgv5;
        pgv5 = newPgv5;
        boolean oldPgv5ESet = pgv5ESet;
        pgv5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__PGV5, oldPgv5, pgv5, !oldPgv5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv5() {
        Float oldPgv5 = pgv5;
        boolean oldPgv5ESet = pgv5ESet;
        pgv5 = PGV5_EDEFAULT;
        pgv5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__PGV5, oldPgv5, PGV5_EDEFAULT, oldPgv5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv5() {
        return pgv5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPgv6() {
        return pgv6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv6( Float newPgv6 ) {
        Float oldPgv6 = pgv6;
        pgv6 = newPgv6;
        boolean oldPgv6ESet = pgv6ESet;
        pgv6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__PGV6, oldPgv6, pgv6, !oldPgv6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv6() {
        Float oldPgv6 = pgv6;
        boolean oldPgv6ESet = pgv6ESet;
        pgv6 = PGV6_EDEFAULT;
        pgv6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__PGV6, oldPgv6, PGV6_EDEFAULT, oldPgv6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv6() {
        return pgv6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST1__R,
                oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRmax() {
        return rmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRmax( Float newRmax ) {
        Float oldRmax = rmax;
        rmax = newRmax;
        boolean oldRmaxESet = rmaxESet;
        rmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__RMAX, oldRmax, rmax, !oldRmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRmax() {
        Float oldRmax = rmax;
        boolean oldRmaxESet = rmaxESet;
        rmax = RMAX_EDEFAULT;
        rmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__RMAX, oldRmax, RMAX_EDEFAULT, oldRmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRmax() {
        return rmaxESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__T1, oldT1, t1, !oldT1ESet ) );
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
                CimPackage.GOV_GAST1__T1, oldT1, T1_EDEFAULT, oldT1ESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__T2, oldT2, t2, !oldT2ESet ) );
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
                CimPackage.GOV_GAST1__T2, oldT2, T2_EDEFAULT, oldT2ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__T3, oldT3, t3, !oldT3ESet ) );
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
                CimPackage.GOV_GAST1__T3, oldT3, T3_EDEFAULT, oldT3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__T4, oldT4, t4, !oldT4ESet ) );
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
                CimPackage.GOV_GAST1__T4, oldT4, T4_EDEFAULT, oldT4ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST1__T5, oldT5, t5, !oldT5ESet ) );
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
                CimPackage.GOV_GAST1__T5, oldT5, T5_EDEFAULT, oldT5ESet ) );
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
    public Float getTltr() {
        return tltr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTltr( Float newTltr ) {
        Float oldTltr = tltr;
        tltr = newTltr;
        boolean oldTltrESet = tltrESet;
        tltrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__TLTR, oldTltr, tltr, !oldTltrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTltr() {
        Float oldTltr = tltr;
        boolean oldTltrESet = tltrESet;
        tltr = TLTR_EDEFAULT;
        tltrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__TLTR, oldTltr, TLTR_EDEFAULT, oldTltrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTltr() {
        return tltrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVmax() {
        return vmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmax( Float newVmax ) {
        Float oldVmax = vmax;
        vmax = newVmax;
        boolean oldVmaxESet = vmaxESet;
        vmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__VMAX, oldVmax, vmax, !oldVmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmax() {
        Float oldVmax = vmax;
        boolean oldVmaxESet = vmaxESet;
        vmax = VMAX_EDEFAULT;
        vmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__VMAX, oldVmax, VMAX_EDEFAULT, oldVmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmax() {
        return vmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVmin() {
        return vmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmin( Float newVmin ) {
        Float oldVmin = vmin;
        vmin = newVmin;
        boolean oldVminESet = vminESet;
        vminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST1__VMIN, oldVmin, vmin, !oldVminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmin() {
        Float oldVmin = vmin;
        boolean oldVminESet = vminESet;
        vmin = VMIN_EDEFAULT;
        vminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST1__VMIN, oldVmin, VMIN_EDEFAULT, oldVminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmin() {
        return vminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_GAST1__A:
            return getA();
        case CimPackage.GOV_GAST1__B:
            return getB();
        case CimPackage.GOV_GAST1__DB1:
            return getDb1();
        case CimPackage.GOV_GAST1__DB2:
            return getDb2();
        case CimPackage.GOV_GAST1__EPS:
            return getEps();
        case CimPackage.GOV_GAST1__FIDLE:
            return getFidle();
        case CimPackage.GOV_GAST1__GV1:
            return getGv1();
        case CimPackage.GOV_GAST1__GV2:
            return getGv2();
        case CimPackage.GOV_GAST1__GV3:
            return getGv3();
        case CimPackage.GOV_GAST1__GV4:
            return getGv4();
        case CimPackage.GOV_GAST1__GV5:
            return getGv5();
        case CimPackage.GOV_GAST1__GV6:
            return getGv6();
        case CimPackage.GOV_GAST1__KA:
            return getKa();
        case CimPackage.GOV_GAST1__KT:
            return getKt();
        case CimPackage.GOV_GAST1__LMAX:
            return getLmax();
        case CimPackage.GOV_GAST1__LOADINC:
            return getLoadinc();
        case CimPackage.GOV_GAST1__LTRATE:
            return getLtrate();
        case CimPackage.GOV_GAST1__MWBASE:
            return getMwbase();
        case CimPackage.GOV_GAST1__PGV1:
            return getPgv1();
        case CimPackage.GOV_GAST1__PGV2:
            return getPgv2();
        case CimPackage.GOV_GAST1__PGV3:
            return getPgv3();
        case CimPackage.GOV_GAST1__PGV4:
            return getPgv4();
        case CimPackage.GOV_GAST1__PGV5:
            return getPgv5();
        case CimPackage.GOV_GAST1__PGV6:
            return getPgv6();
        case CimPackage.GOV_GAST1__R:
            return getR();
        case CimPackage.GOV_GAST1__RMAX:
            return getRmax();
        case CimPackage.GOV_GAST1__T1:
            return getT1();
        case CimPackage.GOV_GAST1__T2:
            return getT2();
        case CimPackage.GOV_GAST1__T3:
            return getT3();
        case CimPackage.GOV_GAST1__T4:
            return getT4();
        case CimPackage.GOV_GAST1__T5:
            return getT5();
        case CimPackage.GOV_GAST1__TLTR:
            return getTltr();
        case CimPackage.GOV_GAST1__VMAX:
            return getVmax();
        case CimPackage.GOV_GAST1__VMIN:
            return getVmin();
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
        case CimPackage.GOV_GAST1__A:
            setA( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__B:
            setB( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__DB1:
            setDb1( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__DB2:
            setDb2( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__EPS:
            setEps( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__FIDLE:
            setFidle( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__GV1:
            setGv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__GV2:
            setGv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__GV3:
            setGv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__GV4:
            setGv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__GV5:
            setGv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__GV6:
            setGv6( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__KT:
            setKt( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__LMAX:
            setLmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__LOADINC:
            setLoadinc( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__LTRATE:
            setLtrate( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__PGV1:
            setPgv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__PGV2:
            setPgv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__PGV3:
            setPgv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__PGV4:
            setPgv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__PGV5:
            setPgv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__PGV6:
            setPgv6( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__RMAX:
            setRmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__T1:
            setT1( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__T2:
            setT2( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__T3:
            setT3( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__T4:
            setT4( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__T5:
            setT5( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__TLTR:
            setTltr( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__VMAX:
            setVmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST1__VMIN:
            setVmin( ( Float ) newValue );
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
        case CimPackage.GOV_GAST1__A:
            unsetA();
            return;
        case CimPackage.GOV_GAST1__B:
            unsetB();
            return;
        case CimPackage.GOV_GAST1__DB1:
            unsetDb1();
            return;
        case CimPackage.GOV_GAST1__DB2:
            unsetDb2();
            return;
        case CimPackage.GOV_GAST1__EPS:
            unsetEps();
            return;
        case CimPackage.GOV_GAST1__FIDLE:
            unsetFidle();
            return;
        case CimPackage.GOV_GAST1__GV1:
            unsetGv1();
            return;
        case CimPackage.GOV_GAST1__GV2:
            unsetGv2();
            return;
        case CimPackage.GOV_GAST1__GV3:
            unsetGv3();
            return;
        case CimPackage.GOV_GAST1__GV4:
            unsetGv4();
            return;
        case CimPackage.GOV_GAST1__GV5:
            unsetGv5();
            return;
        case CimPackage.GOV_GAST1__GV6:
            unsetGv6();
            return;
        case CimPackage.GOV_GAST1__KA:
            unsetKa();
            return;
        case CimPackage.GOV_GAST1__KT:
            unsetKt();
            return;
        case CimPackage.GOV_GAST1__LMAX:
            unsetLmax();
            return;
        case CimPackage.GOV_GAST1__LOADINC:
            unsetLoadinc();
            return;
        case CimPackage.GOV_GAST1__LTRATE:
            unsetLtrate();
            return;
        case CimPackage.GOV_GAST1__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_GAST1__PGV1:
            unsetPgv1();
            return;
        case CimPackage.GOV_GAST1__PGV2:
            unsetPgv2();
            return;
        case CimPackage.GOV_GAST1__PGV3:
            unsetPgv3();
            return;
        case CimPackage.GOV_GAST1__PGV4:
            unsetPgv4();
            return;
        case CimPackage.GOV_GAST1__PGV5:
            unsetPgv5();
            return;
        case CimPackage.GOV_GAST1__PGV6:
            unsetPgv6();
            return;
        case CimPackage.GOV_GAST1__R:
            unsetR();
            return;
        case CimPackage.GOV_GAST1__RMAX:
            unsetRmax();
            return;
        case CimPackage.GOV_GAST1__T1:
            unsetT1();
            return;
        case CimPackage.GOV_GAST1__T2:
            unsetT2();
            return;
        case CimPackage.GOV_GAST1__T3:
            unsetT3();
            return;
        case CimPackage.GOV_GAST1__T4:
            unsetT4();
            return;
        case CimPackage.GOV_GAST1__T5:
            unsetT5();
            return;
        case CimPackage.GOV_GAST1__TLTR:
            unsetTltr();
            return;
        case CimPackage.GOV_GAST1__VMAX:
            unsetVmax();
            return;
        case CimPackage.GOV_GAST1__VMIN:
            unsetVmin();
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
        case CimPackage.GOV_GAST1__A:
            return isSetA();
        case CimPackage.GOV_GAST1__B:
            return isSetB();
        case CimPackage.GOV_GAST1__DB1:
            return isSetDb1();
        case CimPackage.GOV_GAST1__DB2:
            return isSetDb2();
        case CimPackage.GOV_GAST1__EPS:
            return isSetEps();
        case CimPackage.GOV_GAST1__FIDLE:
            return isSetFidle();
        case CimPackage.GOV_GAST1__GV1:
            return isSetGv1();
        case CimPackage.GOV_GAST1__GV2:
            return isSetGv2();
        case CimPackage.GOV_GAST1__GV3:
            return isSetGv3();
        case CimPackage.GOV_GAST1__GV4:
            return isSetGv4();
        case CimPackage.GOV_GAST1__GV5:
            return isSetGv5();
        case CimPackage.GOV_GAST1__GV6:
            return isSetGv6();
        case CimPackage.GOV_GAST1__KA:
            return isSetKa();
        case CimPackage.GOV_GAST1__KT:
            return isSetKt();
        case CimPackage.GOV_GAST1__LMAX:
            return isSetLmax();
        case CimPackage.GOV_GAST1__LOADINC:
            return isSetLoadinc();
        case CimPackage.GOV_GAST1__LTRATE:
            return isSetLtrate();
        case CimPackage.GOV_GAST1__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_GAST1__PGV1:
            return isSetPgv1();
        case CimPackage.GOV_GAST1__PGV2:
            return isSetPgv2();
        case CimPackage.GOV_GAST1__PGV3:
            return isSetPgv3();
        case CimPackage.GOV_GAST1__PGV4:
            return isSetPgv4();
        case CimPackage.GOV_GAST1__PGV5:
            return isSetPgv5();
        case CimPackage.GOV_GAST1__PGV6:
            return isSetPgv6();
        case CimPackage.GOV_GAST1__R:
            return isSetR();
        case CimPackage.GOV_GAST1__RMAX:
            return isSetRmax();
        case CimPackage.GOV_GAST1__T1:
            return isSetT1();
        case CimPackage.GOV_GAST1__T2:
            return isSetT2();
        case CimPackage.GOV_GAST1__T3:
            return isSetT3();
        case CimPackage.GOV_GAST1__T4:
            return isSetT4();
        case CimPackage.GOV_GAST1__T5:
            return isSetT5();
        case CimPackage.GOV_GAST1__TLTR:
            return isSetTltr();
        case CimPackage.GOV_GAST1__VMAX:
            return isSetVmax();
        case CimPackage.GOV_GAST1__VMIN:
            return isSetVmin();
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
        result.append( " (a: " );
        if( aESet )
            result.append( a );
        else
            result.append( "<unset>" );
        result.append( ", b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", db1: " );
        if( db1ESet )
            result.append( db1 );
        else
            result.append( "<unset>" );
        result.append( ", db2: " );
        if( db2ESet )
            result.append( db2 );
        else
            result.append( "<unset>" );
        result.append( ", eps: " );
        if( epsESet )
            result.append( eps );
        else
            result.append( "<unset>" );
        result.append( ", fidle: " );
        if( fidleESet )
            result.append( fidle );
        else
            result.append( "<unset>" );
        result.append( ", gv1: " );
        if( gv1ESet )
            result.append( gv1 );
        else
            result.append( "<unset>" );
        result.append( ", gv2: " );
        if( gv2ESet )
            result.append( gv2 );
        else
            result.append( "<unset>" );
        result.append( ", gv3: " );
        if( gv3ESet )
            result.append( gv3 );
        else
            result.append( "<unset>" );
        result.append( ", gv4: " );
        if( gv4ESet )
            result.append( gv4 );
        else
            result.append( "<unset>" );
        result.append( ", gv5: " );
        if( gv5ESet )
            result.append( gv5 );
        else
            result.append( "<unset>" );
        result.append( ", gv6: " );
        if( gv6ESet )
            result.append( gv6 );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kt: " );
        if( ktESet )
            result.append( kt );
        else
            result.append( "<unset>" );
        result.append( ", lmax: " );
        if( lmaxESet )
            result.append( lmax );
        else
            result.append( "<unset>" );
        result.append( ", loadinc: " );
        if( loadincESet )
            result.append( loadinc );
        else
            result.append( "<unset>" );
        result.append( ", ltrate: " );
        if( ltrateESet )
            result.append( ltrate );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", pgv1: " );
        if( pgv1ESet )
            result.append( pgv1 );
        else
            result.append( "<unset>" );
        result.append( ", pgv2: " );
        if( pgv2ESet )
            result.append( pgv2 );
        else
            result.append( "<unset>" );
        result.append( ", pgv3: " );
        if( pgv3ESet )
            result.append( pgv3 );
        else
            result.append( "<unset>" );
        result.append( ", pgv4: " );
        if( pgv4ESet )
            result.append( pgv4 );
        else
            result.append( "<unset>" );
        result.append( ", pgv5: " );
        if( pgv5ESet )
            result.append( pgv5 );
        else
            result.append( "<unset>" );
        result.append( ", pgv6: " );
        if( pgv6ESet )
            result.append( pgv6 );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", rmax: " );
        if( rmaxESet )
            result.append( rmax );
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
        result.append( ", tltr: " );
        if( tltrESet )
            result.append( tltr );
        else
            result.append( "<unset>" );
        result.append( ", vmax: " );
        if( vmaxESet )
            result.append( vmax );
        else
            result.append( "<unset>" );
        result.append( ", vmin: " );
        if( vminESet )
            result.append( vmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovGAST1Impl
