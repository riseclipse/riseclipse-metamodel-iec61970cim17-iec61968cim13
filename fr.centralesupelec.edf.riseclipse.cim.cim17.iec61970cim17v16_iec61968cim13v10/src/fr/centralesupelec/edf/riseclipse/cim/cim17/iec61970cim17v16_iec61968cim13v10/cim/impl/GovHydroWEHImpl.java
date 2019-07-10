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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroWEH;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Hydro WEH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getDicn <em>Dicn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getDpv <em>Dpv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFeedbackSignal <em>Feedback Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFl1 <em>Fl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFl2 <em>Fl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFl3 <em>Fl3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFl4 <em>Fl4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFl5 <em>Fl5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp1 <em>Fp1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp10 <em>Fp10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp2 <em>Fp2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp3 <em>Fp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp4 <em>Fp4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp5 <em>Fp5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp6 <em>Fp6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp7 <em>Fp7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp8 <em>Fp8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getFp9 <em>Fp9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGtmxcl <em>Gtmxcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGtmxop <em>Gtmxop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss1 <em>Pmss1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss10 <em>Pmss10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss2 <em>Pmss2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss3 <em>Pmss3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss4 <em>Pmss4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss5 <em>Pmss5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss6 <em>Pmss6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss7 <em>Pmss7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss8 <em>Pmss8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getPmss9 <em>Pmss9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getRpg <em>Rpg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getRpp <em>Rpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getTdv <em>Tdv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getTpe <em>Tpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroWEHImpl#getTw <em>Tw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovHydroWEHImpl extends TurbineGovernorDynamicsImpl implements GovHydroWEH {
    /**
     * The default value of the '{@link #getDb() <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb()
     * @generated
     * @ordered
     */
    protected static final Float DB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDb() <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb()
     * @generated
     * @ordered
     */
    protected Float db = DB_EDEFAULT;

    /**
     * This is true if the Db attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dbESet;

    /**
     * The default value of the '{@link #getDicn() <em>Dicn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDicn()
     * @generated
     * @ordered
     */
    protected static final Float DICN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDicn() <em>Dicn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDicn()
     * @generated
     * @ordered
     */
    protected Float dicn = DICN_EDEFAULT;

    /**
     * This is true if the Dicn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dicnESet;

    /**
     * The default value of the '{@link #getDpv() <em>Dpv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpv()
     * @generated
     * @ordered
     */
    protected static final Float DPV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpv() <em>Dpv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpv()
     * @generated
     * @ordered
     */
    protected Float dpv = DPV_EDEFAULT;

    /**
     * This is true if the Dpv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpvESet;

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
     * The default value of the '{@link #getFeedbackSignal() <em>Feedback Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedbackSignal()
     * @generated
     * @ordered
     */
    protected static final Boolean FEEDBACK_SIGNAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeedbackSignal() <em>Feedback Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedbackSignal()
     * @generated
     * @ordered
     */
    protected Boolean feedbackSignal = FEEDBACK_SIGNAL_EDEFAULT;

    /**
     * This is true if the Feedback Signal attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean feedbackSignalESet;

    /**
     * The default value of the '{@link #getFl1() <em>Fl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl1()
     * @generated
     * @ordered
     */
    protected static final Float FL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFl1() <em>Fl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl1()
     * @generated
     * @ordered
     */
    protected Float fl1 = FL1_EDEFAULT;

    /**
     * This is true if the Fl1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fl1ESet;

    /**
     * The default value of the '{@link #getFl2() <em>Fl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl2()
     * @generated
     * @ordered
     */
    protected static final Float FL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFl2() <em>Fl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl2()
     * @generated
     * @ordered
     */
    protected Float fl2 = FL2_EDEFAULT;

    /**
     * This is true if the Fl2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fl2ESet;

    /**
     * The default value of the '{@link #getFl3() <em>Fl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl3()
     * @generated
     * @ordered
     */
    protected static final Float FL3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFl3() <em>Fl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl3()
     * @generated
     * @ordered
     */
    protected Float fl3 = FL3_EDEFAULT;

    /**
     * This is true if the Fl3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fl3ESet;

    /**
     * The default value of the '{@link #getFl4() <em>Fl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl4()
     * @generated
     * @ordered
     */
    protected static final Float FL4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFl4() <em>Fl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl4()
     * @generated
     * @ordered
     */
    protected Float fl4 = FL4_EDEFAULT;

    /**
     * This is true if the Fl4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fl4ESet;

    /**
     * The default value of the '{@link #getFl5() <em>Fl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl5()
     * @generated
     * @ordered
     */
    protected static final Float FL5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFl5() <em>Fl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFl5()
     * @generated
     * @ordered
     */
    protected Float fl5 = FL5_EDEFAULT;

    /**
     * This is true if the Fl5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fl5ESet;

    /**
     * The default value of the '{@link #getFp1() <em>Fp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp1()
     * @generated
     * @ordered
     */
    protected static final Float FP1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp1() <em>Fp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp1()
     * @generated
     * @ordered
     */
    protected Float fp1 = FP1_EDEFAULT;

    /**
     * This is true if the Fp1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp1ESet;

    /**
     * The default value of the '{@link #getFp10() <em>Fp10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp10()
     * @generated
     * @ordered
     */
    protected static final Float FP10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp10() <em>Fp10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp10()
     * @generated
     * @ordered
     */
    protected Float fp10 = FP10_EDEFAULT;

    /**
     * This is true if the Fp10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp10ESet;

    /**
     * The default value of the '{@link #getFp2() <em>Fp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp2()
     * @generated
     * @ordered
     */
    protected static final Float FP2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp2() <em>Fp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp2()
     * @generated
     * @ordered
     */
    protected Float fp2 = FP2_EDEFAULT;

    /**
     * This is true if the Fp2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp2ESet;

    /**
     * The default value of the '{@link #getFp3() <em>Fp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp3()
     * @generated
     * @ordered
     */
    protected static final Float FP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp3() <em>Fp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp3()
     * @generated
     * @ordered
     */
    protected Float fp3 = FP3_EDEFAULT;

    /**
     * This is true if the Fp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp3ESet;

    /**
     * The default value of the '{@link #getFp4() <em>Fp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp4()
     * @generated
     * @ordered
     */
    protected static final Float FP4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp4() <em>Fp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp4()
     * @generated
     * @ordered
     */
    protected Float fp4 = FP4_EDEFAULT;

    /**
     * This is true if the Fp4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp4ESet;

    /**
     * The default value of the '{@link #getFp5() <em>Fp5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp5()
     * @generated
     * @ordered
     */
    protected static final Float FP5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp5() <em>Fp5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp5()
     * @generated
     * @ordered
     */
    protected Float fp5 = FP5_EDEFAULT;

    /**
     * This is true if the Fp5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp5ESet;

    /**
     * The default value of the '{@link #getFp6() <em>Fp6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp6()
     * @generated
     * @ordered
     */
    protected static final Float FP6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp6() <em>Fp6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp6()
     * @generated
     * @ordered
     */
    protected Float fp6 = FP6_EDEFAULT;

    /**
     * This is true if the Fp6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp6ESet;

    /**
     * The default value of the '{@link #getFp7() <em>Fp7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp7()
     * @generated
     * @ordered
     */
    protected static final Float FP7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp7() <em>Fp7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp7()
     * @generated
     * @ordered
     */
    protected Float fp7 = FP7_EDEFAULT;

    /**
     * This is true if the Fp7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp7ESet;

    /**
     * The default value of the '{@link #getFp8() <em>Fp8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp8()
     * @generated
     * @ordered
     */
    protected static final Float FP8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp8() <em>Fp8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp8()
     * @generated
     * @ordered
     */
    protected Float fp8 = FP8_EDEFAULT;

    /**
     * This is true if the Fp8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp8ESet;

    /**
     * The default value of the '{@link #getFp9() <em>Fp9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp9()
     * @generated
     * @ordered
     */
    protected static final Float FP9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFp9() <em>Fp9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFp9()
     * @generated
     * @ordered
     */
    protected Float fp9 = FP9_EDEFAULT;

    /**
     * This is true if the Fp9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fp9ESet;

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
     * The default value of the '{@link #getGtmxcl() <em>Gtmxcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGtmxcl()
     * @generated
     * @ordered
     */
    protected static final Float GTMXCL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGtmxcl() <em>Gtmxcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGtmxcl()
     * @generated
     * @ordered
     */
    protected Float gtmxcl = GTMXCL_EDEFAULT;

    /**
     * This is true if the Gtmxcl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gtmxclESet;

    /**
     * The default value of the '{@link #getGtmxop() <em>Gtmxop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGtmxop()
     * @generated
     * @ordered
     */
    protected static final Float GTMXOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGtmxop() <em>Gtmxop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGtmxop()
     * @generated
     * @ordered
     */
    protected Float gtmxop = GTMXOP_EDEFAULT;

    /**
     * This is true if the Gtmxop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gtmxopESet;

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
     * The default value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected static final Float KD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected Float kd = KD_EDEFAULT;

    /**
     * This is true if the Kd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdESet;

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
     * The default value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected static final Float KP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected Float kp = KP_EDEFAULT;

    /**
     * This is true if the Kp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpESet;

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
     * The default value of the '{@link #getPmss1() <em>Pmss1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss1()
     * @generated
     * @ordered
     */
    protected static final Float PMSS1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss1() <em>Pmss1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss1()
     * @generated
     * @ordered
     */
    protected Float pmss1 = PMSS1_EDEFAULT;

    /**
     * This is true if the Pmss1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss1ESet;

    /**
     * The default value of the '{@link #getPmss10() <em>Pmss10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss10()
     * @generated
     * @ordered
     */
    protected static final Float PMSS10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss10() <em>Pmss10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss10()
     * @generated
     * @ordered
     */
    protected Float pmss10 = PMSS10_EDEFAULT;

    /**
     * This is true if the Pmss10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss10ESet;

    /**
     * The default value of the '{@link #getPmss2() <em>Pmss2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss2()
     * @generated
     * @ordered
     */
    protected static final Float PMSS2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss2() <em>Pmss2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss2()
     * @generated
     * @ordered
     */
    protected Float pmss2 = PMSS2_EDEFAULT;

    /**
     * This is true if the Pmss2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss2ESet;

    /**
     * The default value of the '{@link #getPmss3() <em>Pmss3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss3()
     * @generated
     * @ordered
     */
    protected static final Float PMSS3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss3() <em>Pmss3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss3()
     * @generated
     * @ordered
     */
    protected Float pmss3 = PMSS3_EDEFAULT;

    /**
     * This is true if the Pmss3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss3ESet;

    /**
     * The default value of the '{@link #getPmss4() <em>Pmss4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss4()
     * @generated
     * @ordered
     */
    protected static final Float PMSS4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss4() <em>Pmss4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss4()
     * @generated
     * @ordered
     */
    protected Float pmss4 = PMSS4_EDEFAULT;

    /**
     * This is true if the Pmss4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss4ESet;

    /**
     * The default value of the '{@link #getPmss5() <em>Pmss5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss5()
     * @generated
     * @ordered
     */
    protected static final Float PMSS5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss5() <em>Pmss5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss5()
     * @generated
     * @ordered
     */
    protected Float pmss5 = PMSS5_EDEFAULT;

    /**
     * This is true if the Pmss5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss5ESet;

    /**
     * The default value of the '{@link #getPmss6() <em>Pmss6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss6()
     * @generated
     * @ordered
     */
    protected static final Float PMSS6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss6() <em>Pmss6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss6()
     * @generated
     * @ordered
     */
    protected Float pmss6 = PMSS6_EDEFAULT;

    /**
     * This is true if the Pmss6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss6ESet;

    /**
     * The default value of the '{@link #getPmss7() <em>Pmss7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss7()
     * @generated
     * @ordered
     */
    protected static final Float PMSS7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss7() <em>Pmss7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss7()
     * @generated
     * @ordered
     */
    protected Float pmss7 = PMSS7_EDEFAULT;

    /**
     * This is true if the Pmss7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss7ESet;

    /**
     * The default value of the '{@link #getPmss8() <em>Pmss8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss8()
     * @generated
     * @ordered
     */
    protected static final Float PMSS8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss8() <em>Pmss8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss8()
     * @generated
     * @ordered
     */
    protected Float pmss8 = PMSS8_EDEFAULT;

    /**
     * This is true if the Pmss8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss8ESet;

    /**
     * The default value of the '{@link #getPmss9() <em>Pmss9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss9()
     * @generated
     * @ordered
     */
    protected static final Float PMSS9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmss9() <em>Pmss9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmss9()
     * @generated
     * @ordered
     */
    protected Float pmss9 = PMSS9_EDEFAULT;

    /**
     * This is true if the Pmss9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmss9ESet;

    /**
     * The default value of the '{@link #getRpg() <em>Rpg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRpg()
     * @generated
     * @ordered
     */
    protected static final Float RPG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRpg() <em>Rpg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRpg()
     * @generated
     * @ordered
     */
    protected Float rpg = RPG_EDEFAULT;

    /**
     * This is true if the Rpg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rpgESet;

    /**
     * The default value of the '{@link #getRpp() <em>Rpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRpp()
     * @generated
     * @ordered
     */
    protected static final Float RPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRpp() <em>Rpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRpp()
     * @generated
     * @ordered
     */
    protected Float rpp = RPP_EDEFAULT;

    /**
     * This is true if the Rpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rppESet;

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
     * The default value of the '{@link #getTdv() <em>Tdv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdv()
     * @generated
     * @ordered
     */
    protected static final Float TDV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdv() <em>Tdv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdv()
     * @generated
     * @ordered
     */
    protected Float tdv = TDV_EDEFAULT;

    /**
     * This is true if the Tdv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdvESet;

    /**
     * The default value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected static final Float TG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected Float tg = TG_EDEFAULT;

    /**
     * This is true if the Tg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tgESet;

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
     * The default value of the '{@link #getTpe() <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpe()
     * @generated
     * @ordered
     */
    protected static final Float TPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpe() <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpe()
     * @generated
     * @ordered
     */
    protected Float tpe = TPE_EDEFAULT;

    /**
     * This is true if the Tpe attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpeESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovHydroWEHImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovHydroWEH();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDb() {
        return db;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDb( Float newDb ) {
        Float oldDb = db;
        db = newDb;
        boolean oldDbESet = dbESet;
        dbESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__DB, oldDb, db, !oldDbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDb() {
        Float oldDb = db;
        boolean oldDbESet = dbESet;
        db = DB_EDEFAULT;
        dbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__DB, oldDb, DB_EDEFAULT, oldDbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDb() {
        return dbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDicn() {
        return dicn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDicn( Float newDicn ) {
        Float oldDicn = dicn;
        dicn = newDicn;
        boolean oldDicnESet = dicnESet;
        dicnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__DICN, oldDicn, dicn, !oldDicnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDicn() {
        Float oldDicn = dicn;
        boolean oldDicnESet = dicnESet;
        dicn = DICN_EDEFAULT;
        dicnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__DICN, oldDicn, DICN_EDEFAULT, oldDicnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDicn() {
        return dicnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpv() {
        return dpv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpv( Float newDpv ) {
        Float oldDpv = dpv;
        dpv = newDpv;
        boolean oldDpvESet = dpvESet;
        dpvESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__DPV, oldDpv, dpv, !oldDpvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpv() {
        Float oldDpv = dpv;
        boolean oldDpvESet = dpvESet;
        dpv = DPV_EDEFAULT;
        dpvESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__DPV, oldDpv, DPV_EDEFAULT, oldDpvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpv() {
        return dpvESet;
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
                CimPackage.GOV_HYDRO_WEH__DTURB, oldDturb, dturb, !oldDturbESet ) );
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
                CimPackage.GOV_HYDRO_WEH__DTURB, oldDturb, DTURB_EDEFAULT, oldDturbESet ) );
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
    public Boolean getFeedbackSignal() {
        return feedbackSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFeedbackSignal( Boolean newFeedbackSignal ) {
        Boolean oldFeedbackSignal = feedbackSignal;
        feedbackSignal = newFeedbackSignal;
        boolean oldFeedbackSignalESet = feedbackSignalESet;
        feedbackSignalESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__FEEDBACK_SIGNAL,
                    oldFeedbackSignal, feedbackSignal, !oldFeedbackSignalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFeedbackSignal() {
        Boolean oldFeedbackSignal = feedbackSignal;
        boolean oldFeedbackSignalESet = feedbackSignalESet;
        feedbackSignal = FEEDBACK_SIGNAL_EDEFAULT;
        feedbackSignalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WEH__FEEDBACK_SIGNAL,
                    oldFeedbackSignal, FEEDBACK_SIGNAL_EDEFAULT, oldFeedbackSignalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFeedbackSignal() {
        return feedbackSignalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFl1() {
        return fl1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFl1( Float newFl1 ) {
        Float oldFl1 = fl1;
        fl1 = newFl1;
        boolean oldFl1ESet = fl1ESet;
        fl1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FL1, oldFl1, fl1, !oldFl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFl1() {
        Float oldFl1 = fl1;
        boolean oldFl1ESet = fl1ESet;
        fl1 = FL1_EDEFAULT;
        fl1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FL1, oldFl1, FL1_EDEFAULT, oldFl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFl1() {
        return fl1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFl2() {
        return fl2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFl2( Float newFl2 ) {
        Float oldFl2 = fl2;
        fl2 = newFl2;
        boolean oldFl2ESet = fl2ESet;
        fl2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FL2, oldFl2, fl2, !oldFl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFl2() {
        Float oldFl2 = fl2;
        boolean oldFl2ESet = fl2ESet;
        fl2 = FL2_EDEFAULT;
        fl2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FL2, oldFl2, FL2_EDEFAULT, oldFl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFl2() {
        return fl2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFl3() {
        return fl3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFl3( Float newFl3 ) {
        Float oldFl3 = fl3;
        fl3 = newFl3;
        boolean oldFl3ESet = fl3ESet;
        fl3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FL3, oldFl3, fl3, !oldFl3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFl3() {
        Float oldFl3 = fl3;
        boolean oldFl3ESet = fl3ESet;
        fl3 = FL3_EDEFAULT;
        fl3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FL3, oldFl3, FL3_EDEFAULT, oldFl3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFl3() {
        return fl3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFl4() {
        return fl4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFl4( Float newFl4 ) {
        Float oldFl4 = fl4;
        fl4 = newFl4;
        boolean oldFl4ESet = fl4ESet;
        fl4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FL4, oldFl4, fl4, !oldFl4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFl4() {
        Float oldFl4 = fl4;
        boolean oldFl4ESet = fl4ESet;
        fl4 = FL4_EDEFAULT;
        fl4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FL4, oldFl4, FL4_EDEFAULT, oldFl4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFl4() {
        return fl4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFl5() {
        return fl5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFl5( Float newFl5 ) {
        Float oldFl5 = fl5;
        fl5 = newFl5;
        boolean oldFl5ESet = fl5ESet;
        fl5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FL5, oldFl5, fl5, !oldFl5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFl5() {
        Float oldFl5 = fl5;
        boolean oldFl5ESet = fl5ESet;
        fl5 = FL5_EDEFAULT;
        fl5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FL5, oldFl5, FL5_EDEFAULT, oldFl5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFl5() {
        return fl5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp1() {
        return fp1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp1( Float newFp1 ) {
        Float oldFp1 = fp1;
        fp1 = newFp1;
        boolean oldFp1ESet = fp1ESet;
        fp1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP1, oldFp1, fp1, !oldFp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp1() {
        Float oldFp1 = fp1;
        boolean oldFp1ESet = fp1ESet;
        fp1 = FP1_EDEFAULT;
        fp1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP1, oldFp1, FP1_EDEFAULT, oldFp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp1() {
        return fp1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp10() {
        return fp10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp10( Float newFp10 ) {
        Float oldFp10 = fp10;
        fp10 = newFp10;
        boolean oldFp10ESet = fp10ESet;
        fp10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP10, oldFp10, fp10, !oldFp10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp10() {
        Float oldFp10 = fp10;
        boolean oldFp10ESet = fp10ESet;
        fp10 = FP10_EDEFAULT;
        fp10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP10, oldFp10, FP10_EDEFAULT, oldFp10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp10() {
        return fp10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp2() {
        return fp2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp2( Float newFp2 ) {
        Float oldFp2 = fp2;
        fp2 = newFp2;
        boolean oldFp2ESet = fp2ESet;
        fp2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP2, oldFp2, fp2, !oldFp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp2() {
        Float oldFp2 = fp2;
        boolean oldFp2ESet = fp2ESet;
        fp2 = FP2_EDEFAULT;
        fp2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP2, oldFp2, FP2_EDEFAULT, oldFp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp2() {
        return fp2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp3() {
        return fp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp3( Float newFp3 ) {
        Float oldFp3 = fp3;
        fp3 = newFp3;
        boolean oldFp3ESet = fp3ESet;
        fp3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP3, oldFp3, fp3, !oldFp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp3() {
        Float oldFp3 = fp3;
        boolean oldFp3ESet = fp3ESet;
        fp3 = FP3_EDEFAULT;
        fp3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP3, oldFp3, FP3_EDEFAULT, oldFp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp3() {
        return fp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp4() {
        return fp4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp4( Float newFp4 ) {
        Float oldFp4 = fp4;
        fp4 = newFp4;
        boolean oldFp4ESet = fp4ESet;
        fp4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP4, oldFp4, fp4, !oldFp4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp4() {
        Float oldFp4 = fp4;
        boolean oldFp4ESet = fp4ESet;
        fp4 = FP4_EDEFAULT;
        fp4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP4, oldFp4, FP4_EDEFAULT, oldFp4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp4() {
        return fp4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp5() {
        return fp5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp5( Float newFp5 ) {
        Float oldFp5 = fp5;
        fp5 = newFp5;
        boolean oldFp5ESet = fp5ESet;
        fp5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP5, oldFp5, fp5, !oldFp5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp5() {
        Float oldFp5 = fp5;
        boolean oldFp5ESet = fp5ESet;
        fp5 = FP5_EDEFAULT;
        fp5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP5, oldFp5, FP5_EDEFAULT, oldFp5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp5() {
        return fp5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp6() {
        return fp6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp6( Float newFp6 ) {
        Float oldFp6 = fp6;
        fp6 = newFp6;
        boolean oldFp6ESet = fp6ESet;
        fp6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP6, oldFp6, fp6, !oldFp6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp6() {
        Float oldFp6 = fp6;
        boolean oldFp6ESet = fp6ESet;
        fp6 = FP6_EDEFAULT;
        fp6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP6, oldFp6, FP6_EDEFAULT, oldFp6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp6() {
        return fp6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp7() {
        return fp7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp7( Float newFp7 ) {
        Float oldFp7 = fp7;
        fp7 = newFp7;
        boolean oldFp7ESet = fp7ESet;
        fp7ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP7, oldFp7, fp7, !oldFp7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp7() {
        Float oldFp7 = fp7;
        boolean oldFp7ESet = fp7ESet;
        fp7 = FP7_EDEFAULT;
        fp7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP7, oldFp7, FP7_EDEFAULT, oldFp7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp7() {
        return fp7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp8() {
        return fp8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp8( Float newFp8 ) {
        Float oldFp8 = fp8;
        fp8 = newFp8;
        boolean oldFp8ESet = fp8ESet;
        fp8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP8, oldFp8, fp8, !oldFp8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp8() {
        Float oldFp8 = fp8;
        boolean oldFp8ESet = fp8ESet;
        fp8 = FP8_EDEFAULT;
        fp8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP8, oldFp8, FP8_EDEFAULT, oldFp8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp8() {
        return fp8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFp9() {
        return fp9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFp9( Float newFp9 ) {
        Float oldFp9 = fp9;
        fp9 = newFp9;
        boolean oldFp9ESet = fp9ESet;
        fp9ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__FP9, oldFp9, fp9, !oldFp9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFp9() {
        Float oldFp9 = fp9;
        boolean oldFp9ESet = fp9ESet;
        fp9 = FP9_EDEFAULT;
        fp9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__FP9, oldFp9, FP9_EDEFAULT, oldFp9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFp9() {
        return fp9ESet;
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
                CimPackage.GOV_HYDRO_WEH__GMAX, oldGmax, gmax, !oldGmaxESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GMAX, oldGmax, GMAX_EDEFAULT, oldGmaxESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GMIN, oldGmin, gmin, !oldGminESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GMIN, oldGmin, GMIN_EDEFAULT, oldGminESet ) );
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
    public Float getGtmxcl() {
        return gtmxcl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGtmxcl( Float newGtmxcl ) {
        Float oldGtmxcl = gtmxcl;
        gtmxcl = newGtmxcl;
        boolean oldGtmxclESet = gtmxclESet;
        gtmxclESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__GTMXCL, oldGtmxcl, gtmxcl, !oldGtmxclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGtmxcl() {
        Float oldGtmxcl = gtmxcl;
        boolean oldGtmxclESet = gtmxclESet;
        gtmxcl = GTMXCL_EDEFAULT;
        gtmxclESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__GTMXCL, oldGtmxcl, GTMXCL_EDEFAULT, oldGtmxclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGtmxcl() {
        return gtmxclESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGtmxop() {
        return gtmxop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGtmxop( Float newGtmxop ) {
        Float oldGtmxop = gtmxop;
        gtmxop = newGtmxop;
        boolean oldGtmxopESet = gtmxopESet;
        gtmxopESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__GTMXOP, oldGtmxop, gtmxop, !oldGtmxopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGtmxop() {
        Float oldGtmxop = gtmxop;
        boolean oldGtmxopESet = gtmxopESet;
        gtmxop = GTMXOP_EDEFAULT;
        gtmxopESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__GTMXOP, oldGtmxop, GTMXOP_EDEFAULT, oldGtmxopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGtmxop() {
        return gtmxopESet;
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
                CimPackage.GOV_HYDRO_WEH__GV1, oldGv1, gv1, !oldGv1ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV1, oldGv1, GV1_EDEFAULT, oldGv1ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV2, oldGv2, gv2, !oldGv2ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV2, oldGv2, GV2_EDEFAULT, oldGv2ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV3, oldGv3, gv3, !oldGv3ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV3, oldGv3, GV3_EDEFAULT, oldGv3ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV4, oldGv4, gv4, !oldGv4ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV4, oldGv4, GV4_EDEFAULT, oldGv4ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV5, oldGv5, gv5, !oldGv5ESet ) );
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
                CimPackage.GOV_HYDRO_WEH__GV5, oldGv5, GV5_EDEFAULT, oldGv5ESet ) );
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
    public Float getKd() {
        return kd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKd( Float newKd ) {
        Float oldKd = kd;
        kd = newKd;
        boolean oldKdESet = kdESet;
        kdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__KD, oldKd, kd, !oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKd() {
        Float oldKd = kd;
        boolean oldKdESet = kdESet;
        kd = KD_EDEFAULT;
        kdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__KD, oldKd, KD_EDEFAULT, oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKd() {
        return kdESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__KI, oldKi, ki, !oldKiESet ) );
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
                CimPackage.GOV_HYDRO_WEH__KI, oldKi, KI_EDEFAULT, oldKiESet ) );
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
    public Float getKp() {
        return kp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp( Float newKp ) {
        Float oldKp = kp;
        kp = newKp;
        boolean oldKpESet = kpESet;
        kpESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__KP, oldKp, kp, !oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp() {
        Float oldKp = kp;
        boolean oldKpESet = kpESet;
        kp = KP_EDEFAULT;
        kpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__KP, oldKp, KP_EDEFAULT, oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp() {
        return kpESet;
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
                CimPackage.GOV_HYDRO_WEH__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
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
                CimPackage.GOV_HYDRO_WEH__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
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
    public Float getPmss1() {
        return pmss1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss1( Float newPmss1 ) {
        Float oldPmss1 = pmss1;
        pmss1 = newPmss1;
        boolean oldPmss1ESet = pmss1ESet;
        pmss1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS1, oldPmss1, pmss1, !oldPmss1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss1() {
        Float oldPmss1 = pmss1;
        boolean oldPmss1ESet = pmss1ESet;
        pmss1 = PMSS1_EDEFAULT;
        pmss1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS1, oldPmss1, PMSS1_EDEFAULT, oldPmss1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss1() {
        return pmss1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss10() {
        return pmss10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss10( Float newPmss10 ) {
        Float oldPmss10 = pmss10;
        pmss10 = newPmss10;
        boolean oldPmss10ESet = pmss10ESet;
        pmss10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS10, oldPmss10, pmss10, !oldPmss10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss10() {
        Float oldPmss10 = pmss10;
        boolean oldPmss10ESet = pmss10ESet;
        pmss10 = PMSS10_EDEFAULT;
        pmss10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS10, oldPmss10, PMSS10_EDEFAULT, oldPmss10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss10() {
        return pmss10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss2() {
        return pmss2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss2( Float newPmss2 ) {
        Float oldPmss2 = pmss2;
        pmss2 = newPmss2;
        boolean oldPmss2ESet = pmss2ESet;
        pmss2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS2, oldPmss2, pmss2, !oldPmss2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss2() {
        Float oldPmss2 = pmss2;
        boolean oldPmss2ESet = pmss2ESet;
        pmss2 = PMSS2_EDEFAULT;
        pmss2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS2, oldPmss2, PMSS2_EDEFAULT, oldPmss2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss2() {
        return pmss2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss3() {
        return pmss3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss3( Float newPmss3 ) {
        Float oldPmss3 = pmss3;
        pmss3 = newPmss3;
        boolean oldPmss3ESet = pmss3ESet;
        pmss3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS3, oldPmss3, pmss3, !oldPmss3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss3() {
        Float oldPmss3 = pmss3;
        boolean oldPmss3ESet = pmss3ESet;
        pmss3 = PMSS3_EDEFAULT;
        pmss3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS3, oldPmss3, PMSS3_EDEFAULT, oldPmss3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss3() {
        return pmss3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss4() {
        return pmss4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss4( Float newPmss4 ) {
        Float oldPmss4 = pmss4;
        pmss4 = newPmss4;
        boolean oldPmss4ESet = pmss4ESet;
        pmss4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS4, oldPmss4, pmss4, !oldPmss4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss4() {
        Float oldPmss4 = pmss4;
        boolean oldPmss4ESet = pmss4ESet;
        pmss4 = PMSS4_EDEFAULT;
        pmss4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS4, oldPmss4, PMSS4_EDEFAULT, oldPmss4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss4() {
        return pmss4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss5() {
        return pmss5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss5( Float newPmss5 ) {
        Float oldPmss5 = pmss5;
        pmss5 = newPmss5;
        boolean oldPmss5ESet = pmss5ESet;
        pmss5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS5, oldPmss5, pmss5, !oldPmss5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss5() {
        Float oldPmss5 = pmss5;
        boolean oldPmss5ESet = pmss5ESet;
        pmss5 = PMSS5_EDEFAULT;
        pmss5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS5, oldPmss5, PMSS5_EDEFAULT, oldPmss5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss5() {
        return pmss5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss6() {
        return pmss6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss6( Float newPmss6 ) {
        Float oldPmss6 = pmss6;
        pmss6 = newPmss6;
        boolean oldPmss6ESet = pmss6ESet;
        pmss6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS6, oldPmss6, pmss6, !oldPmss6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss6() {
        Float oldPmss6 = pmss6;
        boolean oldPmss6ESet = pmss6ESet;
        pmss6 = PMSS6_EDEFAULT;
        pmss6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS6, oldPmss6, PMSS6_EDEFAULT, oldPmss6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss6() {
        return pmss6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss7() {
        return pmss7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss7( Float newPmss7 ) {
        Float oldPmss7 = pmss7;
        pmss7 = newPmss7;
        boolean oldPmss7ESet = pmss7ESet;
        pmss7ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS7, oldPmss7, pmss7, !oldPmss7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss7() {
        Float oldPmss7 = pmss7;
        boolean oldPmss7ESet = pmss7ESet;
        pmss7 = PMSS7_EDEFAULT;
        pmss7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS7, oldPmss7, PMSS7_EDEFAULT, oldPmss7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss7() {
        return pmss7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss8() {
        return pmss8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss8( Float newPmss8 ) {
        Float oldPmss8 = pmss8;
        pmss8 = newPmss8;
        boolean oldPmss8ESet = pmss8ESet;
        pmss8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS8, oldPmss8, pmss8, !oldPmss8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss8() {
        Float oldPmss8 = pmss8;
        boolean oldPmss8ESet = pmss8ESet;
        pmss8 = PMSS8_EDEFAULT;
        pmss8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS8, oldPmss8, PMSS8_EDEFAULT, oldPmss8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss8() {
        return pmss8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmss9() {
        return pmss9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmss9( Float newPmss9 ) {
        Float oldPmss9 = pmss9;
        pmss9 = newPmss9;
        boolean oldPmss9ESet = pmss9ESet;
        pmss9ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__PMSS9, oldPmss9, pmss9, !oldPmss9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmss9() {
        Float oldPmss9 = pmss9;
        boolean oldPmss9ESet = pmss9ESet;
        pmss9 = PMSS9_EDEFAULT;
        pmss9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__PMSS9, oldPmss9, PMSS9_EDEFAULT, oldPmss9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmss9() {
        return pmss9ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRpg() {
        return rpg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRpg( Float newRpg ) {
        Float oldRpg = rpg;
        rpg = newRpg;
        boolean oldRpgESet = rpgESet;
        rpgESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__RPG, oldRpg, rpg, !oldRpgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRpg() {
        Float oldRpg = rpg;
        boolean oldRpgESet = rpgESet;
        rpg = RPG_EDEFAULT;
        rpgESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__RPG, oldRpg, RPG_EDEFAULT, oldRpgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRpg() {
        return rpgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRpp() {
        return rpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRpp( Float newRpp ) {
        Float oldRpp = rpp;
        rpp = newRpp;
        boolean oldRppESet = rppESet;
        rppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__RPP, oldRpp, rpp, !oldRppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRpp() {
        Float oldRpp = rpp;
        boolean oldRppESet = rppESet;
        rpp = RPP_EDEFAULT;
        rppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__RPP, oldRpp, RPP_EDEFAULT, oldRppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRpp() {
        return rppESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__TD, oldTd, td, !oldTdESet ) );
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
                CimPackage.GOV_HYDRO_WEH__TD, oldTd, TD_EDEFAULT, oldTdESet ) );
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
    public Float getTdv() {
        return tdv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdv( Float newTdv ) {
        Float oldTdv = tdv;
        tdv = newTdv;
        boolean oldTdvESet = tdvESet;
        tdvESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__TDV, oldTdv, tdv, !oldTdvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdv() {
        Float oldTdv = tdv;
        boolean oldTdvESet = tdvESet;
        tdv = TDV_EDEFAULT;
        tdvESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__TDV, oldTdv, TDV_EDEFAULT, oldTdvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdv() {
        return tdvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTg() {
        return tg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTg( Float newTg ) {
        Float oldTg = tg;
        tg = newTg;
        boolean oldTgESet = tgESet;
        tgESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__TG, oldTg, tg, !oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTg() {
        Float oldTg = tg;
        boolean oldTgESet = tgESet;
        tg = TG_EDEFAULT;
        tgESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__TG, oldTg, TG_EDEFAULT, oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTg() {
        return tgESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__TP, oldTp, tp, !oldTpESet ) );
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
                CimPackage.GOV_HYDRO_WEH__TP, oldTp, TP_EDEFAULT, oldTpESet ) );
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
    public Float getTpe() {
        return tpe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpe( Float newTpe ) {
        Float oldTpe = tpe;
        tpe = newTpe;
        boolean oldTpeESet = tpeESet;
        tpeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_WEH__TPE, oldTpe, tpe, !oldTpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpe() {
        Float oldTpe = tpe;
        boolean oldTpeESet = tpeESet;
        tpe = TPE_EDEFAULT;
        tpeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_WEH__TPE, oldTpe, TPE_EDEFAULT, oldTpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpe() {
        return tpeESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WEH__TW, oldTw, tw, !oldTwESet ) );
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
                CimPackage.GOV_HYDRO_WEH__TW, oldTw, TW_EDEFAULT, oldTwESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_HYDRO_WEH__DB:
            return getDb();
        case CimPackage.GOV_HYDRO_WEH__DICN:
            return getDicn();
        case CimPackage.GOV_HYDRO_WEH__DPV:
            return getDpv();
        case CimPackage.GOV_HYDRO_WEH__DTURB:
            return getDturb();
        case CimPackage.GOV_HYDRO_WEH__FEEDBACK_SIGNAL:
            return getFeedbackSignal();
        case CimPackage.GOV_HYDRO_WEH__FL1:
            return getFl1();
        case CimPackage.GOV_HYDRO_WEH__FL2:
            return getFl2();
        case CimPackage.GOV_HYDRO_WEH__FL3:
            return getFl3();
        case CimPackage.GOV_HYDRO_WEH__FL4:
            return getFl4();
        case CimPackage.GOV_HYDRO_WEH__FL5:
            return getFl5();
        case CimPackage.GOV_HYDRO_WEH__FP1:
            return getFp1();
        case CimPackage.GOV_HYDRO_WEH__FP10:
            return getFp10();
        case CimPackage.GOV_HYDRO_WEH__FP2:
            return getFp2();
        case CimPackage.GOV_HYDRO_WEH__FP3:
            return getFp3();
        case CimPackage.GOV_HYDRO_WEH__FP4:
            return getFp4();
        case CimPackage.GOV_HYDRO_WEH__FP5:
            return getFp5();
        case CimPackage.GOV_HYDRO_WEH__FP6:
            return getFp6();
        case CimPackage.GOV_HYDRO_WEH__FP7:
            return getFp7();
        case CimPackage.GOV_HYDRO_WEH__FP8:
            return getFp8();
        case CimPackage.GOV_HYDRO_WEH__FP9:
            return getFp9();
        case CimPackage.GOV_HYDRO_WEH__GMAX:
            return getGmax();
        case CimPackage.GOV_HYDRO_WEH__GMIN:
            return getGmin();
        case CimPackage.GOV_HYDRO_WEH__GTMXCL:
            return getGtmxcl();
        case CimPackage.GOV_HYDRO_WEH__GTMXOP:
            return getGtmxop();
        case CimPackage.GOV_HYDRO_WEH__GV1:
            return getGv1();
        case CimPackage.GOV_HYDRO_WEH__GV2:
            return getGv2();
        case CimPackage.GOV_HYDRO_WEH__GV3:
            return getGv3();
        case CimPackage.GOV_HYDRO_WEH__GV4:
            return getGv4();
        case CimPackage.GOV_HYDRO_WEH__GV5:
            return getGv5();
        case CimPackage.GOV_HYDRO_WEH__KD:
            return getKd();
        case CimPackage.GOV_HYDRO_WEH__KI:
            return getKi();
        case CimPackage.GOV_HYDRO_WEH__KP:
            return getKp();
        case CimPackage.GOV_HYDRO_WEH__MWBASE:
            return getMwbase();
        case CimPackage.GOV_HYDRO_WEH__PMSS1:
            return getPmss1();
        case CimPackage.GOV_HYDRO_WEH__PMSS10:
            return getPmss10();
        case CimPackage.GOV_HYDRO_WEH__PMSS2:
            return getPmss2();
        case CimPackage.GOV_HYDRO_WEH__PMSS3:
            return getPmss3();
        case CimPackage.GOV_HYDRO_WEH__PMSS4:
            return getPmss4();
        case CimPackage.GOV_HYDRO_WEH__PMSS5:
            return getPmss5();
        case CimPackage.GOV_HYDRO_WEH__PMSS6:
            return getPmss6();
        case CimPackage.GOV_HYDRO_WEH__PMSS7:
            return getPmss7();
        case CimPackage.GOV_HYDRO_WEH__PMSS8:
            return getPmss8();
        case CimPackage.GOV_HYDRO_WEH__PMSS9:
            return getPmss9();
        case CimPackage.GOV_HYDRO_WEH__RPG:
            return getRpg();
        case CimPackage.GOV_HYDRO_WEH__RPP:
            return getRpp();
        case CimPackage.GOV_HYDRO_WEH__TD:
            return getTd();
        case CimPackage.GOV_HYDRO_WEH__TDV:
            return getTdv();
        case CimPackage.GOV_HYDRO_WEH__TG:
            return getTg();
        case CimPackage.GOV_HYDRO_WEH__TP:
            return getTp();
        case CimPackage.GOV_HYDRO_WEH__TPE:
            return getTpe();
        case CimPackage.GOV_HYDRO_WEH__TW:
            return getTw();
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
        case CimPackage.GOV_HYDRO_WEH__DB:
            setDb( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__DICN:
            setDicn( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__DPV:
            setDpv( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__DTURB:
            setDturb( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FEEDBACK_SIGNAL:
            setFeedbackSignal( ( Boolean ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FL1:
            setFl1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FL2:
            setFl2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FL3:
            setFl3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FL4:
            setFl4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FL5:
            setFl5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP1:
            setFp1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP10:
            setFp10( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP2:
            setFp2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP3:
            setFp3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP4:
            setFp4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP5:
            setFp5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP6:
            setFp6( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP7:
            setFp7( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP8:
            setFp8( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__FP9:
            setFp9( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GMAX:
            setGmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GMIN:
            setGmin( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GTMXCL:
            setGtmxcl( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GTMXOP:
            setGtmxop( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GV1:
            setGv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GV2:
            setGv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GV3:
            setGv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GV4:
            setGv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__GV5:
            setGv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__KD:
            setKd( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS1:
            setPmss1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS10:
            setPmss10( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS2:
            setPmss2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS3:
            setPmss3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS4:
            setPmss4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS5:
            setPmss5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS6:
            setPmss6( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS7:
            setPmss7( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS8:
            setPmss8( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS9:
            setPmss9( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__RPG:
            setRpg( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__RPP:
            setRpp( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__TD:
            setTd( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__TDV:
            setTdv( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__TG:
            setTg( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__TP:
            setTp( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__TPE:
            setTpe( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WEH__TW:
            setTw( ( Float ) newValue );
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
        case CimPackage.GOV_HYDRO_WEH__DB:
            unsetDb();
            return;
        case CimPackage.GOV_HYDRO_WEH__DICN:
            unsetDicn();
            return;
        case CimPackage.GOV_HYDRO_WEH__DPV:
            unsetDpv();
            return;
        case CimPackage.GOV_HYDRO_WEH__DTURB:
            unsetDturb();
            return;
        case CimPackage.GOV_HYDRO_WEH__FEEDBACK_SIGNAL:
            unsetFeedbackSignal();
            return;
        case CimPackage.GOV_HYDRO_WEH__FL1:
            unsetFl1();
            return;
        case CimPackage.GOV_HYDRO_WEH__FL2:
            unsetFl2();
            return;
        case CimPackage.GOV_HYDRO_WEH__FL3:
            unsetFl3();
            return;
        case CimPackage.GOV_HYDRO_WEH__FL4:
            unsetFl4();
            return;
        case CimPackage.GOV_HYDRO_WEH__FL5:
            unsetFl5();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP1:
            unsetFp1();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP10:
            unsetFp10();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP2:
            unsetFp2();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP3:
            unsetFp3();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP4:
            unsetFp4();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP5:
            unsetFp5();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP6:
            unsetFp6();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP7:
            unsetFp7();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP8:
            unsetFp8();
            return;
        case CimPackage.GOV_HYDRO_WEH__FP9:
            unsetFp9();
            return;
        case CimPackage.GOV_HYDRO_WEH__GMAX:
            unsetGmax();
            return;
        case CimPackage.GOV_HYDRO_WEH__GMIN:
            unsetGmin();
            return;
        case CimPackage.GOV_HYDRO_WEH__GTMXCL:
            unsetGtmxcl();
            return;
        case CimPackage.GOV_HYDRO_WEH__GTMXOP:
            unsetGtmxop();
            return;
        case CimPackage.GOV_HYDRO_WEH__GV1:
            unsetGv1();
            return;
        case CimPackage.GOV_HYDRO_WEH__GV2:
            unsetGv2();
            return;
        case CimPackage.GOV_HYDRO_WEH__GV3:
            unsetGv3();
            return;
        case CimPackage.GOV_HYDRO_WEH__GV4:
            unsetGv4();
            return;
        case CimPackage.GOV_HYDRO_WEH__GV5:
            unsetGv5();
            return;
        case CimPackage.GOV_HYDRO_WEH__KD:
            unsetKd();
            return;
        case CimPackage.GOV_HYDRO_WEH__KI:
            unsetKi();
            return;
        case CimPackage.GOV_HYDRO_WEH__KP:
            unsetKp();
            return;
        case CimPackage.GOV_HYDRO_WEH__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS1:
            unsetPmss1();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS10:
            unsetPmss10();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS2:
            unsetPmss2();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS3:
            unsetPmss3();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS4:
            unsetPmss4();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS5:
            unsetPmss5();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS6:
            unsetPmss6();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS7:
            unsetPmss7();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS8:
            unsetPmss8();
            return;
        case CimPackage.GOV_HYDRO_WEH__PMSS9:
            unsetPmss9();
            return;
        case CimPackage.GOV_HYDRO_WEH__RPG:
            unsetRpg();
            return;
        case CimPackage.GOV_HYDRO_WEH__RPP:
            unsetRpp();
            return;
        case CimPackage.GOV_HYDRO_WEH__TD:
            unsetTd();
            return;
        case CimPackage.GOV_HYDRO_WEH__TDV:
            unsetTdv();
            return;
        case CimPackage.GOV_HYDRO_WEH__TG:
            unsetTg();
            return;
        case CimPackage.GOV_HYDRO_WEH__TP:
            unsetTp();
            return;
        case CimPackage.GOV_HYDRO_WEH__TPE:
            unsetTpe();
            return;
        case CimPackage.GOV_HYDRO_WEH__TW:
            unsetTw();
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
        case CimPackage.GOV_HYDRO_WEH__DB:
            return isSetDb();
        case CimPackage.GOV_HYDRO_WEH__DICN:
            return isSetDicn();
        case CimPackage.GOV_HYDRO_WEH__DPV:
            return isSetDpv();
        case CimPackage.GOV_HYDRO_WEH__DTURB:
            return isSetDturb();
        case CimPackage.GOV_HYDRO_WEH__FEEDBACK_SIGNAL:
            return isSetFeedbackSignal();
        case CimPackage.GOV_HYDRO_WEH__FL1:
            return isSetFl1();
        case CimPackage.GOV_HYDRO_WEH__FL2:
            return isSetFl2();
        case CimPackage.GOV_HYDRO_WEH__FL3:
            return isSetFl3();
        case CimPackage.GOV_HYDRO_WEH__FL4:
            return isSetFl4();
        case CimPackage.GOV_HYDRO_WEH__FL5:
            return isSetFl5();
        case CimPackage.GOV_HYDRO_WEH__FP1:
            return isSetFp1();
        case CimPackage.GOV_HYDRO_WEH__FP10:
            return isSetFp10();
        case CimPackage.GOV_HYDRO_WEH__FP2:
            return isSetFp2();
        case CimPackage.GOV_HYDRO_WEH__FP3:
            return isSetFp3();
        case CimPackage.GOV_HYDRO_WEH__FP4:
            return isSetFp4();
        case CimPackage.GOV_HYDRO_WEH__FP5:
            return isSetFp5();
        case CimPackage.GOV_HYDRO_WEH__FP6:
            return isSetFp6();
        case CimPackage.GOV_HYDRO_WEH__FP7:
            return isSetFp7();
        case CimPackage.GOV_HYDRO_WEH__FP8:
            return isSetFp8();
        case CimPackage.GOV_HYDRO_WEH__FP9:
            return isSetFp9();
        case CimPackage.GOV_HYDRO_WEH__GMAX:
            return isSetGmax();
        case CimPackage.GOV_HYDRO_WEH__GMIN:
            return isSetGmin();
        case CimPackage.GOV_HYDRO_WEH__GTMXCL:
            return isSetGtmxcl();
        case CimPackage.GOV_HYDRO_WEH__GTMXOP:
            return isSetGtmxop();
        case CimPackage.GOV_HYDRO_WEH__GV1:
            return isSetGv1();
        case CimPackage.GOV_HYDRO_WEH__GV2:
            return isSetGv2();
        case CimPackage.GOV_HYDRO_WEH__GV3:
            return isSetGv3();
        case CimPackage.GOV_HYDRO_WEH__GV4:
            return isSetGv4();
        case CimPackage.GOV_HYDRO_WEH__GV5:
            return isSetGv5();
        case CimPackage.GOV_HYDRO_WEH__KD:
            return isSetKd();
        case CimPackage.GOV_HYDRO_WEH__KI:
            return isSetKi();
        case CimPackage.GOV_HYDRO_WEH__KP:
            return isSetKp();
        case CimPackage.GOV_HYDRO_WEH__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_HYDRO_WEH__PMSS1:
            return isSetPmss1();
        case CimPackage.GOV_HYDRO_WEH__PMSS10:
            return isSetPmss10();
        case CimPackage.GOV_HYDRO_WEH__PMSS2:
            return isSetPmss2();
        case CimPackage.GOV_HYDRO_WEH__PMSS3:
            return isSetPmss3();
        case CimPackage.GOV_HYDRO_WEH__PMSS4:
            return isSetPmss4();
        case CimPackage.GOV_HYDRO_WEH__PMSS5:
            return isSetPmss5();
        case CimPackage.GOV_HYDRO_WEH__PMSS6:
            return isSetPmss6();
        case CimPackage.GOV_HYDRO_WEH__PMSS7:
            return isSetPmss7();
        case CimPackage.GOV_HYDRO_WEH__PMSS8:
            return isSetPmss8();
        case CimPackage.GOV_HYDRO_WEH__PMSS9:
            return isSetPmss9();
        case CimPackage.GOV_HYDRO_WEH__RPG:
            return isSetRpg();
        case CimPackage.GOV_HYDRO_WEH__RPP:
            return isSetRpp();
        case CimPackage.GOV_HYDRO_WEH__TD:
            return isSetTd();
        case CimPackage.GOV_HYDRO_WEH__TDV:
            return isSetTdv();
        case CimPackage.GOV_HYDRO_WEH__TG:
            return isSetTg();
        case CimPackage.GOV_HYDRO_WEH__TP:
            return isSetTp();
        case CimPackage.GOV_HYDRO_WEH__TPE:
            return isSetTpe();
        case CimPackage.GOV_HYDRO_WEH__TW:
            return isSetTw();
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
        result.append( " (db: " );
        if( dbESet )
            result.append( db );
        else
            result.append( "<unset>" );
        result.append( ", dicn: " );
        if( dicnESet )
            result.append( dicn );
        else
            result.append( "<unset>" );
        result.append( ", dpv: " );
        if( dpvESet )
            result.append( dpv );
        else
            result.append( "<unset>" );
        result.append( ", dturb: " );
        if( dturbESet )
            result.append( dturb );
        else
            result.append( "<unset>" );
        result.append( ", feedbackSignal: " );
        if( feedbackSignalESet )
            result.append( feedbackSignal );
        else
            result.append( "<unset>" );
        result.append( ", fl1: " );
        if( fl1ESet )
            result.append( fl1 );
        else
            result.append( "<unset>" );
        result.append( ", fl2: " );
        if( fl2ESet )
            result.append( fl2 );
        else
            result.append( "<unset>" );
        result.append( ", fl3: " );
        if( fl3ESet )
            result.append( fl3 );
        else
            result.append( "<unset>" );
        result.append( ", fl4: " );
        if( fl4ESet )
            result.append( fl4 );
        else
            result.append( "<unset>" );
        result.append( ", fl5: " );
        if( fl5ESet )
            result.append( fl5 );
        else
            result.append( "<unset>" );
        result.append( ", fp1: " );
        if( fp1ESet )
            result.append( fp1 );
        else
            result.append( "<unset>" );
        result.append( ", fp10: " );
        if( fp10ESet )
            result.append( fp10 );
        else
            result.append( "<unset>" );
        result.append( ", fp2: " );
        if( fp2ESet )
            result.append( fp2 );
        else
            result.append( "<unset>" );
        result.append( ", fp3: " );
        if( fp3ESet )
            result.append( fp3 );
        else
            result.append( "<unset>" );
        result.append( ", fp4: " );
        if( fp4ESet )
            result.append( fp4 );
        else
            result.append( "<unset>" );
        result.append( ", fp5: " );
        if( fp5ESet )
            result.append( fp5 );
        else
            result.append( "<unset>" );
        result.append( ", fp6: " );
        if( fp6ESet )
            result.append( fp6 );
        else
            result.append( "<unset>" );
        result.append( ", fp7: " );
        if( fp7ESet )
            result.append( fp7 );
        else
            result.append( "<unset>" );
        result.append( ", fp8: " );
        if( fp8ESet )
            result.append( fp8 );
        else
            result.append( "<unset>" );
        result.append( ", fp9: " );
        if( fp9ESet )
            result.append( fp9 );
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
        result.append( ", gtmxcl: " );
        if( gtmxclESet )
            result.append( gtmxcl );
        else
            result.append( "<unset>" );
        result.append( ", gtmxop: " );
        if( gtmxopESet )
            result.append( gtmxop );
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
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", pmss1: " );
        if( pmss1ESet )
            result.append( pmss1 );
        else
            result.append( "<unset>" );
        result.append( ", pmss10: " );
        if( pmss10ESet )
            result.append( pmss10 );
        else
            result.append( "<unset>" );
        result.append( ", pmss2: " );
        if( pmss2ESet )
            result.append( pmss2 );
        else
            result.append( "<unset>" );
        result.append( ", pmss3: " );
        if( pmss3ESet )
            result.append( pmss3 );
        else
            result.append( "<unset>" );
        result.append( ", pmss4: " );
        if( pmss4ESet )
            result.append( pmss4 );
        else
            result.append( "<unset>" );
        result.append( ", pmss5: " );
        if( pmss5ESet )
            result.append( pmss5 );
        else
            result.append( "<unset>" );
        result.append( ", pmss6: " );
        if( pmss6ESet )
            result.append( pmss6 );
        else
            result.append( "<unset>" );
        result.append( ", pmss7: " );
        if( pmss7ESet )
            result.append( pmss7 );
        else
            result.append( "<unset>" );
        result.append( ", pmss8: " );
        if( pmss8ESet )
            result.append( pmss8 );
        else
            result.append( "<unset>" );
        result.append( ", pmss9: " );
        if( pmss9ESet )
            result.append( pmss9 );
        else
            result.append( "<unset>" );
        result.append( ", rpg: " );
        if( rpgESet )
            result.append( rpg );
        else
            result.append( "<unset>" );
        result.append( ", rpp: " );
        if( rppESet )
            result.append( rpp );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", tdv: " );
        if( tdvESet )
            result.append( tdv );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", tpe: " );
        if( tpeESet )
            result.append( tpe );
        else
            result.append( "<unset>" );
        result.append( ", tw: " );
        if( twESet )
            result.append( tw );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovHydroWEHImpl
