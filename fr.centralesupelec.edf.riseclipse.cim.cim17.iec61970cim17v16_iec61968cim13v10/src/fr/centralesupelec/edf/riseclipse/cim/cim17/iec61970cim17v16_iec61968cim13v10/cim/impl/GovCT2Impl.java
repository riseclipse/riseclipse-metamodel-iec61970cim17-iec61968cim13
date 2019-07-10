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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DroopSignalFeedbackKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovCT2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov CT2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getAset <em>Aset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getDm <em>Dm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim1 <em>Flim1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim10 <em>Flim10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim2 <em>Flim2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim3 <em>Flim3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim4 <em>Flim4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim5 <em>Flim5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim6 <em>Flim6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim7 <em>Flim7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim8 <em>Flim8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getFlim9 <em>Flim9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKdgov <em>Kdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKigov <em>Kigov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKiload <em>Kiload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKimw <em>Kimw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKpgov <em>Kpgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKpload <em>Kpload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getKturb <em>Kturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getLdref <em>Ldref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getMaxerr <em>Maxerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getMinerr <em>Minerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim1 <em>Plim1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim10 <em>Plim10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim2 <em>Plim2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim3 <em>Plim3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim4 <em>Plim4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim5 <em>Plim5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim6 <em>Plim6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim7 <em>Plim7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim8 <em>Plim8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPlim9 <em>Plim9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getPrate <em>Prate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getRclose <em>Rclose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getRdown <em>Rdown</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getRopen <em>Ropen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getRselect <em>Rselect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getRup <em>Rup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTact <em>Tact</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTdgov <em>Tdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTeng <em>Teng</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTfload <em>Tfload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTpelec <em>Tpelec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTsa <em>Tsa</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getTsb <em>Tsb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getVmax <em>Vmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getVmin <em>Vmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getWfnl <em>Wfnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovCT2Impl#getWfspd <em>Wfspd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovCT2Impl extends TurbineGovernorDynamicsImpl implements GovCT2 {
    /**
     * The default value of the '{@link #getAset() <em>Aset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAset()
     * @generated
     * @ordered
     */
    protected static final Float ASET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAset() <em>Aset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAset()
     * @generated
     * @ordered
     */
    protected Float aset = ASET_EDEFAULT;

    /**
     * This is true if the Aset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asetESet;

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
     * The default value of the '{@link #getDm() <em>Dm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDm()
     * @generated
     * @ordered
     */
    protected static final Float DM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDm() <em>Dm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDm()
     * @generated
     * @ordered
     */
    protected Float dm = DM_EDEFAULT;

    /**
     * This is true if the Dm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dmESet;

    /**
     * The default value of the '{@link #getFlim1() <em>Flim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim1()
     * @generated
     * @ordered
     */
    protected static final Float FLIM1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim1() <em>Flim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim1()
     * @generated
     * @ordered
     */
    protected Float flim1 = FLIM1_EDEFAULT;

    /**
     * This is true if the Flim1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim1ESet;

    /**
     * The default value of the '{@link #getFlim10() <em>Flim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim10()
     * @generated
     * @ordered
     */
    protected static final Float FLIM10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim10() <em>Flim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim10()
     * @generated
     * @ordered
     */
    protected Float flim10 = FLIM10_EDEFAULT;

    /**
     * This is true if the Flim10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim10ESet;

    /**
     * The default value of the '{@link #getFlim2() <em>Flim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim2()
     * @generated
     * @ordered
     */
    protected static final Float FLIM2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim2() <em>Flim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim2()
     * @generated
     * @ordered
     */
    protected Float flim2 = FLIM2_EDEFAULT;

    /**
     * This is true if the Flim2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim2ESet;

    /**
     * The default value of the '{@link #getFlim3() <em>Flim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim3()
     * @generated
     * @ordered
     */
    protected static final Float FLIM3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim3() <em>Flim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim3()
     * @generated
     * @ordered
     */
    protected Float flim3 = FLIM3_EDEFAULT;

    /**
     * This is true if the Flim3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim3ESet;

    /**
     * The default value of the '{@link #getFlim4() <em>Flim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim4()
     * @generated
     * @ordered
     */
    protected static final Float FLIM4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim4() <em>Flim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim4()
     * @generated
     * @ordered
     */
    protected Float flim4 = FLIM4_EDEFAULT;

    /**
     * This is true if the Flim4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim4ESet;

    /**
     * The default value of the '{@link #getFlim5() <em>Flim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim5()
     * @generated
     * @ordered
     */
    protected static final Float FLIM5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim5() <em>Flim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim5()
     * @generated
     * @ordered
     */
    protected Float flim5 = FLIM5_EDEFAULT;

    /**
     * This is true if the Flim5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim5ESet;

    /**
     * The default value of the '{@link #getFlim6() <em>Flim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim6()
     * @generated
     * @ordered
     */
    protected static final Float FLIM6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim6() <em>Flim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim6()
     * @generated
     * @ordered
     */
    protected Float flim6 = FLIM6_EDEFAULT;

    /**
     * This is true if the Flim6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim6ESet;

    /**
     * The default value of the '{@link #getFlim7() <em>Flim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim7()
     * @generated
     * @ordered
     */
    protected static final Float FLIM7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim7() <em>Flim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim7()
     * @generated
     * @ordered
     */
    protected Float flim7 = FLIM7_EDEFAULT;

    /**
     * This is true if the Flim7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim7ESet;

    /**
     * The default value of the '{@link #getFlim8() <em>Flim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim8()
     * @generated
     * @ordered
     */
    protected static final Float FLIM8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim8() <em>Flim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim8()
     * @generated
     * @ordered
     */
    protected Float flim8 = FLIM8_EDEFAULT;

    /**
     * This is true if the Flim8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim8ESet;

    /**
     * The default value of the '{@link #getFlim9() <em>Flim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim9()
     * @generated
     * @ordered
     */
    protected static final Float FLIM9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlim9() <em>Flim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlim9()
     * @generated
     * @ordered
     */
    protected Float flim9 = FLIM9_EDEFAULT;

    /**
     * This is true if the Flim9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flim9ESet;

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
     * The default value of the '{@link #getKdgov() <em>Kdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdgov()
     * @generated
     * @ordered
     */
    protected static final Float KDGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdgov() <em>Kdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdgov()
     * @generated
     * @ordered
     */
    protected Float kdgov = KDGOV_EDEFAULT;

    /**
     * This is true if the Kdgov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdgovESet;

    /**
     * The default value of the '{@link #getKigov() <em>Kigov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKigov()
     * @generated
     * @ordered
     */
    protected static final Float KIGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKigov() <em>Kigov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKigov()
     * @generated
     * @ordered
     */
    protected Float kigov = KIGOV_EDEFAULT;

    /**
     * This is true if the Kigov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kigovESet;

    /**
     * The default value of the '{@link #getKiload() <em>Kiload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiload()
     * @generated
     * @ordered
     */
    protected static final Float KILOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiload() <em>Kiload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiload()
     * @generated
     * @ordered
     */
    protected Float kiload = KILOAD_EDEFAULT;

    /**
     * This is true if the Kiload attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiloadESet;

    /**
     * The default value of the '{@link #getKimw() <em>Kimw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKimw()
     * @generated
     * @ordered
     */
    protected static final Float KIMW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKimw() <em>Kimw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKimw()
     * @generated
     * @ordered
     */
    protected Float kimw = KIMW_EDEFAULT;

    /**
     * This is true if the Kimw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kimwESet;

    /**
     * The default value of the '{@link #getKpgov() <em>Kpgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpgov()
     * @generated
     * @ordered
     */
    protected static final Float KPGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpgov() <em>Kpgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpgov()
     * @generated
     * @ordered
     */
    protected Float kpgov = KPGOV_EDEFAULT;

    /**
     * This is true if the Kpgov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpgovESet;

    /**
     * The default value of the '{@link #getKpload() <em>Kpload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpload()
     * @generated
     * @ordered
     */
    protected static final Float KPLOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpload() <em>Kpload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpload()
     * @generated
     * @ordered
     */
    protected Float kpload = KPLOAD_EDEFAULT;

    /**
     * This is true if the Kpload attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kploadESet;

    /**
     * The default value of the '{@link #getKturb() <em>Kturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKturb()
     * @generated
     * @ordered
     */
    protected static final Float KTURB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKturb() <em>Kturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKturb()
     * @generated
     * @ordered
     */
    protected Float kturb = KTURB_EDEFAULT;

    /**
     * This is true if the Kturb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kturbESet;

    /**
     * The default value of the '{@link #getLdref() <em>Ldref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdref()
     * @generated
     * @ordered
     */
    protected static final Float LDREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLdref() <em>Ldref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdref()
     * @generated
     * @ordered
     */
    protected Float ldref = LDREF_EDEFAULT;

    /**
     * This is true if the Ldref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ldrefESet;

    /**
     * The default value of the '{@link #getMaxerr() <em>Maxerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxerr()
     * @generated
     * @ordered
     */
    protected static final Float MAXERR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxerr() <em>Maxerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxerr()
     * @generated
     * @ordered
     */
    protected Float maxerr = MAXERR_EDEFAULT;

    /**
     * This is true if the Maxerr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxerrESet;

    /**
     * The default value of the '{@link #getMinerr() <em>Minerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinerr()
     * @generated
     * @ordered
     */
    protected static final Float MINERR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinerr() <em>Minerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinerr()
     * @generated
     * @ordered
     */
    protected Float minerr = MINERR_EDEFAULT;

    /**
     * This is true if the Minerr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minerrESet;

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
     * The default value of the '{@link #getPlim1() <em>Plim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim1()
     * @generated
     * @ordered
     */
    protected static final Float PLIM1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim1() <em>Plim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim1()
     * @generated
     * @ordered
     */
    protected Float plim1 = PLIM1_EDEFAULT;

    /**
     * This is true if the Plim1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim1ESet;

    /**
     * The default value of the '{@link #getPlim10() <em>Plim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim10()
     * @generated
     * @ordered
     */
    protected static final Float PLIM10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim10() <em>Plim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim10()
     * @generated
     * @ordered
     */
    protected Float plim10 = PLIM10_EDEFAULT;

    /**
     * This is true if the Plim10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim10ESet;

    /**
     * The default value of the '{@link #getPlim2() <em>Plim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim2()
     * @generated
     * @ordered
     */
    protected static final Float PLIM2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim2() <em>Plim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim2()
     * @generated
     * @ordered
     */
    protected Float plim2 = PLIM2_EDEFAULT;

    /**
     * This is true if the Plim2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim2ESet;

    /**
     * The default value of the '{@link #getPlim3() <em>Plim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim3()
     * @generated
     * @ordered
     */
    protected static final Float PLIM3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim3() <em>Plim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim3()
     * @generated
     * @ordered
     */
    protected Float plim3 = PLIM3_EDEFAULT;

    /**
     * This is true if the Plim3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim3ESet;

    /**
     * The default value of the '{@link #getPlim4() <em>Plim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim4()
     * @generated
     * @ordered
     */
    protected static final Float PLIM4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim4() <em>Plim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim4()
     * @generated
     * @ordered
     */
    protected Float plim4 = PLIM4_EDEFAULT;

    /**
     * This is true if the Plim4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim4ESet;

    /**
     * The default value of the '{@link #getPlim5() <em>Plim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim5()
     * @generated
     * @ordered
     */
    protected static final Float PLIM5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim5() <em>Plim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim5()
     * @generated
     * @ordered
     */
    protected Float plim5 = PLIM5_EDEFAULT;

    /**
     * This is true if the Plim5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim5ESet;

    /**
     * The default value of the '{@link #getPlim6() <em>Plim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim6()
     * @generated
     * @ordered
     */
    protected static final Float PLIM6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim6() <em>Plim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim6()
     * @generated
     * @ordered
     */
    protected Float plim6 = PLIM6_EDEFAULT;

    /**
     * This is true if the Plim6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim6ESet;

    /**
     * The default value of the '{@link #getPlim7() <em>Plim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim7()
     * @generated
     * @ordered
     */
    protected static final Float PLIM7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim7() <em>Plim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim7()
     * @generated
     * @ordered
     */
    protected Float plim7 = PLIM7_EDEFAULT;

    /**
     * This is true if the Plim7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim7ESet;

    /**
     * The default value of the '{@link #getPlim8() <em>Plim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim8()
     * @generated
     * @ordered
     */
    protected static final Float PLIM8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim8() <em>Plim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim8()
     * @generated
     * @ordered
     */
    protected Float plim8 = PLIM8_EDEFAULT;

    /**
     * This is true if the Plim8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim8ESet;

    /**
     * The default value of the '{@link #getPlim9() <em>Plim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim9()
     * @generated
     * @ordered
     */
    protected static final Float PLIM9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPlim9() <em>Plim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlim9()
     * @generated
     * @ordered
     */
    protected Float plim9 = PLIM9_EDEFAULT;

    /**
     * This is true if the Plim9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plim9ESet;

    /**
     * The default value of the '{@link #getPrate() <em>Prate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrate()
     * @generated
     * @ordered
     */
    protected static final Float PRATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrate() <em>Prate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrate()
     * @generated
     * @ordered
     */
    protected Float prate = PRATE_EDEFAULT;

    /**
     * This is true if the Prate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prateESet;

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
     * The default value of the '{@link #getRclose() <em>Rclose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRclose()
     * @generated
     * @ordered
     */
    protected static final Float RCLOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRclose() <em>Rclose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRclose()
     * @generated
     * @ordered
     */
    protected Float rclose = RCLOSE_EDEFAULT;

    /**
     * This is true if the Rclose attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcloseESet;

    /**
     * The default value of the '{@link #getRdown() <em>Rdown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRdown()
     * @generated
     * @ordered
     */
    protected static final Float RDOWN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRdown() <em>Rdown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRdown()
     * @generated
     * @ordered
     */
    protected Float rdown = RDOWN_EDEFAULT;

    /**
     * This is true if the Rdown attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rdownESet;

    /**
     * The default value of the '{@link #getRopen() <em>Ropen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRopen()
     * @generated
     * @ordered
     */
    protected static final Float ROPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRopen() <em>Ropen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRopen()
     * @generated
     * @ordered
     */
    protected Float ropen = ROPEN_EDEFAULT;

    /**
     * This is true if the Ropen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ropenESet;

    /**
     * The default value of the '{@link #getRselect() <em>Rselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRselect()
     * @generated
     * @ordered
     */
    protected static final DroopSignalFeedbackKind RSELECT_EDEFAULT = DroopSignalFeedbackKind.ELECTRICAL_POWER;

    /**
     * The cached value of the '{@link #getRselect() <em>Rselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRselect()
     * @generated
     * @ordered
     */
    protected DroopSignalFeedbackKind rselect = RSELECT_EDEFAULT;

    /**
     * This is true if the Rselect attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rselectESet;

    /**
     * The default value of the '{@link #getRup() <em>Rup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRup()
     * @generated
     * @ordered
     */
    protected static final Float RUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRup() <em>Rup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRup()
     * @generated
     * @ordered
     */
    protected Float rup = RUP_EDEFAULT;

    /**
     * This is true if the Rup attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rupESet;

    /**
     * The default value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected static final Float TA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected Float ta = TA_EDEFAULT;

    /**
     * This is true if the Ta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taESet;

    /**
     * The default value of the '{@link #getTact() <em>Tact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTact()
     * @generated
     * @ordered
     */
    protected static final Float TACT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTact() <em>Tact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTact()
     * @generated
     * @ordered
     */
    protected Float tact = TACT_EDEFAULT;

    /**
     * This is true if the Tact attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tactESet;

    /**
     * The default value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected static final Float TB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected Float tb = TB_EDEFAULT;

    /**
     * This is true if the Tb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbESet;

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
     * The default value of the '{@link #getTdgov() <em>Tdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdgov()
     * @generated
     * @ordered
     */
    protected static final Float TDGOV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdgov() <em>Tdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdgov()
     * @generated
     * @ordered
     */
    protected Float tdgov = TDGOV_EDEFAULT;

    /**
     * This is true if the Tdgov attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdgovESet;

    /**
     * The default value of the '{@link #getTeng() <em>Teng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeng()
     * @generated
     * @ordered
     */
    protected static final Float TENG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTeng() <em>Teng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeng()
     * @generated
     * @ordered
     */
    protected Float teng = TENG_EDEFAULT;

    /**
     * This is true if the Teng attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tengESet;

    /**
     * The default value of the '{@link #getTfload() <em>Tfload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfload()
     * @generated
     * @ordered
     */
    protected static final Float TFLOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfload() <em>Tfload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfload()
     * @generated
     * @ordered
     */
    protected Float tfload = TFLOAD_EDEFAULT;

    /**
     * This is true if the Tfload attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfloadESet;

    /**
     * The default value of the '{@link #getTpelec() <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpelec()
     * @generated
     * @ordered
     */
    protected static final Float TPELEC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpelec() <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpelec()
     * @generated
     * @ordered
     */
    protected Float tpelec = TPELEC_EDEFAULT;

    /**
     * This is true if the Tpelec attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpelecESet;

    /**
     * The default value of the '{@link #getTsa() <em>Tsa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsa()
     * @generated
     * @ordered
     */
    protected static final Float TSA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTsa() <em>Tsa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsa()
     * @generated
     * @ordered
     */
    protected Float tsa = TSA_EDEFAULT;

    /**
     * This is true if the Tsa attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tsaESet;

    /**
     * The default value of the '{@link #getTsb() <em>Tsb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsb()
     * @generated
     * @ordered
     */
    protected static final Float TSB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTsb() <em>Tsb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsb()
     * @generated
     * @ordered
     */
    protected Float tsb = TSB_EDEFAULT;

    /**
     * This is true if the Tsb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tsbESet;

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
     * The default value of the '{@link #getWfnl() <em>Wfnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfnl()
     * @generated
     * @ordered
     */
    protected static final Float WFNL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWfnl() <em>Wfnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfnl()
     * @generated
     * @ordered
     */
    protected Float wfnl = WFNL_EDEFAULT;

    /**
     * This is true if the Wfnl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wfnlESet;

    /**
     * The default value of the '{@link #getWfspd() <em>Wfspd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfspd()
     * @generated
     * @ordered
     */
    protected static final Boolean WFSPD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWfspd() <em>Wfspd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWfspd()
     * @generated
     * @ordered
     */
    protected Boolean wfspd = WFSPD_EDEFAULT;

    /**
     * This is true if the Wfspd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wfspdESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovCT2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovCT2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAset() {
        return aset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAset( Float newAset ) {
        Float oldAset = aset;
        aset = newAset;
        boolean oldAsetESet = asetESet;
        asetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__ASET,
                oldAset, aset, !oldAsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAset() {
        Float oldAset = aset;
        boolean oldAsetESet = asetESet;
        aset = ASET_EDEFAULT;
        asetESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__ASET, oldAset, ASET_EDEFAULT, oldAsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAset() {
        return asetESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__DB, oldDb, db, !oldDbESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__DB,
                oldDb, DB_EDEFAULT, oldDbESet ) );
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
    public Float getDm() {
        return dm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDm( Float newDm ) {
        Float oldDm = dm;
        dm = newDm;
        boolean oldDmESet = dmESet;
        dmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__DM, oldDm, dm, !oldDmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDm() {
        Float oldDm = dm;
        boolean oldDmESet = dmESet;
        dm = DM_EDEFAULT;
        dmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__DM,
                oldDm, DM_EDEFAULT, oldDmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDm() {
        return dmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim1() {
        return flim1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim1( Float newFlim1 ) {
        Float oldFlim1 = flim1;
        flim1 = newFlim1;
        boolean oldFlim1ESet = flim1ESet;
        flim1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM1,
                oldFlim1, flim1, !oldFlim1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim1() {
        Float oldFlim1 = flim1;
        boolean oldFlim1ESet = flim1ESet;
        flim1 = FLIM1_EDEFAULT;
        flim1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM1, oldFlim1, FLIM1_EDEFAULT, oldFlim1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim1() {
        return flim1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim10() {
        return flim10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim10( Float newFlim10 ) {
        Float oldFlim10 = flim10;
        flim10 = newFlim10;
        boolean oldFlim10ESet = flim10ESet;
        flim10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__FLIM10, oldFlim10, flim10, !oldFlim10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim10() {
        Float oldFlim10 = flim10;
        boolean oldFlim10ESet = flim10ESet;
        flim10 = FLIM10_EDEFAULT;
        flim10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM10, oldFlim10, FLIM10_EDEFAULT, oldFlim10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim10() {
        return flim10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim2() {
        return flim2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim2( Float newFlim2 ) {
        Float oldFlim2 = flim2;
        flim2 = newFlim2;
        boolean oldFlim2ESet = flim2ESet;
        flim2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM2,
                oldFlim2, flim2, !oldFlim2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim2() {
        Float oldFlim2 = flim2;
        boolean oldFlim2ESet = flim2ESet;
        flim2 = FLIM2_EDEFAULT;
        flim2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM2, oldFlim2, FLIM2_EDEFAULT, oldFlim2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim2() {
        return flim2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim3() {
        return flim3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim3( Float newFlim3 ) {
        Float oldFlim3 = flim3;
        flim3 = newFlim3;
        boolean oldFlim3ESet = flim3ESet;
        flim3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM3,
                oldFlim3, flim3, !oldFlim3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim3() {
        Float oldFlim3 = flim3;
        boolean oldFlim3ESet = flim3ESet;
        flim3 = FLIM3_EDEFAULT;
        flim3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM3, oldFlim3, FLIM3_EDEFAULT, oldFlim3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim3() {
        return flim3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim4() {
        return flim4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim4( Float newFlim4 ) {
        Float oldFlim4 = flim4;
        flim4 = newFlim4;
        boolean oldFlim4ESet = flim4ESet;
        flim4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM4,
                oldFlim4, flim4, !oldFlim4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim4() {
        Float oldFlim4 = flim4;
        boolean oldFlim4ESet = flim4ESet;
        flim4 = FLIM4_EDEFAULT;
        flim4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM4, oldFlim4, FLIM4_EDEFAULT, oldFlim4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim4() {
        return flim4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim5() {
        return flim5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim5( Float newFlim5 ) {
        Float oldFlim5 = flim5;
        flim5 = newFlim5;
        boolean oldFlim5ESet = flim5ESet;
        flim5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM5,
                oldFlim5, flim5, !oldFlim5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim5() {
        Float oldFlim5 = flim5;
        boolean oldFlim5ESet = flim5ESet;
        flim5 = FLIM5_EDEFAULT;
        flim5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM5, oldFlim5, FLIM5_EDEFAULT, oldFlim5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim5() {
        return flim5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim6() {
        return flim6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim6( Float newFlim6 ) {
        Float oldFlim6 = flim6;
        flim6 = newFlim6;
        boolean oldFlim6ESet = flim6ESet;
        flim6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM6,
                oldFlim6, flim6, !oldFlim6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim6() {
        Float oldFlim6 = flim6;
        boolean oldFlim6ESet = flim6ESet;
        flim6 = FLIM6_EDEFAULT;
        flim6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM6, oldFlim6, FLIM6_EDEFAULT, oldFlim6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim6() {
        return flim6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim7() {
        return flim7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim7( Float newFlim7 ) {
        Float oldFlim7 = flim7;
        flim7 = newFlim7;
        boolean oldFlim7ESet = flim7ESet;
        flim7ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM7,
                oldFlim7, flim7, !oldFlim7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim7() {
        Float oldFlim7 = flim7;
        boolean oldFlim7ESet = flim7ESet;
        flim7 = FLIM7_EDEFAULT;
        flim7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM7, oldFlim7, FLIM7_EDEFAULT, oldFlim7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim7() {
        return flim7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim8() {
        return flim8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim8( Float newFlim8 ) {
        Float oldFlim8 = flim8;
        flim8 = newFlim8;
        boolean oldFlim8ESet = flim8ESet;
        flim8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM8,
                oldFlim8, flim8, !oldFlim8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim8() {
        Float oldFlim8 = flim8;
        boolean oldFlim8ESet = flim8ESet;
        flim8 = FLIM8_EDEFAULT;
        flim8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM8, oldFlim8, FLIM8_EDEFAULT, oldFlim8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim8() {
        return flim8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFlim9() {
        return flim9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlim9( Float newFlim9 ) {
        Float oldFlim9 = flim9;
        flim9 = newFlim9;
        boolean oldFlim9ESet = flim9ESet;
        flim9ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__FLIM9,
                oldFlim9, flim9, !oldFlim9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlim9() {
        Float oldFlim9 = flim9;
        boolean oldFlim9ESet = flim9ESet;
        flim9 = FLIM9_EDEFAULT;
        flim9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__FLIM9, oldFlim9, FLIM9_EDEFAULT, oldFlim9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlim9() {
        return flim9ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__KA, oldKa, ka, !oldKaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__KA,
                oldKa, KA_EDEFAULT, oldKaESet ) );
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
    public Float getKdgov() {
        return kdgov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdgov( Float newKdgov ) {
        Float oldKdgov = kdgov;
        kdgov = newKdgov;
        boolean oldKdgovESet = kdgovESet;
        kdgovESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__KDGOV,
                oldKdgov, kdgov, !oldKdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdgov() {
        Float oldKdgov = kdgov;
        boolean oldKdgovESet = kdgovESet;
        kdgov = KDGOV_EDEFAULT;
        kdgovESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__KDGOV, oldKdgov, KDGOV_EDEFAULT, oldKdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdgov() {
        return kdgovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKigov() {
        return kigov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKigov( Float newKigov ) {
        Float oldKigov = kigov;
        kigov = newKigov;
        boolean oldKigovESet = kigovESet;
        kigovESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__KIGOV,
                oldKigov, kigov, !oldKigovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKigov() {
        Float oldKigov = kigov;
        boolean oldKigovESet = kigovESet;
        kigov = KIGOV_EDEFAULT;
        kigovESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__KIGOV, oldKigov, KIGOV_EDEFAULT, oldKigovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKigov() {
        return kigovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKiload() {
        return kiload;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiload( Float newKiload ) {
        Float oldKiload = kiload;
        kiload = newKiload;
        boolean oldKiloadESet = kiloadESet;
        kiloadESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__KILOAD, oldKiload, kiload, !oldKiloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiload() {
        Float oldKiload = kiload;
        boolean oldKiloadESet = kiloadESet;
        kiload = KILOAD_EDEFAULT;
        kiloadESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__KILOAD, oldKiload, KILOAD_EDEFAULT, oldKiloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiload() {
        return kiloadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKimw() {
        return kimw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKimw( Float newKimw ) {
        Float oldKimw = kimw;
        kimw = newKimw;
        boolean oldKimwESet = kimwESet;
        kimwESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__KIMW,
                oldKimw, kimw, !oldKimwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKimw() {
        Float oldKimw = kimw;
        boolean oldKimwESet = kimwESet;
        kimw = KIMW_EDEFAULT;
        kimwESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__KIMW, oldKimw, KIMW_EDEFAULT, oldKimwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKimw() {
        return kimwESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpgov() {
        return kpgov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpgov( Float newKpgov ) {
        Float oldKpgov = kpgov;
        kpgov = newKpgov;
        boolean oldKpgovESet = kpgovESet;
        kpgovESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__KPGOV,
                oldKpgov, kpgov, !oldKpgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpgov() {
        Float oldKpgov = kpgov;
        boolean oldKpgovESet = kpgovESet;
        kpgov = KPGOV_EDEFAULT;
        kpgovESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__KPGOV, oldKpgov, KPGOV_EDEFAULT, oldKpgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpgov() {
        return kpgovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpload() {
        return kpload;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpload( Float newKpload ) {
        Float oldKpload = kpload;
        kpload = newKpload;
        boolean oldKploadESet = kploadESet;
        kploadESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__KPLOAD, oldKpload, kpload, !oldKploadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpload() {
        Float oldKpload = kpload;
        boolean oldKploadESet = kploadESet;
        kpload = KPLOAD_EDEFAULT;
        kploadESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__KPLOAD, oldKpload, KPLOAD_EDEFAULT, oldKploadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpload() {
        return kploadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKturb() {
        return kturb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKturb( Float newKturb ) {
        Float oldKturb = kturb;
        kturb = newKturb;
        boolean oldKturbESet = kturbESet;
        kturbESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__KTURB,
                oldKturb, kturb, !oldKturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKturb() {
        Float oldKturb = kturb;
        boolean oldKturbESet = kturbESet;
        kturb = KTURB_EDEFAULT;
        kturbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__KTURB, oldKturb, KTURB_EDEFAULT, oldKturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKturb() {
        return kturbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLdref() {
        return ldref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLdref( Float newLdref ) {
        Float oldLdref = ldref;
        ldref = newLdref;
        boolean oldLdrefESet = ldrefESet;
        ldrefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__LDREF,
                oldLdref, ldref, !oldLdrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLdref() {
        Float oldLdref = ldref;
        boolean oldLdrefESet = ldrefESet;
        ldref = LDREF_EDEFAULT;
        ldrefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__LDREF, oldLdref, LDREF_EDEFAULT, oldLdrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLdref() {
        return ldrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxerr() {
        return maxerr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxerr( Float newMaxerr ) {
        Float oldMaxerr = maxerr;
        maxerr = newMaxerr;
        boolean oldMaxerrESet = maxerrESet;
        maxerrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__MAXERR, oldMaxerr, maxerr, !oldMaxerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxerr() {
        Float oldMaxerr = maxerr;
        boolean oldMaxerrESet = maxerrESet;
        maxerr = MAXERR_EDEFAULT;
        maxerrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__MAXERR, oldMaxerr, MAXERR_EDEFAULT, oldMaxerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxerr() {
        return maxerrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinerr() {
        return minerr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinerr( Float newMinerr ) {
        Float oldMinerr = minerr;
        minerr = newMinerr;
        boolean oldMinerrESet = minerrESet;
        minerrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__MINERR, oldMinerr, minerr, !oldMinerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinerr() {
        Float oldMinerr = minerr;
        boolean oldMinerrESet = minerrESet;
        minerr = MINERR_EDEFAULT;
        minerrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__MINERR, oldMinerr, MINERR_EDEFAULT, oldMinerrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinerr() {
        return minerrESet;
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
                CimPackage.GOV_CT2__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
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
                CimPackage.GOV_CT2__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
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
    public Float getPlim1() {
        return plim1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim1( Float newPlim1 ) {
        Float oldPlim1 = plim1;
        plim1 = newPlim1;
        boolean oldPlim1ESet = plim1ESet;
        plim1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM1,
                oldPlim1, plim1, !oldPlim1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim1() {
        Float oldPlim1 = plim1;
        boolean oldPlim1ESet = plim1ESet;
        plim1 = PLIM1_EDEFAULT;
        plim1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM1, oldPlim1, PLIM1_EDEFAULT, oldPlim1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim1() {
        return plim1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim10() {
        return plim10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim10( Float newPlim10 ) {
        Float oldPlim10 = plim10;
        plim10 = newPlim10;
        boolean oldPlim10ESet = plim10ESet;
        plim10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__PLIM10, oldPlim10, plim10, !oldPlim10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim10() {
        Float oldPlim10 = plim10;
        boolean oldPlim10ESet = plim10ESet;
        plim10 = PLIM10_EDEFAULT;
        plim10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM10, oldPlim10, PLIM10_EDEFAULT, oldPlim10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim10() {
        return plim10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim2() {
        return plim2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim2( Float newPlim2 ) {
        Float oldPlim2 = plim2;
        plim2 = newPlim2;
        boolean oldPlim2ESet = plim2ESet;
        plim2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM2,
                oldPlim2, plim2, !oldPlim2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim2() {
        Float oldPlim2 = plim2;
        boolean oldPlim2ESet = plim2ESet;
        plim2 = PLIM2_EDEFAULT;
        plim2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM2, oldPlim2, PLIM2_EDEFAULT, oldPlim2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim2() {
        return plim2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim3() {
        return plim3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim3( Float newPlim3 ) {
        Float oldPlim3 = plim3;
        plim3 = newPlim3;
        boolean oldPlim3ESet = plim3ESet;
        plim3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM3,
                oldPlim3, plim3, !oldPlim3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim3() {
        Float oldPlim3 = plim3;
        boolean oldPlim3ESet = plim3ESet;
        plim3 = PLIM3_EDEFAULT;
        plim3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM3, oldPlim3, PLIM3_EDEFAULT, oldPlim3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim3() {
        return plim3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim4() {
        return plim4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim4( Float newPlim4 ) {
        Float oldPlim4 = plim4;
        plim4 = newPlim4;
        boolean oldPlim4ESet = plim4ESet;
        plim4ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM4,
                oldPlim4, plim4, !oldPlim4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim4() {
        Float oldPlim4 = plim4;
        boolean oldPlim4ESet = plim4ESet;
        plim4 = PLIM4_EDEFAULT;
        plim4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM4, oldPlim4, PLIM4_EDEFAULT, oldPlim4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim4() {
        return plim4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim5() {
        return plim5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim5( Float newPlim5 ) {
        Float oldPlim5 = plim5;
        plim5 = newPlim5;
        boolean oldPlim5ESet = plim5ESet;
        plim5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM5,
                oldPlim5, plim5, !oldPlim5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim5() {
        Float oldPlim5 = plim5;
        boolean oldPlim5ESet = plim5ESet;
        plim5 = PLIM5_EDEFAULT;
        plim5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM5, oldPlim5, PLIM5_EDEFAULT, oldPlim5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim5() {
        return plim5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim6() {
        return plim6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim6( Float newPlim6 ) {
        Float oldPlim6 = plim6;
        plim6 = newPlim6;
        boolean oldPlim6ESet = plim6ESet;
        plim6ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM6,
                oldPlim6, plim6, !oldPlim6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim6() {
        Float oldPlim6 = plim6;
        boolean oldPlim6ESet = plim6ESet;
        plim6 = PLIM6_EDEFAULT;
        plim6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM6, oldPlim6, PLIM6_EDEFAULT, oldPlim6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim6() {
        return plim6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim7() {
        return plim7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim7( Float newPlim7 ) {
        Float oldPlim7 = plim7;
        plim7 = newPlim7;
        boolean oldPlim7ESet = plim7ESet;
        plim7ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM7,
                oldPlim7, plim7, !oldPlim7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim7() {
        Float oldPlim7 = plim7;
        boolean oldPlim7ESet = plim7ESet;
        plim7 = PLIM7_EDEFAULT;
        plim7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM7, oldPlim7, PLIM7_EDEFAULT, oldPlim7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim7() {
        return plim7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim8() {
        return plim8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim8( Float newPlim8 ) {
        Float oldPlim8 = plim8;
        plim8 = newPlim8;
        boolean oldPlim8ESet = plim8ESet;
        plim8ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM8,
                oldPlim8, plim8, !oldPlim8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim8() {
        Float oldPlim8 = plim8;
        boolean oldPlim8ESet = plim8ESet;
        plim8 = PLIM8_EDEFAULT;
        plim8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM8, oldPlim8, PLIM8_EDEFAULT, oldPlim8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim8() {
        return plim8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPlim9() {
        return plim9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPlim9( Float newPlim9 ) {
        Float oldPlim9 = plim9;
        plim9 = newPlim9;
        boolean oldPlim9ESet = plim9ESet;
        plim9ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PLIM9,
                oldPlim9, plim9, !oldPlim9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPlim9() {
        Float oldPlim9 = plim9;
        boolean oldPlim9ESet = plim9ESet;
        plim9 = PLIM9_EDEFAULT;
        plim9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PLIM9, oldPlim9, PLIM9_EDEFAULT, oldPlim9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlim9() {
        return plim9ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPrate() {
        return prate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrate( Float newPrate ) {
        Float oldPrate = prate;
        prate = newPrate;
        boolean oldPrateESet = prateESet;
        prateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__PRATE,
                oldPrate, prate, !oldPrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrate() {
        Float oldPrate = prate;
        boolean oldPrateESet = prateESet;
        prate = PRATE_EDEFAULT;
        prateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__PRATE, oldPrate, PRATE_EDEFAULT, oldPrateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrate() {
        return prateESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__R, oldR, r, !oldRESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__R, oldR, R_EDEFAULT, oldRESet ) );
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
    public Float getRclose() {
        return rclose;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRclose( Float newRclose ) {
        Float oldRclose = rclose;
        rclose = newRclose;
        boolean oldRcloseESet = rcloseESet;
        rcloseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__RCLOSE, oldRclose, rclose, !oldRcloseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRclose() {
        Float oldRclose = rclose;
        boolean oldRcloseESet = rcloseESet;
        rclose = RCLOSE_EDEFAULT;
        rcloseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__RCLOSE, oldRclose, RCLOSE_EDEFAULT, oldRcloseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRclose() {
        return rcloseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRdown() {
        return rdown;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRdown( Float newRdown ) {
        Float oldRdown = rdown;
        rdown = newRdown;
        boolean oldRdownESet = rdownESet;
        rdownESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__RDOWN,
                oldRdown, rdown, !oldRdownESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRdown() {
        Float oldRdown = rdown;
        boolean oldRdownESet = rdownESet;
        rdown = RDOWN_EDEFAULT;
        rdownESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__RDOWN, oldRdown, RDOWN_EDEFAULT, oldRdownESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRdown() {
        return rdownESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRopen() {
        return ropen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRopen( Float newRopen ) {
        Float oldRopen = ropen;
        ropen = newRopen;
        boolean oldRopenESet = ropenESet;
        ropenESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__ROPEN,
                oldRopen, ropen, !oldRopenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRopen() {
        Float oldRopen = ropen;
        boolean oldRopenESet = ropenESet;
        ropen = ROPEN_EDEFAULT;
        ropenESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__ROPEN, oldRopen, ROPEN_EDEFAULT, oldRopenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRopen() {
        return ropenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DroopSignalFeedbackKind getRselect() {
        return rselect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRselect( DroopSignalFeedbackKind newRselect ) {
        DroopSignalFeedbackKind oldRselect = rselect;
        rselect = newRselect == null ? RSELECT_EDEFAULT : newRselect;
        boolean oldRselectESet = rselectESet;
        rselectESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__RSELECT, oldRselect, rselect, !oldRselectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRselect() {
        DroopSignalFeedbackKind oldRselect = rselect;
        boolean oldRselectESet = rselectESet;
        rselect = RSELECT_EDEFAULT;
        rselectESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__RSELECT, oldRselect, RSELECT_EDEFAULT, oldRselectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRselect() {
        return rselectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRup() {
        return rup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRup( Float newRup ) {
        Float oldRup = rup;
        rup = newRup;
        boolean oldRupESet = rupESet;
        rupESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__RUP, oldRup, rup, !oldRupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRup() {
        Float oldRup = rup;
        boolean oldRupESet = rupESet;
        rup = RUP_EDEFAULT;
        rupESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__RUP,
                oldRup, RUP_EDEFAULT, oldRupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRup() {
        return rupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTa() {
        return ta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa( Float newTa ) {
        Float oldTa = ta;
        ta = newTa;
        boolean oldTaESet = taESet;
        taESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TA, oldTa, ta, !oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa() {
        Float oldTa = ta;
        boolean oldTaESet = taESet;
        ta = TA_EDEFAULT;
        taESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__TA,
                oldTa, TA_EDEFAULT, oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa() {
        return taESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTact() {
        return tact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTact( Float newTact ) {
        Float oldTact = tact;
        tact = newTact;
        boolean oldTactESet = tactESet;
        tactESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TACT,
                oldTact, tact, !oldTactESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTact() {
        Float oldTact = tact;
        boolean oldTactESet = tactESet;
        tact = TACT_EDEFAULT;
        tactESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__TACT, oldTact, TACT_EDEFAULT, oldTactESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTact() {
        return tactESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTb() {
        return tb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb( Float newTb ) {
        Float oldTb = tb;
        tb = newTb;
        boolean oldTbESet = tbESet;
        tbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TB, oldTb, tb, !oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb() {
        Float oldTb = tb;
        boolean oldTbESet = tbESet;
        tb = TB_EDEFAULT;
        tbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__TB,
                oldTb, TB_EDEFAULT, oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb() {
        return tbESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TC, oldTc, tc, !oldTcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__TC,
                oldTc, TC_EDEFAULT, oldTcESet ) );
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
    public Float getTdgov() {
        return tdgov;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdgov( Float newTdgov ) {
        Float oldTdgov = tdgov;
        tdgov = newTdgov;
        boolean oldTdgovESet = tdgovESet;
        tdgovESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TDGOV,
                oldTdgov, tdgov, !oldTdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdgov() {
        Float oldTdgov = tdgov;
        boolean oldTdgovESet = tdgovESet;
        tdgov = TDGOV_EDEFAULT;
        tdgovESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__TDGOV, oldTdgov, TDGOV_EDEFAULT, oldTdgovESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdgov() {
        return tdgovESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTeng() {
        return teng;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTeng( Float newTeng ) {
        Float oldTeng = teng;
        teng = newTeng;
        boolean oldTengESet = tengESet;
        tengESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TENG,
                oldTeng, teng, !oldTengESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTeng() {
        Float oldTeng = teng;
        boolean oldTengESet = tengESet;
        teng = TENG_EDEFAULT;
        tengESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__TENG, oldTeng, TENG_EDEFAULT, oldTengESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTeng() {
        return tengESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTfload() {
        return tfload;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfload( Float newTfload ) {
        Float oldTfload = tfload;
        tfload = newTfload;
        boolean oldTfloadESet = tfloadESet;
        tfloadESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__TFLOAD, oldTfload, tfload, !oldTfloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfload() {
        Float oldTfload = tfload;
        boolean oldTfloadESet = tfloadESet;
        tfload = TFLOAD_EDEFAULT;
        tfloadESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__TFLOAD, oldTfload, TFLOAD_EDEFAULT, oldTfloadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfload() {
        return tfloadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpelec() {
        return tpelec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpelec( Float newTpelec ) {
        Float oldTpelec = tpelec;
        tpelec = newTpelec;
        boolean oldTpelecESet = tpelecESet;
        tpelecESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_CT2__TPELEC, oldTpelec, tpelec, !oldTpelecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpelec() {
        Float oldTpelec = tpelec;
        boolean oldTpelecESet = tpelecESet;
        tpelec = TPELEC_EDEFAULT;
        tpelecESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__TPELEC, oldTpelec, TPELEC_EDEFAULT, oldTpelecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpelec() {
        return tpelecESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTsa() {
        return tsa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTsa( Float newTsa ) {
        Float oldTsa = tsa;
        tsa = newTsa;
        boolean oldTsaESet = tsaESet;
        tsaESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TSA, oldTsa, tsa, !oldTsaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTsa() {
        Float oldTsa = tsa;
        boolean oldTsaESet = tsaESet;
        tsa = TSA_EDEFAULT;
        tsaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__TSA,
                oldTsa, TSA_EDEFAULT, oldTsaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTsa() {
        return tsaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTsb() {
        return tsb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTsb( Float newTsb ) {
        Float oldTsb = tsb;
        tsb = newTsb;
        boolean oldTsbESet = tsbESet;
        tsbESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__TSB, oldTsb, tsb, !oldTsbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTsb() {
        Float oldTsb = tsb;
        boolean oldTsbESet = tsbESet;
        tsb = TSB_EDEFAULT;
        tsbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_CT2__TSB,
                oldTsb, TSB_EDEFAULT, oldTsbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTsb() {
        return tsbESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__VMAX,
                oldVmax, vmax, !oldVmaxESet ) );
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
                CimPackage.GOV_CT2__VMAX, oldVmax, VMAX_EDEFAULT, oldVmaxESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__VMIN,
                oldVmin, vmin, !oldVminESet ) );
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
                CimPackage.GOV_CT2__VMIN, oldVmin, VMIN_EDEFAULT, oldVminESet ) );
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
    public Float getWfnl() {
        return wfnl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWfnl( Float newWfnl ) {
        Float oldWfnl = wfnl;
        wfnl = newWfnl;
        boolean oldWfnlESet = wfnlESet;
        wfnlESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__WFNL,
                oldWfnl, wfnl, !oldWfnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWfnl() {
        Float oldWfnl = wfnl;
        boolean oldWfnlESet = wfnlESet;
        wfnl = WFNL_EDEFAULT;
        wfnlESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__WFNL, oldWfnl, WFNL_EDEFAULT, oldWfnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWfnl() {
        return wfnlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getWfspd() {
        return wfspd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWfspd( Boolean newWfspd ) {
        Boolean oldWfspd = wfspd;
        wfspd = newWfspd;
        boolean oldWfspdESet = wfspdESet;
        wfspdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_CT2__WFSPD,
                oldWfspd, wfspd, !oldWfspdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWfspd() {
        Boolean oldWfspd = wfspd;
        boolean oldWfspdESet = wfspdESet;
        wfspd = WFSPD_EDEFAULT;
        wfspdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_CT2__WFSPD, oldWfspd, WFSPD_EDEFAULT, oldWfspdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWfspd() {
        return wfspdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_CT2__ASET:
            return getAset();
        case CimPackage.GOV_CT2__DB:
            return getDb();
        case CimPackage.GOV_CT2__DM:
            return getDm();
        case CimPackage.GOV_CT2__FLIM1:
            return getFlim1();
        case CimPackage.GOV_CT2__FLIM10:
            return getFlim10();
        case CimPackage.GOV_CT2__FLIM2:
            return getFlim2();
        case CimPackage.GOV_CT2__FLIM3:
            return getFlim3();
        case CimPackage.GOV_CT2__FLIM4:
            return getFlim4();
        case CimPackage.GOV_CT2__FLIM5:
            return getFlim5();
        case CimPackage.GOV_CT2__FLIM6:
            return getFlim6();
        case CimPackage.GOV_CT2__FLIM7:
            return getFlim7();
        case CimPackage.GOV_CT2__FLIM8:
            return getFlim8();
        case CimPackage.GOV_CT2__FLIM9:
            return getFlim9();
        case CimPackage.GOV_CT2__KA:
            return getKa();
        case CimPackage.GOV_CT2__KDGOV:
            return getKdgov();
        case CimPackage.GOV_CT2__KIGOV:
            return getKigov();
        case CimPackage.GOV_CT2__KILOAD:
            return getKiload();
        case CimPackage.GOV_CT2__KIMW:
            return getKimw();
        case CimPackage.GOV_CT2__KPGOV:
            return getKpgov();
        case CimPackage.GOV_CT2__KPLOAD:
            return getKpload();
        case CimPackage.GOV_CT2__KTURB:
            return getKturb();
        case CimPackage.GOV_CT2__LDREF:
            return getLdref();
        case CimPackage.GOV_CT2__MAXERR:
            return getMaxerr();
        case CimPackage.GOV_CT2__MINERR:
            return getMinerr();
        case CimPackage.GOV_CT2__MWBASE:
            return getMwbase();
        case CimPackage.GOV_CT2__PLIM1:
            return getPlim1();
        case CimPackage.GOV_CT2__PLIM10:
            return getPlim10();
        case CimPackage.GOV_CT2__PLIM2:
            return getPlim2();
        case CimPackage.GOV_CT2__PLIM3:
            return getPlim3();
        case CimPackage.GOV_CT2__PLIM4:
            return getPlim4();
        case CimPackage.GOV_CT2__PLIM5:
            return getPlim5();
        case CimPackage.GOV_CT2__PLIM6:
            return getPlim6();
        case CimPackage.GOV_CT2__PLIM7:
            return getPlim7();
        case CimPackage.GOV_CT2__PLIM8:
            return getPlim8();
        case CimPackage.GOV_CT2__PLIM9:
            return getPlim9();
        case CimPackage.GOV_CT2__PRATE:
            return getPrate();
        case CimPackage.GOV_CT2__R:
            return getR();
        case CimPackage.GOV_CT2__RCLOSE:
            return getRclose();
        case CimPackage.GOV_CT2__RDOWN:
            return getRdown();
        case CimPackage.GOV_CT2__ROPEN:
            return getRopen();
        case CimPackage.GOV_CT2__RSELECT:
            return getRselect();
        case CimPackage.GOV_CT2__RUP:
            return getRup();
        case CimPackage.GOV_CT2__TA:
            return getTa();
        case CimPackage.GOV_CT2__TACT:
            return getTact();
        case CimPackage.GOV_CT2__TB:
            return getTb();
        case CimPackage.GOV_CT2__TC:
            return getTc();
        case CimPackage.GOV_CT2__TDGOV:
            return getTdgov();
        case CimPackage.GOV_CT2__TENG:
            return getTeng();
        case CimPackage.GOV_CT2__TFLOAD:
            return getTfload();
        case CimPackage.GOV_CT2__TPELEC:
            return getTpelec();
        case CimPackage.GOV_CT2__TSA:
            return getTsa();
        case CimPackage.GOV_CT2__TSB:
            return getTsb();
        case CimPackage.GOV_CT2__VMAX:
            return getVmax();
        case CimPackage.GOV_CT2__VMIN:
            return getVmin();
        case CimPackage.GOV_CT2__WFNL:
            return getWfnl();
        case CimPackage.GOV_CT2__WFSPD:
            return getWfspd();
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
        case CimPackage.GOV_CT2__ASET:
            setAset( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__DB:
            setDb( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__DM:
            setDm( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM1:
            setFlim1( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM10:
            setFlim10( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM2:
            setFlim2( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM3:
            setFlim3( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM4:
            setFlim4( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM5:
            setFlim5( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM6:
            setFlim6( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM7:
            setFlim7( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM8:
            setFlim8( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__FLIM9:
            setFlim9( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KDGOV:
            setKdgov( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KIGOV:
            setKigov( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KILOAD:
            setKiload( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KIMW:
            setKimw( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KPGOV:
            setKpgov( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KPLOAD:
            setKpload( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__KTURB:
            setKturb( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__LDREF:
            setLdref( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__MAXERR:
            setMaxerr( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__MINERR:
            setMinerr( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM1:
            setPlim1( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM10:
            setPlim10( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM2:
            setPlim2( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM3:
            setPlim3( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM4:
            setPlim4( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM5:
            setPlim5( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM6:
            setPlim6( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM7:
            setPlim7( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM8:
            setPlim8( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PLIM9:
            setPlim9( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__PRATE:
            setPrate( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__RCLOSE:
            setRclose( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__RDOWN:
            setRdown( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__ROPEN:
            setRopen( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__RSELECT:
            setRselect( ( DroopSignalFeedbackKind ) newValue );
            return;
        case CimPackage.GOV_CT2__RUP:
            setRup( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TACT:
            setTact( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TB:
            setTb( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TDGOV:
            setTdgov( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TENG:
            setTeng( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TFLOAD:
            setTfload( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TPELEC:
            setTpelec( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TSA:
            setTsa( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__TSB:
            setTsb( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__VMAX:
            setVmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__VMIN:
            setVmin( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__WFNL:
            setWfnl( ( Float ) newValue );
            return;
        case CimPackage.GOV_CT2__WFSPD:
            setWfspd( ( Boolean ) newValue );
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
        case CimPackage.GOV_CT2__ASET:
            unsetAset();
            return;
        case CimPackage.GOV_CT2__DB:
            unsetDb();
            return;
        case CimPackage.GOV_CT2__DM:
            unsetDm();
            return;
        case CimPackage.GOV_CT2__FLIM1:
            unsetFlim1();
            return;
        case CimPackage.GOV_CT2__FLIM10:
            unsetFlim10();
            return;
        case CimPackage.GOV_CT2__FLIM2:
            unsetFlim2();
            return;
        case CimPackage.GOV_CT2__FLIM3:
            unsetFlim3();
            return;
        case CimPackage.GOV_CT2__FLIM4:
            unsetFlim4();
            return;
        case CimPackage.GOV_CT2__FLIM5:
            unsetFlim5();
            return;
        case CimPackage.GOV_CT2__FLIM6:
            unsetFlim6();
            return;
        case CimPackage.GOV_CT2__FLIM7:
            unsetFlim7();
            return;
        case CimPackage.GOV_CT2__FLIM8:
            unsetFlim8();
            return;
        case CimPackage.GOV_CT2__FLIM9:
            unsetFlim9();
            return;
        case CimPackage.GOV_CT2__KA:
            unsetKa();
            return;
        case CimPackage.GOV_CT2__KDGOV:
            unsetKdgov();
            return;
        case CimPackage.GOV_CT2__KIGOV:
            unsetKigov();
            return;
        case CimPackage.GOV_CT2__KILOAD:
            unsetKiload();
            return;
        case CimPackage.GOV_CT2__KIMW:
            unsetKimw();
            return;
        case CimPackage.GOV_CT2__KPGOV:
            unsetKpgov();
            return;
        case CimPackage.GOV_CT2__KPLOAD:
            unsetKpload();
            return;
        case CimPackage.GOV_CT2__KTURB:
            unsetKturb();
            return;
        case CimPackage.GOV_CT2__LDREF:
            unsetLdref();
            return;
        case CimPackage.GOV_CT2__MAXERR:
            unsetMaxerr();
            return;
        case CimPackage.GOV_CT2__MINERR:
            unsetMinerr();
            return;
        case CimPackage.GOV_CT2__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_CT2__PLIM1:
            unsetPlim1();
            return;
        case CimPackage.GOV_CT2__PLIM10:
            unsetPlim10();
            return;
        case CimPackage.GOV_CT2__PLIM2:
            unsetPlim2();
            return;
        case CimPackage.GOV_CT2__PLIM3:
            unsetPlim3();
            return;
        case CimPackage.GOV_CT2__PLIM4:
            unsetPlim4();
            return;
        case CimPackage.GOV_CT2__PLIM5:
            unsetPlim5();
            return;
        case CimPackage.GOV_CT2__PLIM6:
            unsetPlim6();
            return;
        case CimPackage.GOV_CT2__PLIM7:
            unsetPlim7();
            return;
        case CimPackage.GOV_CT2__PLIM8:
            unsetPlim8();
            return;
        case CimPackage.GOV_CT2__PLIM9:
            unsetPlim9();
            return;
        case CimPackage.GOV_CT2__PRATE:
            unsetPrate();
            return;
        case CimPackage.GOV_CT2__R:
            unsetR();
            return;
        case CimPackage.GOV_CT2__RCLOSE:
            unsetRclose();
            return;
        case CimPackage.GOV_CT2__RDOWN:
            unsetRdown();
            return;
        case CimPackage.GOV_CT2__ROPEN:
            unsetRopen();
            return;
        case CimPackage.GOV_CT2__RSELECT:
            unsetRselect();
            return;
        case CimPackage.GOV_CT2__RUP:
            unsetRup();
            return;
        case CimPackage.GOV_CT2__TA:
            unsetTa();
            return;
        case CimPackage.GOV_CT2__TACT:
            unsetTact();
            return;
        case CimPackage.GOV_CT2__TB:
            unsetTb();
            return;
        case CimPackage.GOV_CT2__TC:
            unsetTc();
            return;
        case CimPackage.GOV_CT2__TDGOV:
            unsetTdgov();
            return;
        case CimPackage.GOV_CT2__TENG:
            unsetTeng();
            return;
        case CimPackage.GOV_CT2__TFLOAD:
            unsetTfload();
            return;
        case CimPackage.GOV_CT2__TPELEC:
            unsetTpelec();
            return;
        case CimPackage.GOV_CT2__TSA:
            unsetTsa();
            return;
        case CimPackage.GOV_CT2__TSB:
            unsetTsb();
            return;
        case CimPackage.GOV_CT2__VMAX:
            unsetVmax();
            return;
        case CimPackage.GOV_CT2__VMIN:
            unsetVmin();
            return;
        case CimPackage.GOV_CT2__WFNL:
            unsetWfnl();
            return;
        case CimPackage.GOV_CT2__WFSPD:
            unsetWfspd();
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
        case CimPackage.GOV_CT2__ASET:
            return isSetAset();
        case CimPackage.GOV_CT2__DB:
            return isSetDb();
        case CimPackage.GOV_CT2__DM:
            return isSetDm();
        case CimPackage.GOV_CT2__FLIM1:
            return isSetFlim1();
        case CimPackage.GOV_CT2__FLIM10:
            return isSetFlim10();
        case CimPackage.GOV_CT2__FLIM2:
            return isSetFlim2();
        case CimPackage.GOV_CT2__FLIM3:
            return isSetFlim3();
        case CimPackage.GOV_CT2__FLIM4:
            return isSetFlim4();
        case CimPackage.GOV_CT2__FLIM5:
            return isSetFlim5();
        case CimPackage.GOV_CT2__FLIM6:
            return isSetFlim6();
        case CimPackage.GOV_CT2__FLIM7:
            return isSetFlim7();
        case CimPackage.GOV_CT2__FLIM8:
            return isSetFlim8();
        case CimPackage.GOV_CT2__FLIM9:
            return isSetFlim9();
        case CimPackage.GOV_CT2__KA:
            return isSetKa();
        case CimPackage.GOV_CT2__KDGOV:
            return isSetKdgov();
        case CimPackage.GOV_CT2__KIGOV:
            return isSetKigov();
        case CimPackage.GOV_CT2__KILOAD:
            return isSetKiload();
        case CimPackage.GOV_CT2__KIMW:
            return isSetKimw();
        case CimPackage.GOV_CT2__KPGOV:
            return isSetKpgov();
        case CimPackage.GOV_CT2__KPLOAD:
            return isSetKpload();
        case CimPackage.GOV_CT2__KTURB:
            return isSetKturb();
        case CimPackage.GOV_CT2__LDREF:
            return isSetLdref();
        case CimPackage.GOV_CT2__MAXERR:
            return isSetMaxerr();
        case CimPackage.GOV_CT2__MINERR:
            return isSetMinerr();
        case CimPackage.GOV_CT2__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_CT2__PLIM1:
            return isSetPlim1();
        case CimPackage.GOV_CT2__PLIM10:
            return isSetPlim10();
        case CimPackage.GOV_CT2__PLIM2:
            return isSetPlim2();
        case CimPackage.GOV_CT2__PLIM3:
            return isSetPlim3();
        case CimPackage.GOV_CT2__PLIM4:
            return isSetPlim4();
        case CimPackage.GOV_CT2__PLIM5:
            return isSetPlim5();
        case CimPackage.GOV_CT2__PLIM6:
            return isSetPlim6();
        case CimPackage.GOV_CT2__PLIM7:
            return isSetPlim7();
        case CimPackage.GOV_CT2__PLIM8:
            return isSetPlim8();
        case CimPackage.GOV_CT2__PLIM9:
            return isSetPlim9();
        case CimPackage.GOV_CT2__PRATE:
            return isSetPrate();
        case CimPackage.GOV_CT2__R:
            return isSetR();
        case CimPackage.GOV_CT2__RCLOSE:
            return isSetRclose();
        case CimPackage.GOV_CT2__RDOWN:
            return isSetRdown();
        case CimPackage.GOV_CT2__ROPEN:
            return isSetRopen();
        case CimPackage.GOV_CT2__RSELECT:
            return isSetRselect();
        case CimPackage.GOV_CT2__RUP:
            return isSetRup();
        case CimPackage.GOV_CT2__TA:
            return isSetTa();
        case CimPackage.GOV_CT2__TACT:
            return isSetTact();
        case CimPackage.GOV_CT2__TB:
            return isSetTb();
        case CimPackage.GOV_CT2__TC:
            return isSetTc();
        case CimPackage.GOV_CT2__TDGOV:
            return isSetTdgov();
        case CimPackage.GOV_CT2__TENG:
            return isSetTeng();
        case CimPackage.GOV_CT2__TFLOAD:
            return isSetTfload();
        case CimPackage.GOV_CT2__TPELEC:
            return isSetTpelec();
        case CimPackage.GOV_CT2__TSA:
            return isSetTsa();
        case CimPackage.GOV_CT2__TSB:
            return isSetTsb();
        case CimPackage.GOV_CT2__VMAX:
            return isSetVmax();
        case CimPackage.GOV_CT2__VMIN:
            return isSetVmin();
        case CimPackage.GOV_CT2__WFNL:
            return isSetWfnl();
        case CimPackage.GOV_CT2__WFSPD:
            return isSetWfspd();
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
        result.append( " (aset: " );
        if( asetESet )
            result.append( aset );
        else
            result.append( "<unset>" );
        result.append( ", db: " );
        if( dbESet )
            result.append( db );
        else
            result.append( "<unset>" );
        result.append( ", dm: " );
        if( dmESet )
            result.append( dm );
        else
            result.append( "<unset>" );
        result.append( ", flim1: " );
        if( flim1ESet )
            result.append( flim1 );
        else
            result.append( "<unset>" );
        result.append( ", flim10: " );
        if( flim10ESet )
            result.append( flim10 );
        else
            result.append( "<unset>" );
        result.append( ", flim2: " );
        if( flim2ESet )
            result.append( flim2 );
        else
            result.append( "<unset>" );
        result.append( ", flim3: " );
        if( flim3ESet )
            result.append( flim3 );
        else
            result.append( "<unset>" );
        result.append( ", flim4: " );
        if( flim4ESet )
            result.append( flim4 );
        else
            result.append( "<unset>" );
        result.append( ", flim5: " );
        if( flim5ESet )
            result.append( flim5 );
        else
            result.append( "<unset>" );
        result.append( ", flim6: " );
        if( flim6ESet )
            result.append( flim6 );
        else
            result.append( "<unset>" );
        result.append( ", flim7: " );
        if( flim7ESet )
            result.append( flim7 );
        else
            result.append( "<unset>" );
        result.append( ", flim8: " );
        if( flim8ESet )
            result.append( flim8 );
        else
            result.append( "<unset>" );
        result.append( ", flim9: " );
        if( flim9ESet )
            result.append( flim9 );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kdgov: " );
        if( kdgovESet )
            result.append( kdgov );
        else
            result.append( "<unset>" );
        result.append( ", kigov: " );
        if( kigovESet )
            result.append( kigov );
        else
            result.append( "<unset>" );
        result.append( ", kiload: " );
        if( kiloadESet )
            result.append( kiload );
        else
            result.append( "<unset>" );
        result.append( ", kimw: " );
        if( kimwESet )
            result.append( kimw );
        else
            result.append( "<unset>" );
        result.append( ", kpgov: " );
        if( kpgovESet )
            result.append( kpgov );
        else
            result.append( "<unset>" );
        result.append( ", kpload: " );
        if( kploadESet )
            result.append( kpload );
        else
            result.append( "<unset>" );
        result.append( ", kturb: " );
        if( kturbESet )
            result.append( kturb );
        else
            result.append( "<unset>" );
        result.append( ", ldref: " );
        if( ldrefESet )
            result.append( ldref );
        else
            result.append( "<unset>" );
        result.append( ", maxerr: " );
        if( maxerrESet )
            result.append( maxerr );
        else
            result.append( "<unset>" );
        result.append( ", minerr: " );
        if( minerrESet )
            result.append( minerr );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", plim1: " );
        if( plim1ESet )
            result.append( plim1 );
        else
            result.append( "<unset>" );
        result.append( ", plim10: " );
        if( plim10ESet )
            result.append( plim10 );
        else
            result.append( "<unset>" );
        result.append( ", plim2: " );
        if( plim2ESet )
            result.append( plim2 );
        else
            result.append( "<unset>" );
        result.append( ", plim3: " );
        if( plim3ESet )
            result.append( plim3 );
        else
            result.append( "<unset>" );
        result.append( ", plim4: " );
        if( plim4ESet )
            result.append( plim4 );
        else
            result.append( "<unset>" );
        result.append( ", plim5: " );
        if( plim5ESet )
            result.append( plim5 );
        else
            result.append( "<unset>" );
        result.append( ", plim6: " );
        if( plim6ESet )
            result.append( plim6 );
        else
            result.append( "<unset>" );
        result.append( ", plim7: " );
        if( plim7ESet )
            result.append( plim7 );
        else
            result.append( "<unset>" );
        result.append( ", plim8: " );
        if( plim8ESet )
            result.append( plim8 );
        else
            result.append( "<unset>" );
        result.append( ", plim9: " );
        if( plim9ESet )
            result.append( plim9 );
        else
            result.append( "<unset>" );
        result.append( ", prate: " );
        if( prateESet )
            result.append( prate );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", rclose: " );
        if( rcloseESet )
            result.append( rclose );
        else
            result.append( "<unset>" );
        result.append( ", rdown: " );
        if( rdownESet )
            result.append( rdown );
        else
            result.append( "<unset>" );
        result.append( ", ropen: " );
        if( ropenESet )
            result.append( ropen );
        else
            result.append( "<unset>" );
        result.append( ", rselect: " );
        if( rselectESet )
            result.append( rselect );
        else
            result.append( "<unset>" );
        result.append( ", rup: " );
        if( rupESet )
            result.append( rup );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", tact: " );
        if( tactESet )
            result.append( tact );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", tdgov: " );
        if( tdgovESet )
            result.append( tdgov );
        else
            result.append( "<unset>" );
        result.append( ", teng: " );
        if( tengESet )
            result.append( teng );
        else
            result.append( "<unset>" );
        result.append( ", tfload: " );
        if( tfloadESet )
            result.append( tfload );
        else
            result.append( "<unset>" );
        result.append( ", tpelec: " );
        if( tpelecESet )
            result.append( tpelec );
        else
            result.append( "<unset>" );
        result.append( ", tsa: " );
        if( tsaESet )
            result.append( tsa );
        else
            result.append( "<unset>" );
        result.append( ", tsb: " );
        if( tsbESet )
            result.append( tsb );
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
        result.append( ", wfnl: " );
        if( wfnlESet )
            result.append( wfnl );
        else
            result.append( "<unset>" );
        result.append( ", wfspd: " );
        if( wfspdESet )
            result.append( wfspd );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovCT2Impl
