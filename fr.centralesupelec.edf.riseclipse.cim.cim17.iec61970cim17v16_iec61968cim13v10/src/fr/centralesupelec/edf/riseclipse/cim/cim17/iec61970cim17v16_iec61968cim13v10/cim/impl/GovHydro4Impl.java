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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro4;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Hydro4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getAt <em>At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getBgv0 <em>Bgv0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getBgv1 <em>Bgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getBgv2 <em>Bgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getBgv3 <em>Bgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getBgv4 <em>Bgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getBgv5 <em>Bgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getBmax <em>Bmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getDb1 <em>Db1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getDb2 <em>Db2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getEps <em>Eps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGv0 <em>Gv0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getHdam <em>Hdam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getPgv0 <em>Pgv0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getPgv4 <em>Pgv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getPgv5 <em>Pgv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getQn1 <em>Qn1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getRperm <em>Rperm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getRtemp <em>Rtemp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getTblade <em>Tblade</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getUc <em>Uc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydro4Impl#getUo <em>Uo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovHydro4Impl extends TurbineGovernorDynamicsImpl implements GovHydro4 {
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
     * The default value of the '{@link #getBgv0() <em>Bgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv0()
     * @generated
     * @ordered
     */
    protected static final Float BGV0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBgv0() <em>Bgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv0()
     * @generated
     * @ordered
     */
    protected Float bgv0 = BGV0_EDEFAULT;

    /**
     * This is true if the Bgv0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bgv0ESet;

    /**
     * The default value of the '{@link #getBgv1() <em>Bgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv1()
     * @generated
     * @ordered
     */
    protected static final Float BGV1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBgv1() <em>Bgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv1()
     * @generated
     * @ordered
     */
    protected Float bgv1 = BGV1_EDEFAULT;

    /**
     * This is true if the Bgv1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bgv1ESet;

    /**
     * The default value of the '{@link #getBgv2() <em>Bgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv2()
     * @generated
     * @ordered
     */
    protected static final Float BGV2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBgv2() <em>Bgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv2()
     * @generated
     * @ordered
     */
    protected Float bgv2 = BGV2_EDEFAULT;

    /**
     * This is true if the Bgv2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bgv2ESet;

    /**
     * The default value of the '{@link #getBgv3() <em>Bgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv3()
     * @generated
     * @ordered
     */
    protected static final Float BGV3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBgv3() <em>Bgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv3()
     * @generated
     * @ordered
     */
    protected Float bgv3 = BGV3_EDEFAULT;

    /**
     * This is true if the Bgv3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bgv3ESet;

    /**
     * The default value of the '{@link #getBgv4() <em>Bgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv4()
     * @generated
     * @ordered
     */
    protected static final Float BGV4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBgv4() <em>Bgv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv4()
     * @generated
     * @ordered
     */
    protected Float bgv4 = BGV4_EDEFAULT;

    /**
     * This is true if the Bgv4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bgv4ESet;

    /**
     * The default value of the '{@link #getBgv5() <em>Bgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv5()
     * @generated
     * @ordered
     */
    protected static final Float BGV5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBgv5() <em>Bgv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBgv5()
     * @generated
     * @ordered
     */
    protected Float bgv5 = BGV5_EDEFAULT;

    /**
     * This is true if the Bgv5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bgv5ESet;

    /**
     * The default value of the '{@link #getBmax() <em>Bmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBmax()
     * @generated
     * @ordered
     */
    protected static final Float BMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBmax() <em>Bmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBmax()
     * @generated
     * @ordered
     */
    protected Float bmax = BMAX_EDEFAULT;

    /**
     * This is true if the Bmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bmaxESet;

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
     * The default value of the '{@link #getGv0() <em>Gv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv0()
     * @generated
     * @ordered
     */
    protected static final Float GV0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv0() <em>Gv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv0()
     * @generated
     * @ordered
     */
    protected Float gv0 = GV0_EDEFAULT;

    /**
     * This is true if the Gv0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv0ESet;

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
     * The default value of the '{@link #getHdam() <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHdam()
     * @generated
     * @ordered
     */
    protected static final Float HDAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHdam() <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHdam()
     * @generated
     * @ordered
     */
    protected Float hdam = HDAM_EDEFAULT;

    /**
     * This is true if the Hdam attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hdamESet;

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
     * The default value of the '{@link #getPgv0() <em>Pgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv0()
     * @generated
     * @ordered
     */
    protected static final Float PGV0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv0() <em>Pgv0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv0()
     * @generated
     * @ordered
     */
    protected Float pgv0 = PGV0_EDEFAULT;

    /**
     * This is true if the Pgv0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv0ESet;

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
     * The default value of the '{@link #getQn1() <em>Qn1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQn1()
     * @generated
     * @ordered
     */
    protected static final Float QN1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQn1() <em>Qn1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQn1()
     * @generated
     * @ordered
     */
    protected Float qn1 = QN1_EDEFAULT;

    /**
     * This is true if the Qn1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qn1ESet;

    /**
     * The default value of the '{@link #getRperm() <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRperm()
     * @generated
     * @ordered
     */
    protected static final Float RPERM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRperm() <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRperm()
     * @generated
     * @ordered
     */
    protected Float rperm = RPERM_EDEFAULT;

    /**
     * This is true if the Rperm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rpermESet;

    /**
     * The default value of the '{@link #getRtemp() <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRtemp()
     * @generated
     * @ordered
     */
    protected static final Float RTEMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRtemp() <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRtemp()
     * @generated
     * @ordered
     */
    protected Float rtemp = RTEMP_EDEFAULT;

    /**
     * This is true if the Rtemp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rtempESet;

    /**
     * The default value of the '{@link #getTblade() <em>Tblade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTblade()
     * @generated
     * @ordered
     */
    protected static final Float TBLADE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTblade() <em>Tblade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTblade()
     * @generated
     * @ordered
     */
    protected Float tblade = TBLADE_EDEFAULT;

    /**
     * This is true if the Tblade attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbladeESet;

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
     * The default value of the '{@link #getUc() <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUc()
     * @generated
     * @ordered
     */
    protected static final Float UC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUc() <em>Uc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUc()
     * @generated
     * @ordered
     */
    protected Float uc = UC_EDEFAULT;

    /**
     * This is true if the Uc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ucESet;

    /**
     * The default value of the '{@link #getUo() <em>Uo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUo()
     * @generated
     * @ordered
     */
    protected static final Float UO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUo() <em>Uo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUo()
     * @generated
     * @ordered
     */
    protected Float uo = UO_EDEFAULT;

    /**
     * This is true if the Uo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovHydro4Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovHydro4();
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__AT, oldAt, at, !oldAtESet ) );
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
                CimPackage.GOV_HYDRO4__AT, oldAt, AT_EDEFAULT, oldAtESet ) );
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
    public Float getBgv0() {
        return bgv0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBgv0( Float newBgv0 ) {
        Float oldBgv0 = bgv0;
        bgv0 = newBgv0;
        boolean oldBgv0ESet = bgv0ESet;
        bgv0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__BGV0, oldBgv0, bgv0, !oldBgv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBgv0() {
        Float oldBgv0 = bgv0;
        boolean oldBgv0ESet = bgv0ESet;
        bgv0 = BGV0_EDEFAULT;
        bgv0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__BGV0, oldBgv0, BGV0_EDEFAULT, oldBgv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBgv0() {
        return bgv0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBgv1() {
        return bgv1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBgv1( Float newBgv1 ) {
        Float oldBgv1 = bgv1;
        bgv1 = newBgv1;
        boolean oldBgv1ESet = bgv1ESet;
        bgv1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__BGV1, oldBgv1, bgv1, !oldBgv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBgv1() {
        Float oldBgv1 = bgv1;
        boolean oldBgv1ESet = bgv1ESet;
        bgv1 = BGV1_EDEFAULT;
        bgv1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__BGV1, oldBgv1, BGV1_EDEFAULT, oldBgv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBgv1() {
        return bgv1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBgv2() {
        return bgv2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBgv2( Float newBgv2 ) {
        Float oldBgv2 = bgv2;
        bgv2 = newBgv2;
        boolean oldBgv2ESet = bgv2ESet;
        bgv2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__BGV2, oldBgv2, bgv2, !oldBgv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBgv2() {
        Float oldBgv2 = bgv2;
        boolean oldBgv2ESet = bgv2ESet;
        bgv2 = BGV2_EDEFAULT;
        bgv2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__BGV2, oldBgv2, BGV2_EDEFAULT, oldBgv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBgv2() {
        return bgv2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBgv3() {
        return bgv3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBgv3( Float newBgv3 ) {
        Float oldBgv3 = bgv3;
        bgv3 = newBgv3;
        boolean oldBgv3ESet = bgv3ESet;
        bgv3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__BGV3, oldBgv3, bgv3, !oldBgv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBgv3() {
        Float oldBgv3 = bgv3;
        boolean oldBgv3ESet = bgv3ESet;
        bgv3 = BGV3_EDEFAULT;
        bgv3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__BGV3, oldBgv3, BGV3_EDEFAULT, oldBgv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBgv3() {
        return bgv3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBgv4() {
        return bgv4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBgv4( Float newBgv4 ) {
        Float oldBgv4 = bgv4;
        bgv4 = newBgv4;
        boolean oldBgv4ESet = bgv4ESet;
        bgv4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__BGV4, oldBgv4, bgv4, !oldBgv4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBgv4() {
        Float oldBgv4 = bgv4;
        boolean oldBgv4ESet = bgv4ESet;
        bgv4 = BGV4_EDEFAULT;
        bgv4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__BGV4, oldBgv4, BGV4_EDEFAULT, oldBgv4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBgv4() {
        return bgv4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBgv5() {
        return bgv5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBgv5( Float newBgv5 ) {
        Float oldBgv5 = bgv5;
        bgv5 = newBgv5;
        boolean oldBgv5ESet = bgv5ESet;
        bgv5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__BGV5, oldBgv5, bgv5, !oldBgv5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBgv5() {
        Float oldBgv5 = bgv5;
        boolean oldBgv5ESet = bgv5ESet;
        bgv5 = BGV5_EDEFAULT;
        bgv5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__BGV5, oldBgv5, BGV5_EDEFAULT, oldBgv5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBgv5() {
        return bgv5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBmax() {
        return bmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBmax( Float newBmax ) {
        Float oldBmax = bmax;
        bmax = newBmax;
        boolean oldBmaxESet = bmaxESet;
        bmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__BMAX, oldBmax, bmax, !oldBmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBmax() {
        Float oldBmax = bmax;
        boolean oldBmaxESet = bmaxESet;
        bmax = BMAX_EDEFAULT;
        bmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__BMAX, oldBmax, BMAX_EDEFAULT, oldBmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBmax() {
        return bmaxESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__DB1, oldDb1, db1, !oldDb1ESet ) );
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
                CimPackage.GOV_HYDRO4__DB1, oldDb1, DB1_EDEFAULT, oldDb1ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__DB2, oldDb2, db2, !oldDb2ESet ) );
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
                CimPackage.GOV_HYDRO4__DB2, oldDb2, DB2_EDEFAULT, oldDb2ESet ) );
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
                CimPackage.GOV_HYDRO4__DTURB, oldDturb, dturb, !oldDturbESet ) );
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
                CimPackage.GOV_HYDRO4__DTURB, oldDturb, DTURB_EDEFAULT, oldDturbESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__EPS, oldEps, eps, !oldEpsESet ) );
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
                CimPackage.GOV_HYDRO4__EPS, oldEps, EPS_EDEFAULT, oldEpsESet ) );
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
                CimPackage.GOV_HYDRO4__GMAX, oldGmax, gmax, !oldGmaxESet ) );
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
                CimPackage.GOV_HYDRO4__GMAX, oldGmax, GMAX_EDEFAULT, oldGmaxESet ) );
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
                CimPackage.GOV_HYDRO4__GMIN, oldGmin, gmin, !oldGminESet ) );
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
                CimPackage.GOV_HYDRO4__GMIN, oldGmin, GMIN_EDEFAULT, oldGminESet ) );
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
    public Float getGv0() {
        return gv0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv0( Float newGv0 ) {
        Float oldGv0 = gv0;
        gv0 = newGv0;
        boolean oldGv0ESet = gv0ESet;
        gv0ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__GV0, oldGv0, gv0, !oldGv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv0() {
        Float oldGv0 = gv0;
        boolean oldGv0ESet = gv0ESet;
        gv0 = GV0_EDEFAULT;
        gv0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__GV0, oldGv0, GV0_EDEFAULT, oldGv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv0() {
        return gv0ESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__GV1, oldGv1, gv1, !oldGv1ESet ) );
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
                CimPackage.GOV_HYDRO4__GV1, oldGv1, GV1_EDEFAULT, oldGv1ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__GV2, oldGv2, gv2, !oldGv2ESet ) );
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
                CimPackage.GOV_HYDRO4__GV2, oldGv2, GV2_EDEFAULT, oldGv2ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__GV3, oldGv3, gv3, !oldGv3ESet ) );
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
                CimPackage.GOV_HYDRO4__GV3, oldGv3, GV3_EDEFAULT, oldGv3ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__GV4, oldGv4, gv4, !oldGv4ESet ) );
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
                CimPackage.GOV_HYDRO4__GV4, oldGv4, GV4_EDEFAULT, oldGv4ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__GV5, oldGv5, gv5, !oldGv5ESet ) );
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
                CimPackage.GOV_HYDRO4__GV5, oldGv5, GV5_EDEFAULT, oldGv5ESet ) );
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
    public Float getHdam() {
        return hdam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHdam( Float newHdam ) {
        Float oldHdam = hdam;
        hdam = newHdam;
        boolean oldHdamESet = hdamESet;
        hdamESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__HDAM, oldHdam, hdam, !oldHdamESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHdam() {
        Float oldHdam = hdam;
        boolean oldHdamESet = hdamESet;
        hdam = HDAM_EDEFAULT;
        hdamESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__HDAM, oldHdam, HDAM_EDEFAULT, oldHdamESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHdam() {
        return hdamESet;
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
                CimPackage.GOV_HYDRO4__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
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
                CimPackage.GOV_HYDRO4__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
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
    public Float getPgv0() {
        return pgv0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv0( Float newPgv0 ) {
        Float oldPgv0 = pgv0;
        pgv0 = newPgv0;
        boolean oldPgv0ESet = pgv0ESet;
        pgv0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__PGV0, oldPgv0, pgv0, !oldPgv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv0() {
        Float oldPgv0 = pgv0;
        boolean oldPgv0ESet = pgv0ESet;
        pgv0 = PGV0_EDEFAULT;
        pgv0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__PGV0, oldPgv0, PGV0_EDEFAULT, oldPgv0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv0() {
        return pgv0ESet;
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
                CimPackage.GOV_HYDRO4__PGV1, oldPgv1, pgv1, !oldPgv1ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV1, oldPgv1, PGV1_EDEFAULT, oldPgv1ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV2, oldPgv2, pgv2, !oldPgv2ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV2, oldPgv2, PGV2_EDEFAULT, oldPgv2ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV3, oldPgv3, pgv3, !oldPgv3ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV3, oldPgv3, PGV3_EDEFAULT, oldPgv3ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV4, oldPgv4, pgv4, !oldPgv4ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV4, oldPgv4, PGV4_EDEFAULT, oldPgv4ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV5, oldPgv5, pgv5, !oldPgv5ESet ) );
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
                CimPackage.GOV_HYDRO4__PGV5, oldPgv5, PGV5_EDEFAULT, oldPgv5ESet ) );
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
    public Float getQn1() {
        return qn1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQn1( Float newQn1 ) {
        Float oldQn1 = qn1;
        qn1 = newQn1;
        boolean oldQn1ESet = qn1ESet;
        qn1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__QN1, oldQn1, qn1, !oldQn1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQn1() {
        Float oldQn1 = qn1;
        boolean oldQn1ESet = qn1ESet;
        qn1 = QN1_EDEFAULT;
        qn1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__QN1, oldQn1, QN1_EDEFAULT, oldQn1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQn1() {
        return qn1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRperm() {
        return rperm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRperm( Float newRperm ) {
        Float oldRperm = rperm;
        rperm = newRperm;
        boolean oldRpermESet = rpermESet;
        rpermESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__RPERM, oldRperm, rperm, !oldRpermESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRperm() {
        Float oldRperm = rperm;
        boolean oldRpermESet = rpermESet;
        rperm = RPERM_EDEFAULT;
        rpermESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__RPERM, oldRperm, RPERM_EDEFAULT, oldRpermESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRperm() {
        return rpermESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRtemp() {
        return rtemp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRtemp( Float newRtemp ) {
        Float oldRtemp = rtemp;
        rtemp = newRtemp;
        boolean oldRtempESet = rtempESet;
        rtempESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__RTEMP, oldRtemp, rtemp, !oldRtempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRtemp() {
        Float oldRtemp = rtemp;
        boolean oldRtempESet = rtempESet;
        rtemp = RTEMP_EDEFAULT;
        rtempESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__RTEMP, oldRtemp, RTEMP_EDEFAULT, oldRtempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRtemp() {
        return rtempESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTblade() {
        return tblade;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTblade( Float newTblade ) {
        Float oldTblade = tblade;
        tblade = newTblade;
        boolean oldTbladeESet = tbladeESet;
        tbladeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO4__TBLADE, oldTblade, tblade, !oldTbladeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTblade() {
        Float oldTblade = tblade;
        boolean oldTbladeESet = tbladeESet;
        tblade = TBLADE_EDEFAULT;
        tbladeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__TBLADE, oldTblade, TBLADE_EDEFAULT, oldTbladeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTblade() {
        return tbladeESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__TG, oldTg, tg, !oldTgESet ) );
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
                CimPackage.GOV_HYDRO4__TG, oldTg, TG_EDEFAULT, oldTgESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__TP, oldTp, tp, !oldTpESet ) );
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
                CimPackage.GOV_HYDRO4__TP, oldTp, TP_EDEFAULT, oldTpESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__TR, oldTr, tr, !oldTrESet ) );
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
                CimPackage.GOV_HYDRO4__TR, oldTr, TR_EDEFAULT, oldTrESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__TW, oldTw, tw, !oldTwESet ) );
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
                CimPackage.GOV_HYDRO4__TW, oldTw, TW_EDEFAULT, oldTwESet ) );
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
    public Float getUc() {
        return uc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUc( Float newUc ) {
        Float oldUc = uc;
        uc = newUc;
        boolean oldUcESet = ucESet;
        ucESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__UC, oldUc, uc, !oldUcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUc() {
        Float oldUc = uc;
        boolean oldUcESet = ucESet;
        uc = UC_EDEFAULT;
        ucESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__UC, oldUc, UC_EDEFAULT, oldUcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUc() {
        return ucESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUo() {
        return uo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUo( Float newUo ) {
        Float oldUo = uo;
        uo = newUo;
        boolean oldUoESet = uoESet;
        uoESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO4__UO, oldUo, uo, !oldUoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUo() {
        Float oldUo = uo;
        boolean oldUoESet = uoESet;
        uo = UO_EDEFAULT;
        uoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO4__UO, oldUo, UO_EDEFAULT, oldUoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUo() {
        return uoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_HYDRO4__AT:
            return getAt();
        case CimPackage.GOV_HYDRO4__BGV0:
            return getBgv0();
        case CimPackage.GOV_HYDRO4__BGV1:
            return getBgv1();
        case CimPackage.GOV_HYDRO4__BGV2:
            return getBgv2();
        case CimPackage.GOV_HYDRO4__BGV3:
            return getBgv3();
        case CimPackage.GOV_HYDRO4__BGV4:
            return getBgv4();
        case CimPackage.GOV_HYDRO4__BGV5:
            return getBgv5();
        case CimPackage.GOV_HYDRO4__BMAX:
            return getBmax();
        case CimPackage.GOV_HYDRO4__DB1:
            return getDb1();
        case CimPackage.GOV_HYDRO4__DB2:
            return getDb2();
        case CimPackage.GOV_HYDRO4__DTURB:
            return getDturb();
        case CimPackage.GOV_HYDRO4__EPS:
            return getEps();
        case CimPackage.GOV_HYDRO4__GMAX:
            return getGmax();
        case CimPackage.GOV_HYDRO4__GMIN:
            return getGmin();
        case CimPackage.GOV_HYDRO4__GV0:
            return getGv0();
        case CimPackage.GOV_HYDRO4__GV1:
            return getGv1();
        case CimPackage.GOV_HYDRO4__GV2:
            return getGv2();
        case CimPackage.GOV_HYDRO4__GV3:
            return getGv3();
        case CimPackage.GOV_HYDRO4__GV4:
            return getGv4();
        case CimPackage.GOV_HYDRO4__GV5:
            return getGv5();
        case CimPackage.GOV_HYDRO4__HDAM:
            return getHdam();
        case CimPackage.GOV_HYDRO4__MWBASE:
            return getMwbase();
        case CimPackage.GOV_HYDRO4__PGV0:
            return getPgv0();
        case CimPackage.GOV_HYDRO4__PGV1:
            return getPgv1();
        case CimPackage.GOV_HYDRO4__PGV2:
            return getPgv2();
        case CimPackage.GOV_HYDRO4__PGV3:
            return getPgv3();
        case CimPackage.GOV_HYDRO4__PGV4:
            return getPgv4();
        case CimPackage.GOV_HYDRO4__PGV5:
            return getPgv5();
        case CimPackage.GOV_HYDRO4__QN1:
            return getQn1();
        case CimPackage.GOV_HYDRO4__RPERM:
            return getRperm();
        case CimPackage.GOV_HYDRO4__RTEMP:
            return getRtemp();
        case CimPackage.GOV_HYDRO4__TBLADE:
            return getTblade();
        case CimPackage.GOV_HYDRO4__TG:
            return getTg();
        case CimPackage.GOV_HYDRO4__TP:
            return getTp();
        case CimPackage.GOV_HYDRO4__TR:
            return getTr();
        case CimPackage.GOV_HYDRO4__TW:
            return getTw();
        case CimPackage.GOV_HYDRO4__UC:
            return getUc();
        case CimPackage.GOV_HYDRO4__UO:
            return getUo();
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
        case CimPackage.GOV_HYDRO4__AT:
            setAt( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__BGV0:
            setBgv0( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__BGV1:
            setBgv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__BGV2:
            setBgv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__BGV3:
            setBgv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__BGV4:
            setBgv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__BGV5:
            setBgv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__BMAX:
            setBmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__DB1:
            setDb1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__DB2:
            setDb2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__DTURB:
            setDturb( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__EPS:
            setEps( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GMAX:
            setGmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GMIN:
            setGmin( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GV0:
            setGv0( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GV1:
            setGv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GV2:
            setGv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GV3:
            setGv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GV4:
            setGv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__GV5:
            setGv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__HDAM:
            setHdam( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__PGV0:
            setPgv0( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__PGV1:
            setPgv1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__PGV2:
            setPgv2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__PGV3:
            setPgv3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__PGV4:
            setPgv4( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__PGV5:
            setPgv5( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__QN1:
            setQn1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__RPERM:
            setRperm( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__RTEMP:
            setRtemp( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__TBLADE:
            setTblade( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__TG:
            setTg( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__TP:
            setTp( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__TR:
            setTr( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__TW:
            setTw( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__UC:
            setUc( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO4__UO:
            setUo( ( Float ) newValue );
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
        case CimPackage.GOV_HYDRO4__AT:
            unsetAt();
            return;
        case CimPackage.GOV_HYDRO4__BGV0:
            unsetBgv0();
            return;
        case CimPackage.GOV_HYDRO4__BGV1:
            unsetBgv1();
            return;
        case CimPackage.GOV_HYDRO4__BGV2:
            unsetBgv2();
            return;
        case CimPackage.GOV_HYDRO4__BGV3:
            unsetBgv3();
            return;
        case CimPackage.GOV_HYDRO4__BGV4:
            unsetBgv4();
            return;
        case CimPackage.GOV_HYDRO4__BGV5:
            unsetBgv5();
            return;
        case CimPackage.GOV_HYDRO4__BMAX:
            unsetBmax();
            return;
        case CimPackage.GOV_HYDRO4__DB1:
            unsetDb1();
            return;
        case CimPackage.GOV_HYDRO4__DB2:
            unsetDb2();
            return;
        case CimPackage.GOV_HYDRO4__DTURB:
            unsetDturb();
            return;
        case CimPackage.GOV_HYDRO4__EPS:
            unsetEps();
            return;
        case CimPackage.GOV_HYDRO4__GMAX:
            unsetGmax();
            return;
        case CimPackage.GOV_HYDRO4__GMIN:
            unsetGmin();
            return;
        case CimPackage.GOV_HYDRO4__GV0:
            unsetGv0();
            return;
        case CimPackage.GOV_HYDRO4__GV1:
            unsetGv1();
            return;
        case CimPackage.GOV_HYDRO4__GV2:
            unsetGv2();
            return;
        case CimPackage.GOV_HYDRO4__GV3:
            unsetGv3();
            return;
        case CimPackage.GOV_HYDRO4__GV4:
            unsetGv4();
            return;
        case CimPackage.GOV_HYDRO4__GV5:
            unsetGv5();
            return;
        case CimPackage.GOV_HYDRO4__HDAM:
            unsetHdam();
            return;
        case CimPackage.GOV_HYDRO4__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_HYDRO4__PGV0:
            unsetPgv0();
            return;
        case CimPackage.GOV_HYDRO4__PGV1:
            unsetPgv1();
            return;
        case CimPackage.GOV_HYDRO4__PGV2:
            unsetPgv2();
            return;
        case CimPackage.GOV_HYDRO4__PGV3:
            unsetPgv3();
            return;
        case CimPackage.GOV_HYDRO4__PGV4:
            unsetPgv4();
            return;
        case CimPackage.GOV_HYDRO4__PGV5:
            unsetPgv5();
            return;
        case CimPackage.GOV_HYDRO4__QN1:
            unsetQn1();
            return;
        case CimPackage.GOV_HYDRO4__RPERM:
            unsetRperm();
            return;
        case CimPackage.GOV_HYDRO4__RTEMP:
            unsetRtemp();
            return;
        case CimPackage.GOV_HYDRO4__TBLADE:
            unsetTblade();
            return;
        case CimPackage.GOV_HYDRO4__TG:
            unsetTg();
            return;
        case CimPackage.GOV_HYDRO4__TP:
            unsetTp();
            return;
        case CimPackage.GOV_HYDRO4__TR:
            unsetTr();
            return;
        case CimPackage.GOV_HYDRO4__TW:
            unsetTw();
            return;
        case CimPackage.GOV_HYDRO4__UC:
            unsetUc();
            return;
        case CimPackage.GOV_HYDRO4__UO:
            unsetUo();
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
        case CimPackage.GOV_HYDRO4__AT:
            return isSetAt();
        case CimPackage.GOV_HYDRO4__BGV0:
            return isSetBgv0();
        case CimPackage.GOV_HYDRO4__BGV1:
            return isSetBgv1();
        case CimPackage.GOV_HYDRO4__BGV2:
            return isSetBgv2();
        case CimPackage.GOV_HYDRO4__BGV3:
            return isSetBgv3();
        case CimPackage.GOV_HYDRO4__BGV4:
            return isSetBgv4();
        case CimPackage.GOV_HYDRO4__BGV5:
            return isSetBgv5();
        case CimPackage.GOV_HYDRO4__BMAX:
            return isSetBmax();
        case CimPackage.GOV_HYDRO4__DB1:
            return isSetDb1();
        case CimPackage.GOV_HYDRO4__DB2:
            return isSetDb2();
        case CimPackage.GOV_HYDRO4__DTURB:
            return isSetDturb();
        case CimPackage.GOV_HYDRO4__EPS:
            return isSetEps();
        case CimPackage.GOV_HYDRO4__GMAX:
            return isSetGmax();
        case CimPackage.GOV_HYDRO4__GMIN:
            return isSetGmin();
        case CimPackage.GOV_HYDRO4__GV0:
            return isSetGv0();
        case CimPackage.GOV_HYDRO4__GV1:
            return isSetGv1();
        case CimPackage.GOV_HYDRO4__GV2:
            return isSetGv2();
        case CimPackage.GOV_HYDRO4__GV3:
            return isSetGv3();
        case CimPackage.GOV_HYDRO4__GV4:
            return isSetGv4();
        case CimPackage.GOV_HYDRO4__GV5:
            return isSetGv5();
        case CimPackage.GOV_HYDRO4__HDAM:
            return isSetHdam();
        case CimPackage.GOV_HYDRO4__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_HYDRO4__PGV0:
            return isSetPgv0();
        case CimPackage.GOV_HYDRO4__PGV1:
            return isSetPgv1();
        case CimPackage.GOV_HYDRO4__PGV2:
            return isSetPgv2();
        case CimPackage.GOV_HYDRO4__PGV3:
            return isSetPgv3();
        case CimPackage.GOV_HYDRO4__PGV4:
            return isSetPgv4();
        case CimPackage.GOV_HYDRO4__PGV5:
            return isSetPgv5();
        case CimPackage.GOV_HYDRO4__QN1:
            return isSetQn1();
        case CimPackage.GOV_HYDRO4__RPERM:
            return isSetRperm();
        case CimPackage.GOV_HYDRO4__RTEMP:
            return isSetRtemp();
        case CimPackage.GOV_HYDRO4__TBLADE:
            return isSetTblade();
        case CimPackage.GOV_HYDRO4__TG:
            return isSetTg();
        case CimPackage.GOV_HYDRO4__TP:
            return isSetTp();
        case CimPackage.GOV_HYDRO4__TR:
            return isSetTr();
        case CimPackage.GOV_HYDRO4__TW:
            return isSetTw();
        case CimPackage.GOV_HYDRO4__UC:
            return isSetUc();
        case CimPackage.GOV_HYDRO4__UO:
            return isSetUo();
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
        result.append( ", bgv0: " );
        if( bgv0ESet )
            result.append( bgv0 );
        else
            result.append( "<unset>" );
        result.append( ", bgv1: " );
        if( bgv1ESet )
            result.append( bgv1 );
        else
            result.append( "<unset>" );
        result.append( ", bgv2: " );
        if( bgv2ESet )
            result.append( bgv2 );
        else
            result.append( "<unset>" );
        result.append( ", bgv3: " );
        if( bgv3ESet )
            result.append( bgv3 );
        else
            result.append( "<unset>" );
        result.append( ", bgv4: " );
        if( bgv4ESet )
            result.append( bgv4 );
        else
            result.append( "<unset>" );
        result.append( ", bgv5: " );
        if( bgv5ESet )
            result.append( bgv5 );
        else
            result.append( "<unset>" );
        result.append( ", bmax: " );
        if( bmaxESet )
            result.append( bmax );
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
        result.append( ", gv0: " );
        if( gv0ESet )
            result.append( gv0 );
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
        result.append( ", hdam: " );
        if( hdamESet )
            result.append( hdam );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", pgv0: " );
        if( pgv0ESet )
            result.append( pgv0 );
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
        result.append( ", qn1: " );
        if( qn1ESet )
            result.append( qn1 );
        else
            result.append( "<unset>" );
        result.append( ", rperm: " );
        if( rpermESet )
            result.append( rperm );
        else
            result.append( "<unset>" );
        result.append( ", rtemp: " );
        if( rtempESet )
            result.append( rtemp );
        else
            result.append( "<unset>" );
        result.append( ", tblade: " );
        if( tbladeESet )
            result.append( tblade );
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
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", tw: " );
        if( twESet )
            result.append( tw );
        else
            result.append( "<unset>" );
        result.append( ", uc: " );
        if( ucESet )
            result.append( uc );
        else
            result.append( "<unset>" );
        result.append( ", uo: " );
        if( uoESet )
            result.append( uo );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovHydro4Impl
