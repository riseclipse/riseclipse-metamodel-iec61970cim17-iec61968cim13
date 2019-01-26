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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroR;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Hydro R</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getAt <em>At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getEps <em>Eps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getGv6 <em>Gv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getH0 <em>H0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getInputSignal <em>Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPgv4 <em>Pgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPgv5 <em>Pgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPgv6 <em>Pgv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getQnl <em>Qnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT7 <em>T7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getT8 <em>T8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getVelcl <em>Velcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroRImpl#getVelop <em>Velop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovHydroRImpl extends TurbineGovernorDynamicsImpl implements GovHydroR {
    /**
     * The default value of the '{@link #getAt() <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAt()
     * @generated
     * @ordered
     */
    protected static final Float AT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAt() <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAt()
     * @generated
     * @ordered
     */
    protected Float at = AT_EDEFAULT;

    /**
     * This is true if the At attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean atESet;

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
     * The default value of the '{@link #getDturb() <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDturb()
     * @generated
     * @ordered
     */
    protected static final Float DTURB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDturb() <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDturb()
     * @generated
     * @ordered
     */
    protected Float dturb = DTURB_EDEFAULT;

    /**
     * This is true if the Dturb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dturbESet;

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
     * The default value of the '{@link #getGmax() <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmax()
     * @generated
     * @ordered
     */
    protected static final Float GMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGmax() <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmax()
     * @generated
     * @ordered
     */
    protected Float gmax = GMAX_EDEFAULT;

    /**
     * This is true if the Gmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gmaxESet;

    /**
     * The default value of the '{@link #getGmin() <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmin()
     * @generated
     * @ordered
     */
    protected static final Float GMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGmin() <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmin()
     * @generated
     * @ordered
     */
    protected Float gmin = GMIN_EDEFAULT;

    /**
     * This is true if the Gmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gminESet;

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
     * The default value of the '{@link #getH0() <em>H0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH0()
     * @generated
     * @ordered
     */
    protected static final Float H0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getH0() <em>H0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH0()
     * @generated
     * @ordered
     */
    protected Float h0 = H0_EDEFAULT;

    /**
     * This is true if the H0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean h0ESet;

    /**
     * The default value of the '{@link #getInputSignal() <em>Input Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignal()
     * @generated
     * @ordered
     */
    protected static final Boolean INPUT_SIGNAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputSignal() <em>Input Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignal()
     * @generated
     * @ordered
     */
    protected Boolean inputSignal = INPUT_SIGNAL_EDEFAULT;

    /**
     * This is true if the Input Signal attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inputSignalESet;

    /**
     * The default value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected static final Float KG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected Float kg = KG_EDEFAULT;

    /**
     * This is true if the Kg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kgESet;

    /**
     * The default value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected static final Float KI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected Float ki = KI_EDEFAULT;

    /**
     * This is true if the Ki attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiESet;

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
     * The default value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected static final Float PMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected Float pmax = PMAX_EDEFAULT;

    /**
     * This is true if the Pmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmaxESet;

    /**
     * The default value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected static final Float PMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected Float pmin = PMIN_EDEFAULT;

    /**
     * This is true if the Pmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pminESet;

    /**
     * The default value of the '{@link #getQnl() <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQnl()
     * @generated
     * @ordered
     */
    protected static final Float QNL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQnl() <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQnl()
     * @generated
     * @ordered
     */
    protected Float qnl = QNL_EDEFAULT;

    /**
     * This is true if the Qnl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qnlESet;

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
     * The default value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected static final Float TD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected Float td = TD_EDEFAULT;

    /**
     * This is true if the Td attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdESet;

    /**
     * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected static final Float TP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected Float tp = TP_EDEFAULT;

    /**
     * This is true if the Tp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpESet;

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
     * The default value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected static final Float TW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected Float tw = TW_EDEFAULT;

    /**
     * This is true if the Tw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twESet;

    /**
     * The default value of the '{@link #getVelcl() <em>Velcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelcl()
     * @generated
     * @ordered
     */
    protected static final Float VELCL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVelcl() <em>Velcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelcl()
     * @generated
     * @ordered
     */
    protected Float velcl = VELCL_EDEFAULT;

    /**
     * This is true if the Velcl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean velclESet;

    /**
     * The default value of the '{@link #getVelop() <em>Velop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelop()
     * @generated
     * @ordered
     */
    protected static final Float VELOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVelop() <em>Velop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelop()
     * @generated
     * @ordered
     */
    protected Float velop = VELOP_EDEFAULT;

    /**
     * This is true if the Velop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean velopESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovHydroRImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovHydroR();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAt() {
        return at;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAt( Float newAt ) {
        Float oldAt = at;
        at = newAt;
        boolean oldAtESet = atESet;
        atESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__AT, oldAt, at, !oldAtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAt() {
        Float oldAt = at;
        boolean oldAtESet = atESet;
        at = AT_EDEFAULT;
        atESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__AT, oldAt, AT_EDEFAULT, oldAtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAt() {
        return atESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__DB1, oldDb1, db1, !oldDb1ESet ) );
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
                CimPackage.GOV_HYDRO_R__DB1, oldDb1, DB1_EDEFAULT, oldDb1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__DB2, oldDb2, db2, !oldDb2ESet ) );
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
                CimPackage.GOV_HYDRO_R__DB2, oldDb2, DB2_EDEFAULT, oldDb2ESet ) );
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
    public Float getDturb() {
        return dturb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDturb( Float newDturb ) {
        Float oldDturb = dturb;
        dturb = newDturb;
        boolean oldDturbESet = dturbESet;
        dturbESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__DTURB, oldDturb, dturb, !oldDturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDturb() {
        Float oldDturb = dturb;
        boolean oldDturbESet = dturbESet;
        dturb = DTURB_EDEFAULT;
        dturbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__DTURB, oldDturb, DTURB_EDEFAULT, oldDturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDturb() {
        return dturbESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__EPS, oldEps, eps, !oldEpsESet ) );
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
                CimPackage.GOV_HYDRO_R__EPS, oldEps, EPS_EDEFAULT, oldEpsESet ) );
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
    public Float getGmax() {
        return gmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGmax( Float newGmax ) {
        Float oldGmax = gmax;
        gmax = newGmax;
        boolean oldGmaxESet = gmaxESet;
        gmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GMAX, oldGmax, gmax, !oldGmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGmax() {
        Float oldGmax = gmax;
        boolean oldGmaxESet = gmaxESet;
        gmax = GMAX_EDEFAULT;
        gmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__GMAX, oldGmax, GMAX_EDEFAULT, oldGmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGmax() {
        return gmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGmin() {
        return gmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGmin( Float newGmin ) {
        Float oldGmin = gmin;
        gmin = newGmin;
        boolean oldGminESet = gminESet;
        gminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GMIN, oldGmin, gmin, !oldGminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGmin() {
        Float oldGmin = gmin;
        boolean oldGminESet = gminESet;
        gmin = GMIN_EDEFAULT;
        gminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__GMIN, oldGmin, GMIN_EDEFAULT, oldGminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGmin() {
        return gminESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GV1, oldGv1, gv1, !oldGv1ESet ) );
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
                CimPackage.GOV_HYDRO_R__GV1, oldGv1, GV1_EDEFAULT, oldGv1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GV2, oldGv2, gv2, !oldGv2ESet ) );
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
                CimPackage.GOV_HYDRO_R__GV2, oldGv2, GV2_EDEFAULT, oldGv2ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GV3, oldGv3, gv3, !oldGv3ESet ) );
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
                CimPackage.GOV_HYDRO_R__GV3, oldGv3, GV3_EDEFAULT, oldGv3ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GV4, oldGv4, gv4, !oldGv4ESet ) );
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
                CimPackage.GOV_HYDRO_R__GV4, oldGv4, GV4_EDEFAULT, oldGv4ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GV5, oldGv5, gv5, !oldGv5ESet ) );
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
                CimPackage.GOV_HYDRO_R__GV5, oldGv5, GV5_EDEFAULT, oldGv5ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__GV6, oldGv6, gv6, !oldGv6ESet ) );
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
                CimPackage.GOV_HYDRO_R__GV6, oldGv6, GV6_EDEFAULT, oldGv6ESet ) );
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
    public Float getH0() {
        return h0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setH0( Float newH0 ) {
        Float oldH0 = h0;
        h0 = newH0;
        boolean oldH0ESet = h0ESet;
        h0ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__H0, oldH0, h0, !oldH0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetH0() {
        Float oldH0 = h0;
        boolean oldH0ESet = h0ESet;
        h0 = H0_EDEFAULT;
        h0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__H0, oldH0, H0_EDEFAULT, oldH0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetH0() {
        return h0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getInputSignal() {
        return inputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputSignal( Boolean newInputSignal ) {
        Boolean oldInputSignal = inputSignal;
        inputSignal = newInputSignal;
        boolean oldInputSignalESet = inputSignalESet;
        inputSignalESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__INPUT_SIGNAL, oldInputSignal, inputSignal, !oldInputSignalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInputSignal() {
        Boolean oldInputSignal = inputSignal;
        boolean oldInputSignalESet = inputSignalESet;
        inputSignal = INPUT_SIGNAL_EDEFAULT;
        inputSignalESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__INPUT_SIGNAL, oldInputSignal, INPUT_SIGNAL_EDEFAULT, oldInputSignalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputSignal() {
        return inputSignalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKg() {
        return kg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKg( Float newKg ) {
        Float oldKg = kg;
        kg = newKg;
        boolean oldKgESet = kgESet;
        kgESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__KG, oldKg, kg, !oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKg() {
        Float oldKg = kg;
        boolean oldKgESet = kgESet;
        kg = KG_EDEFAULT;
        kgESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__KG, oldKg, KG_EDEFAULT, oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKg() {
        return kgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKi() {
        return ki;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi( Float newKi ) {
        Float oldKi = ki;
        ki = newKi;
        boolean oldKiESet = kiESet;
        kiESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__KI, oldKi, ki, !oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi() {
        Float oldKi = ki;
        boolean oldKiESet = kiESet;
        ki = KI_EDEFAULT;
        kiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__KI, oldKi, KI_EDEFAULT, oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi() {
        return kiESet;
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
                CimPackage.GOV_HYDRO_R__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
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
                CimPackage.GOV_HYDRO_R__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV1, oldPgv1, pgv1, !oldPgv1ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV1, oldPgv1, PGV1_EDEFAULT, oldPgv1ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV2, oldPgv2, pgv2, !oldPgv2ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV2, oldPgv2, PGV2_EDEFAULT, oldPgv2ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV3, oldPgv3, pgv3, !oldPgv3ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV3, oldPgv3, PGV3_EDEFAULT, oldPgv3ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV4, oldPgv4, pgv4, !oldPgv4ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV4, oldPgv4, PGV4_EDEFAULT, oldPgv4ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV5, oldPgv5, pgv5, !oldPgv5ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV5, oldPgv5, PGV5_EDEFAULT, oldPgv5ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV6, oldPgv6, pgv6, !oldPgv6ESet ) );
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
                CimPackage.GOV_HYDRO_R__PGV6, oldPgv6, PGV6_EDEFAULT, oldPgv6ESet ) );
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
    public Float getPmax() {
        return pmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmax( Float newPmax ) {
        Float oldPmax = pmax;
        pmax = newPmax;
        boolean oldPmaxESet = pmaxESet;
        pmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__PMAX, oldPmax, pmax, !oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmax() {
        Float oldPmax = pmax;
        boolean oldPmaxESet = pmaxESet;
        pmax = PMAX_EDEFAULT;
        pmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__PMAX, oldPmax, PMAX_EDEFAULT, oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmax() {
        return pmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmin() {
        return pmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmin( Float newPmin ) {
        Float oldPmin = pmin;
        pmin = newPmin;
        boolean oldPminESet = pminESet;
        pminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__PMIN, oldPmin, pmin, !oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmin() {
        Float oldPmin = pmin;
        boolean oldPminESet = pminESet;
        pmin = PMIN_EDEFAULT;
        pminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__PMIN, oldPmin, PMIN_EDEFAULT, oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmin() {
        return pminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQnl() {
        return qnl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQnl( Float newQnl ) {
        Float oldQnl = qnl;
        qnl = newQnl;
        boolean oldQnlESet = qnlESet;
        qnlESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__QNL, oldQnl, qnl, !oldQnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQnl() {
        Float oldQnl = qnl;
        boolean oldQnlESet = qnlESet;
        qnl = QNL_EDEFAULT;
        qnlESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__QNL, oldQnl, QNL_EDEFAULT, oldQnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQnl() {
        return qnlESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__R, oldR, r, !oldRESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__R, oldR, R_EDEFAULT, oldRESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T1, oldT1, t1, !oldT1ESet ) );
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
                CimPackage.GOV_HYDRO_R__T1, oldT1, T1_EDEFAULT, oldT1ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T2, oldT2, t2, !oldT2ESet ) );
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
                CimPackage.GOV_HYDRO_R__T2, oldT2, T2_EDEFAULT, oldT2ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T3, oldT3, t3, !oldT3ESet ) );
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
                CimPackage.GOV_HYDRO_R__T3, oldT3, T3_EDEFAULT, oldT3ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T4, oldT4, t4, !oldT4ESet ) );
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
                CimPackage.GOV_HYDRO_R__T4, oldT4, T4_EDEFAULT, oldT4ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T5, oldT5, t5, !oldT5ESet ) );
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
                CimPackage.GOV_HYDRO_R__T5, oldT5, T5_EDEFAULT, oldT5ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T6, oldT6, t6, !oldT6ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__T6, oldT6, T6_EDEFAULT, oldT6ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T7, oldT7, t7, !oldT7ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__T7, oldT7, T7_EDEFAULT, oldT7ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__T8, oldT8, t8, !oldT8ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__T8, oldT8, T8_EDEFAULT, oldT8ESet ) );
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
    public Float getTd() {
        return td;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd( Float newTd ) {
        Float oldTd = td;
        td = newTd;
        boolean oldTdESet = tdESet;
        tdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__TD, oldTd, td, !oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd() {
        Float oldTd = td;
        boolean oldTdESet = tdESet;
        td = TD_EDEFAULT;
        tdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__TD, oldTd, TD_EDEFAULT, oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd() {
        return tdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTp() {
        return tp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTp( Float newTp ) {
        Float oldTp = tp;
        tp = newTp;
        boolean oldTpESet = tpESet;
        tpESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__TP, oldTp, tp, !oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTp() {
        Float oldTp = tp;
        boolean oldTpESet = tpESet;
        tp = TP_EDEFAULT;
        tpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__TP, oldTp, TP_EDEFAULT, oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTp() {
        return tpESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__TT, oldTt, tt, !oldTtESet ) );
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
                CimPackage.GOV_HYDRO_R__TT, oldTt, TT_EDEFAULT, oldTtESet ) );
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
    public Float getTw() {
        return tw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw( Float newTw ) {
        Float oldTw = tw;
        tw = newTw;
        boolean oldTwESet = twESet;
        twESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_R__TW, oldTw, tw, !oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw() {
        Float oldTw = tw;
        boolean oldTwESet = twESet;
        tw = TW_EDEFAULT;
        twESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__TW, oldTw, TW_EDEFAULT, oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw() {
        return twESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVelcl() {
        return velcl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVelcl( Float newVelcl ) {
        Float oldVelcl = velcl;
        velcl = newVelcl;
        boolean oldVelclESet = velclESet;
        velclESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__VELCL, oldVelcl, velcl, !oldVelclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVelcl() {
        Float oldVelcl = velcl;
        boolean oldVelclESet = velclESet;
        velcl = VELCL_EDEFAULT;
        velclESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__VELCL, oldVelcl, VELCL_EDEFAULT, oldVelclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVelcl() {
        return velclESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVelop() {
        return velop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVelop( Float newVelop ) {
        Float oldVelop = velop;
        velop = newVelop;
        boolean oldVelopESet = velopESet;
        velopESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_R__VELOP, oldVelop, velop, !oldVelopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVelop() {
        Float oldVelop = velop;
        boolean oldVelopESet = velopESet;
        velop = VELOP_EDEFAULT;
        velopESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_R__VELOP, oldVelop, VELOP_EDEFAULT, oldVelopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVelop() {
        return velopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_HYDRO_R__AT:
            return getAt();
        case CimPackage.GOV_HYDRO_R__DB1:
            return getDb1();
        case CimPackage.GOV_HYDRO_R__DB2:
            return getDb2();
        case CimPackage.GOV_HYDRO_R__DTURB:
            return getDturb();
        case CimPackage.GOV_HYDRO_R__EPS:
            return getEps();
        case CimPackage.GOV_HYDRO_R__GMAX:
            return getGmax();
        case CimPackage.GOV_HYDRO_R__GMIN:
            return getGmin();
        case CimPackage.GOV_HYDRO_R__GV1:
            return getGv1();
        case CimPackage.GOV_HYDRO_R__GV2:
            return getGv2();
        case CimPackage.GOV_HYDRO_R__GV3:
            return getGv3();
        case CimPackage.GOV_HYDRO_R__GV4:
            return getGv4();
        case CimPackage.GOV_HYDRO_R__GV5:
            return getGv5();
        case CimPackage.GOV_HYDRO_R__GV6:
            return getGv6();
        case CimPackage.GOV_HYDRO_R__H0:
            return getH0();
        case CimPackage.GOV_HYDRO_R__INPUT_SIGNAL:
            return getInputSignal();
        case CimPackage.GOV_HYDRO_R__KG:
            return getKg();
        case CimPackage.GOV_HYDRO_R__KI:
            return getKi();
        case CimPackage.GOV_HYDRO_R__MWBASE:
            return getMwbase();
        case CimPackage.GOV_HYDRO_R__PGV1:
            return getPgv1();
        case CimPackage.GOV_HYDRO_R__PGV2:
            return getPgv2();
        case CimPackage.GOV_HYDRO_R__PGV3:
            return getPgv3();
        case CimPackage.GOV_HYDRO_R__PGV4:
            return getPgv4();
        case CimPackage.GOV_HYDRO_R__PGV5:
            return getPgv5();
        case CimPackage.GOV_HYDRO_R__PGV6:
            return getPgv6();
        case CimPackage.GOV_HYDRO_R__PMAX:
            return getPmax();
        case CimPackage.GOV_HYDRO_R__PMIN:
            return getPmin();
        case CimPackage.GOV_HYDRO_R__QNL:
            return getQnl();
        case CimPackage.GOV_HYDRO_R__R:
            return getR();
        case CimPackage.GOV_HYDRO_R__T1:
            return getT1();
        case CimPackage.GOV_HYDRO_R__T2:
            return getT2();
        case CimPackage.GOV_HYDRO_R__T3:
            return getT3();
        case CimPackage.GOV_HYDRO_R__T4:
            return getT4();
        case CimPackage.GOV_HYDRO_R__T5:
            return getT5();
        case CimPackage.GOV_HYDRO_R__T6:
            return getT6();
        case CimPackage.GOV_HYDRO_R__T7:
            return getT7();
        case CimPackage.GOV_HYDRO_R__T8:
            return getT8();
        case CimPackage.GOV_HYDRO_R__TD:
            return getTd();
        case CimPackage.GOV_HYDRO_R__TP:
            return getTp();
        case CimPackage.GOV_HYDRO_R__TT:
            return getTt();
        case CimPackage.GOV_HYDRO_R__TW:
            return getTw();
        case CimPackage.GOV_HYDRO_R__VELCL:
            return getVelcl();
        case CimPackage.GOV_HYDRO_R__VELOP:
            return getVelop();
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
        case CimPackage.GOV_HYDRO_R__AT:
            setAt( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__DB1:
            setDb1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__DB2:
            setDb2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__DTURB:
            setDturb( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__EPS:
            setEps( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GMAX:
            setGmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GMIN:
            setGmin( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GV1:
            setGv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GV2:
            setGv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GV3:
            setGv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GV4:
            setGv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GV5:
            setGv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__GV6:
            setGv6( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__H0:
            setH0( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__INPUT_SIGNAL:
            setInputSignal( ( Boolean ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__KG:
            setKg( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PGV1:
            setPgv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PGV2:
            setPgv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PGV3:
            setPgv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PGV4:
            setPgv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PGV5:
            setPgv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PGV6:
            setPgv6( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PMAX:
            setPmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__PMIN:
            setPmin( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__QNL:
            setQnl( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T1:
            setT1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T2:
            setT2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T3:
            setT3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T4:
            setT4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T5:
            setT5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T6:
            setT6( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T7:
            setT7( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__T8:
            setT8( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__TD:
            setTd( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__TP:
            setTp( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__TT:
            setTt( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__TW:
            setTw( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__VELCL:
            setVelcl( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_R__VELOP:
            setVelop( ( Float ) newValue );
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
        case CimPackage.GOV_HYDRO_R__AT:
            unsetAt();
            return;
        case CimPackage.GOV_HYDRO_R__DB1:
            unsetDb1();
            return;
        case CimPackage.GOV_HYDRO_R__DB2:
            unsetDb2();
            return;
        case CimPackage.GOV_HYDRO_R__DTURB:
            unsetDturb();
            return;
        case CimPackage.GOV_HYDRO_R__EPS:
            unsetEps();
            return;
        case CimPackage.GOV_HYDRO_R__GMAX:
            unsetGmax();
            return;
        case CimPackage.GOV_HYDRO_R__GMIN:
            unsetGmin();
            return;
        case CimPackage.GOV_HYDRO_R__GV1:
            unsetGv1();
            return;
        case CimPackage.GOV_HYDRO_R__GV2:
            unsetGv2();
            return;
        case CimPackage.GOV_HYDRO_R__GV3:
            unsetGv3();
            return;
        case CimPackage.GOV_HYDRO_R__GV4:
            unsetGv4();
            return;
        case CimPackage.GOV_HYDRO_R__GV5:
            unsetGv5();
            return;
        case CimPackage.GOV_HYDRO_R__GV6:
            unsetGv6();
            return;
        case CimPackage.GOV_HYDRO_R__H0:
            unsetH0();
            return;
        case CimPackage.GOV_HYDRO_R__INPUT_SIGNAL:
            unsetInputSignal();
            return;
        case CimPackage.GOV_HYDRO_R__KG:
            unsetKg();
            return;
        case CimPackage.GOV_HYDRO_R__KI:
            unsetKi();
            return;
        case CimPackage.GOV_HYDRO_R__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_HYDRO_R__PGV1:
            unsetPgv1();
            return;
        case CimPackage.GOV_HYDRO_R__PGV2:
            unsetPgv2();
            return;
        case CimPackage.GOV_HYDRO_R__PGV3:
            unsetPgv3();
            return;
        case CimPackage.GOV_HYDRO_R__PGV4:
            unsetPgv4();
            return;
        case CimPackage.GOV_HYDRO_R__PGV5:
            unsetPgv5();
            return;
        case CimPackage.GOV_HYDRO_R__PGV6:
            unsetPgv6();
            return;
        case CimPackage.GOV_HYDRO_R__PMAX:
            unsetPmax();
            return;
        case CimPackage.GOV_HYDRO_R__PMIN:
            unsetPmin();
            return;
        case CimPackage.GOV_HYDRO_R__QNL:
            unsetQnl();
            return;
        case CimPackage.GOV_HYDRO_R__R:
            unsetR();
            return;
        case CimPackage.GOV_HYDRO_R__T1:
            unsetT1();
            return;
        case CimPackage.GOV_HYDRO_R__T2:
            unsetT2();
            return;
        case CimPackage.GOV_HYDRO_R__T3:
            unsetT3();
            return;
        case CimPackage.GOV_HYDRO_R__T4:
            unsetT4();
            return;
        case CimPackage.GOV_HYDRO_R__T5:
            unsetT5();
            return;
        case CimPackage.GOV_HYDRO_R__T6:
            unsetT6();
            return;
        case CimPackage.GOV_HYDRO_R__T7:
            unsetT7();
            return;
        case CimPackage.GOV_HYDRO_R__T8:
            unsetT8();
            return;
        case CimPackage.GOV_HYDRO_R__TD:
            unsetTd();
            return;
        case CimPackage.GOV_HYDRO_R__TP:
            unsetTp();
            return;
        case CimPackage.GOV_HYDRO_R__TT:
            unsetTt();
            return;
        case CimPackage.GOV_HYDRO_R__TW:
            unsetTw();
            return;
        case CimPackage.GOV_HYDRO_R__VELCL:
            unsetVelcl();
            return;
        case CimPackage.GOV_HYDRO_R__VELOP:
            unsetVelop();
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
        case CimPackage.GOV_HYDRO_R__AT:
            return isSetAt();
        case CimPackage.GOV_HYDRO_R__DB1:
            return isSetDb1();
        case CimPackage.GOV_HYDRO_R__DB2:
            return isSetDb2();
        case CimPackage.GOV_HYDRO_R__DTURB:
            return isSetDturb();
        case CimPackage.GOV_HYDRO_R__EPS:
            return isSetEps();
        case CimPackage.GOV_HYDRO_R__GMAX:
            return isSetGmax();
        case CimPackage.GOV_HYDRO_R__GMIN:
            return isSetGmin();
        case CimPackage.GOV_HYDRO_R__GV1:
            return isSetGv1();
        case CimPackage.GOV_HYDRO_R__GV2:
            return isSetGv2();
        case CimPackage.GOV_HYDRO_R__GV3:
            return isSetGv3();
        case CimPackage.GOV_HYDRO_R__GV4:
            return isSetGv4();
        case CimPackage.GOV_HYDRO_R__GV5:
            return isSetGv5();
        case CimPackage.GOV_HYDRO_R__GV6:
            return isSetGv6();
        case CimPackage.GOV_HYDRO_R__H0:
            return isSetH0();
        case CimPackage.GOV_HYDRO_R__INPUT_SIGNAL:
            return isSetInputSignal();
        case CimPackage.GOV_HYDRO_R__KG:
            return isSetKg();
        case CimPackage.GOV_HYDRO_R__KI:
            return isSetKi();
        case CimPackage.GOV_HYDRO_R__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_HYDRO_R__PGV1:
            return isSetPgv1();
        case CimPackage.GOV_HYDRO_R__PGV2:
            return isSetPgv2();
        case CimPackage.GOV_HYDRO_R__PGV3:
            return isSetPgv3();
        case CimPackage.GOV_HYDRO_R__PGV4:
            return isSetPgv4();
        case CimPackage.GOV_HYDRO_R__PGV5:
            return isSetPgv5();
        case CimPackage.GOV_HYDRO_R__PGV6:
            return isSetPgv6();
        case CimPackage.GOV_HYDRO_R__PMAX:
            return isSetPmax();
        case CimPackage.GOV_HYDRO_R__PMIN:
            return isSetPmin();
        case CimPackage.GOV_HYDRO_R__QNL:
            return isSetQnl();
        case CimPackage.GOV_HYDRO_R__R:
            return isSetR();
        case CimPackage.GOV_HYDRO_R__T1:
            return isSetT1();
        case CimPackage.GOV_HYDRO_R__T2:
            return isSetT2();
        case CimPackage.GOV_HYDRO_R__T3:
            return isSetT3();
        case CimPackage.GOV_HYDRO_R__T4:
            return isSetT4();
        case CimPackage.GOV_HYDRO_R__T5:
            return isSetT5();
        case CimPackage.GOV_HYDRO_R__T6:
            return isSetT6();
        case CimPackage.GOV_HYDRO_R__T7:
            return isSetT7();
        case CimPackage.GOV_HYDRO_R__T8:
            return isSetT8();
        case CimPackage.GOV_HYDRO_R__TD:
            return isSetTd();
        case CimPackage.GOV_HYDRO_R__TP:
            return isSetTp();
        case CimPackage.GOV_HYDRO_R__TT:
            return isSetTt();
        case CimPackage.GOV_HYDRO_R__TW:
            return isSetTw();
        case CimPackage.GOV_HYDRO_R__VELCL:
            return isSetVelcl();
        case CimPackage.GOV_HYDRO_R__VELOP:
            return isSetVelop();
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
        result.append( " (at: " );
        if( atESet )
            result.append( at );
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
        result.append( ", dturb: " );
        if( dturbESet )
            result.append( dturb );
        else
            result.append( "<unset>" );
        result.append( ", eps: " );
        if( epsESet )
            result.append( eps );
        else
            result.append( "<unset>" );
        result.append( ", gmax: " );
        if( gmaxESet )
            result.append( gmax );
        else
            result.append( "<unset>" );
        result.append( ", gmin: " );
        if( gminESet )
            result.append( gmin );
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
        result.append( ", h0: " );
        if( h0ESet )
            result.append( h0 );
        else
            result.append( "<unset>" );
        result.append( ", inputSignal: " );
        if( inputSignalESet )
            result.append( inputSignal );
        else
            result.append( "<unset>" );
        result.append( ", kg: " );
        if( kgESet )
            result.append( kg );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
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
        result.append( ", pmax: " );
        if( pmaxESet )
            result.append( pmax );
        else
            result.append( "<unset>" );
        result.append( ", pmin: " );
        if( pminESet )
            result.append( pmin );
        else
            result.append( "<unset>" );
        result.append( ", qnl: " );
        if( qnlESet )
            result.append( qnl );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
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
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", tt: " );
        if( ttESet )
            result.append( tt );
        else
            result.append( "<unset>" );
        result.append( ", tw: " );
        if( twESet )
            result.append( tw );
        else
            result.append( "<unset>" );
        result.append( ", velcl: " );
        if( velclESet )
            result.append( velcl );
        else
            result.append( "<unset>" );
        result.append( ", velop: " );
        if( velopESet )
            result.append( velop );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovHydroRImpl
