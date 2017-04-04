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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamFV4;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Steam FV4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getCpsmn <em>Cpsmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getCpsmx <em>Cpsmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getCrmn <em>Crmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getCrmx <em>Crmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKdc <em>Kdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKf1 <em>Kf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKf3 <em>Kf3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKhp <em>Khp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKic <em>Kic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKit <em>Kit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKmp1 <em>Kmp1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKmp2 <em>Kmp2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKpp <em>Kpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKpt <em>Kpt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKrc <em>Krc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getKsh <em>Ksh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getLpi <em>Lpi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getLps <em>Lps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getMxef <em>Mxef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getPr1 <em>Pr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getPr2 <em>Pr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getPsmn <em>Psmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getRsmimn <em>Rsmimn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getRsmimx <em>Rsmimx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getRvgmn <em>Rvgmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getRvgmx <em>Rvgmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getSrmn <em>Srmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getSrmx <em>Srmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getSrsmp <em>Srsmp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getSvmn <em>Svmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getSvmx <em>Svmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTam <em>Tam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTcm <em>Tcm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTdc <em>Tdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTf1 <em>Tf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getThp <em>Thp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTmp <em>Tmp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTrh <em>Trh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTv <em>Tv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getTy <em>Ty</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getY <em>Y</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getYhpmn <em>Yhpmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getYhpmx <em>Yhpmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getYmpmn <em>Ympmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovSteamFV4Impl#getYmpmx <em>Ympmx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovSteamFV4Impl extends TurbineGovernorDynamicsImpl implements GovSteamFV4 {
    /**
     * The default value of the '{@link #getCpsmn() <em>Cpsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpsmn()
     * @generated
     * @ordered
     */
    protected static final Float CPSMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCpsmn() <em>Cpsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpsmn()
     * @generated
     * @ordered
     */
    protected Float cpsmn = CPSMN_EDEFAULT;

    /**
     * This is true if the Cpsmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cpsmnESet;

    /**
     * The default value of the '{@link #getCpsmx() <em>Cpsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpsmx()
     * @generated
     * @ordered
     */
    protected static final Float CPSMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCpsmx() <em>Cpsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCpsmx()
     * @generated
     * @ordered
     */
    protected Float cpsmx = CPSMX_EDEFAULT;

    /**
     * This is true if the Cpsmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cpsmxESet;

    /**
     * The default value of the '{@link #getCrmn() <em>Crmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrmn()
     * @generated
     * @ordered
     */
    protected static final Float CRMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCrmn() <em>Crmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrmn()
     * @generated
     * @ordered
     */
    protected Float crmn = CRMN_EDEFAULT;

    /**
     * This is true if the Crmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crmnESet;

    /**
     * The default value of the '{@link #getCrmx() <em>Crmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrmx()
     * @generated
     * @ordered
     */
    protected static final Float CRMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCrmx() <em>Crmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrmx()
     * @generated
     * @ordered
     */
    protected Float crmx = CRMX_EDEFAULT;

    /**
     * This is true if the Crmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crmxESet;

    /**
     * The default value of the '{@link #getKdc() <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdc()
     * @generated
     * @ordered
     */
    protected static final Float KDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdc() <em>Kdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdc()
     * @generated
     * @ordered
     */
    protected Float kdc = KDC_EDEFAULT;

    /**
     * This is true if the Kdc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdcESet;

    /**
     * The default value of the '{@link #getKf1() <em>Kf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf1()
     * @generated
     * @ordered
     */
    protected static final Float KF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf1() <em>Kf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf1()
     * @generated
     * @ordered
     */
    protected Float kf1 = KF1_EDEFAULT;

    /**
     * This is true if the Kf1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kf1ESet;

    /**
     * The default value of the '{@link #getKf3() <em>Kf3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf3()
     * @generated
     * @ordered
     */
    protected static final Float KF3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf3() <em>Kf3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf3()
     * @generated
     * @ordered
     */
    protected Float kf3 = KF3_EDEFAULT;

    /**
     * This is true if the Kf3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kf3ESet;

    /**
     * The default value of the '{@link #getKhp() <em>Khp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKhp()
     * @generated
     * @ordered
     */
    protected static final Float KHP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKhp() <em>Khp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKhp()
     * @generated
     * @ordered
     */
    protected Float khp = KHP_EDEFAULT;

    /**
     * This is true if the Khp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean khpESet;

    /**
     * The default value of the '{@link #getKic() <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKic()
     * @generated
     * @ordered
     */
    protected static final Float KIC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKic() <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKic()
     * @generated
     * @ordered
     */
    protected Float kic = KIC_EDEFAULT;

    /**
     * This is true if the Kic attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kicESet;

    /**
     * The default value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected static final Float KIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected Float kip = KIP_EDEFAULT;

    /**
     * This is true if the Kip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kipESet;

    /**
     * The default value of the '{@link #getKit() <em>Kit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKit()
     * @generated
     * @ordered
     */
    protected static final Float KIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKit() <em>Kit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKit()
     * @generated
     * @ordered
     */
    protected Float kit = KIT_EDEFAULT;

    /**
     * This is true if the Kit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kitESet;

    /**
     * The default value of the '{@link #getKmp1() <em>Kmp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmp1()
     * @generated
     * @ordered
     */
    protected static final Float KMP1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKmp1() <em>Kmp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmp1()
     * @generated
     * @ordered
     */
    protected Float kmp1 = KMP1_EDEFAULT;

    /**
     * This is true if the Kmp1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kmp1ESet;

    /**
     * The default value of the '{@link #getKmp2() <em>Kmp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmp2()
     * @generated
     * @ordered
     */
    protected static final Float KMP2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKmp2() <em>Kmp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmp2()
     * @generated
     * @ordered
     */
    protected Float kmp2 = KMP2_EDEFAULT;

    /**
     * This is true if the Kmp2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kmp2ESet;

    /**
     * The default value of the '{@link #getKpc() <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpc()
     * @generated
     * @ordered
     */
    protected static final Float KPC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpc() <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpc()
     * @generated
     * @ordered
     */
    protected Float kpc = KPC_EDEFAULT;

    /**
     * This is true if the Kpc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpcESet;

    /**
     * The default value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected static final Float KPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected Float kpp = KPP_EDEFAULT;

    /**
     * This is true if the Kpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kppESet;

    /**
     * The default value of the '{@link #getKpt() <em>Kpt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpt()
     * @generated
     * @ordered
     */
    protected static final Float KPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpt() <em>Kpt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpt()
     * @generated
     * @ordered
     */
    protected Float kpt = KPT_EDEFAULT;

    /**
     * This is true if the Kpt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kptESet;

    /**
     * The default value of the '{@link #getKrc() <em>Krc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKrc()
     * @generated
     * @ordered
     */
    protected static final Float KRC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKrc() <em>Krc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKrc()
     * @generated
     * @ordered
     */
    protected Float krc = KRC_EDEFAULT;

    /**
     * This is true if the Krc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean krcESet;

    /**
     * The default value of the '{@link #getKsh() <em>Ksh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKsh()
     * @generated
     * @ordered
     */
    protected static final Float KSH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKsh() <em>Ksh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKsh()
     * @generated
     * @ordered
     */
    protected Float ksh = KSH_EDEFAULT;

    /**
     * This is true if the Ksh attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kshESet;

    /**
     * The default value of the '{@link #getLpi() <em>Lpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLpi()
     * @generated
     * @ordered
     */
    protected static final Float LPI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLpi() <em>Lpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLpi()
     * @generated
     * @ordered
     */
    protected Float lpi = LPI_EDEFAULT;

    /**
     * This is true if the Lpi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lpiESet;

    /**
     * The default value of the '{@link #getLps() <em>Lps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLps()
     * @generated
     * @ordered
     */
    protected static final Float LPS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLps() <em>Lps</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLps()
     * @generated
     * @ordered
     */
    protected Float lps = LPS_EDEFAULT;

    /**
     * This is true if the Lps attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lpsESet;

    /**
     * The default value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected static final Float MNEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected Float mnef = MNEF_EDEFAULT;

    /**
     * This is true if the Mnef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mnefESet;

    /**
     * The default value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected static final Float MXEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected Float mxef = MXEF_EDEFAULT;

    /**
     * This is true if the Mxef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mxefESet;

    /**
     * The default value of the '{@link #getPr1() <em>Pr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPr1()
     * @generated
     * @ordered
     */
    protected static final Float PR1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPr1() <em>Pr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPr1()
     * @generated
     * @ordered
     */
    protected Float pr1 = PR1_EDEFAULT;

    /**
     * This is true if the Pr1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pr1ESet;

    /**
     * The default value of the '{@link #getPr2() <em>Pr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPr2()
     * @generated
     * @ordered
     */
    protected static final Float PR2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPr2() <em>Pr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPr2()
     * @generated
     * @ordered
     */
    protected Float pr2 = PR2_EDEFAULT;

    /**
     * This is true if the Pr2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pr2ESet;

    /**
     * The default value of the '{@link #getPsmn() <em>Psmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPsmn()
     * @generated
     * @ordered
     */
    protected static final Float PSMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPsmn() <em>Psmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPsmn()
     * @generated
     * @ordered
     */
    protected Float psmn = PSMN_EDEFAULT;

    /**
     * This is true if the Psmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean psmnESet;

    /**
     * The default value of the '{@link #getRsmimn() <em>Rsmimn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRsmimn()
     * @generated
     * @ordered
     */
    protected static final Float RSMIMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRsmimn() <em>Rsmimn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRsmimn()
     * @generated
     * @ordered
     */
    protected Float rsmimn = RSMIMN_EDEFAULT;

    /**
     * This is true if the Rsmimn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rsmimnESet;

    /**
     * The default value of the '{@link #getRsmimx() <em>Rsmimx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRsmimx()
     * @generated
     * @ordered
     */
    protected static final Float RSMIMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRsmimx() <em>Rsmimx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRsmimx()
     * @generated
     * @ordered
     */
    protected Float rsmimx = RSMIMX_EDEFAULT;

    /**
     * This is true if the Rsmimx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rsmimxESet;

    /**
     * The default value of the '{@link #getRvgmn() <em>Rvgmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRvgmn()
     * @generated
     * @ordered
     */
    protected static final Float RVGMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRvgmn() <em>Rvgmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRvgmn()
     * @generated
     * @ordered
     */
    protected Float rvgmn = RVGMN_EDEFAULT;

    /**
     * This is true if the Rvgmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rvgmnESet;

    /**
     * The default value of the '{@link #getRvgmx() <em>Rvgmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRvgmx()
     * @generated
     * @ordered
     */
    protected static final Float RVGMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRvgmx() <em>Rvgmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRvgmx()
     * @generated
     * @ordered
     */
    protected Float rvgmx = RVGMX_EDEFAULT;

    /**
     * This is true if the Rvgmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rvgmxESet;

    /**
     * The default value of the '{@link #getSrmn() <em>Srmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrmn()
     * @generated
     * @ordered
     */
    protected static final Float SRMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrmn() <em>Srmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrmn()
     * @generated
     * @ordered
     */
    protected Float srmn = SRMN_EDEFAULT;

    /**
     * This is true if the Srmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srmnESet;

    /**
     * The default value of the '{@link #getSrmx() <em>Srmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrmx()
     * @generated
     * @ordered
     */
    protected static final Float SRMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrmx() <em>Srmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrmx()
     * @generated
     * @ordered
     */
    protected Float srmx = SRMX_EDEFAULT;

    /**
     * This is true if the Srmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srmxESet;

    /**
     * The default value of the '{@link #getSrsmp() <em>Srsmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrsmp()
     * @generated
     * @ordered
     */
    protected static final Float SRSMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrsmp() <em>Srsmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrsmp()
     * @generated
     * @ordered
     */
    protected Float srsmp = SRSMP_EDEFAULT;

    /**
     * This is true if the Srsmp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean srsmpESet;

    /**
     * The default value of the '{@link #getSvmn() <em>Svmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvmn()
     * @generated
     * @ordered
     */
    protected static final Float SVMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSvmn() <em>Svmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvmn()
     * @generated
     * @ordered
     */
    protected Float svmn = SVMN_EDEFAULT;

    /**
     * This is true if the Svmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svmnESet;

    /**
     * The default value of the '{@link #getSvmx() <em>Svmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvmx()
     * @generated
     * @ordered
     */
    protected static final Float SVMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSvmx() <em>Svmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvmx()
     * @generated
     * @ordered
     */
    protected Float svmx = SVMX_EDEFAULT;

    /**
     * This is true if the Svmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svmxESet;

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
     * The default value of the '{@link #getTam() <em>Tam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTam()
     * @generated
     * @ordered
     */
    protected static final Float TAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTam() <em>Tam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTam()
     * @generated
     * @ordered
     */
    protected Float tam = TAM_EDEFAULT;

    /**
     * This is true if the Tam attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tamESet;

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
     * The default value of the '{@link #getTcm() <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcm()
     * @generated
     * @ordered
     */
    protected static final Float TCM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTcm() <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcm()
     * @generated
     * @ordered
     */
    protected Float tcm = TCM_EDEFAULT;

    /**
     * This is true if the Tcm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcmESet;

    /**
     * The default value of the '{@link #getTdc() <em>Tdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdc()
     * @generated
     * @ordered
     */
    protected static final Float TDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdc() <em>Tdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdc()
     * @generated
     * @ordered
     */
    protected Float tdc = TDC_EDEFAULT;

    /**
     * This is true if the Tdc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdcESet;

    /**
     * The default value of the '{@link #getTf1() <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf1()
     * @generated
     * @ordered
     */
    protected static final Float TF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf1() <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf1()
     * @generated
     * @ordered
     */
    protected Float tf1 = TF1_EDEFAULT;

    /**
     * This is true if the Tf1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tf1ESet;

    /**
     * The default value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected static final Float TF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected Float tf2 = TF2_EDEFAULT;

    /**
     * This is true if the Tf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tf2ESet;

    /**
     * The default value of the '{@link #getThp() <em>Thp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThp()
     * @generated
     * @ordered
     */
    protected static final Float THP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThp() <em>Thp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThp()
     * @generated
     * @ordered
     */
    protected Float thp = THP_EDEFAULT;

    /**
     * This is true if the Thp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thpESet;

    /**
     * The default value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmp()
     * @generated
     * @ordered
     */
    protected static final Float TMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTmp()
     * @generated
     * @ordered
     */
    protected Float tmp = TMP_EDEFAULT;

    /**
     * This is true if the Tmp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tmpESet;

    /**
     * The default value of the '{@link #getTrh() <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrh()
     * @generated
     * @ordered
     */
    protected static final Float TRH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrh() <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrh()
     * @generated
     * @ordered
     */
    protected Float trh = TRH_EDEFAULT;

    /**
     * This is true if the Trh attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trhESet;

    /**
     * The default value of the '{@link #getTv() <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTv()
     * @generated
     * @ordered
     */
    protected static final Float TV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTv() <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTv()
     * @generated
     * @ordered
     */
    protected Float tv = TV_EDEFAULT;

    /**
     * This is true if the Tv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tvESet;

    /**
     * The default value of the '{@link #getTy() <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTy()
     * @generated
     * @ordered
     */
    protected static final Float TY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTy() <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTy()
     * @generated
     * @ordered
     */
    protected Float ty = TY_EDEFAULT;

    /**
     * This is true if the Ty attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tyESet;

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
     * The default value of the '{@link #getYhpmn() <em>Yhpmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYhpmn()
     * @generated
     * @ordered
     */
    protected static final Float YHPMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYhpmn() <em>Yhpmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYhpmn()
     * @generated
     * @ordered
     */
    protected Float yhpmn = YHPMN_EDEFAULT;

    /**
     * This is true if the Yhpmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean yhpmnESet;

    /**
     * The default value of the '{@link #getYhpmx() <em>Yhpmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYhpmx()
     * @generated
     * @ordered
     */
    protected static final Float YHPMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYhpmx() <em>Yhpmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYhpmx()
     * @generated
     * @ordered
     */
    protected Float yhpmx = YHPMX_EDEFAULT;

    /**
     * This is true if the Yhpmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean yhpmxESet;

    /**
     * The default value of the '{@link #getYmpmn() <em>Ympmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYmpmn()
     * @generated
     * @ordered
     */
    protected static final Float YMPMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYmpmn() <em>Ympmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYmpmn()
     * @generated
     * @ordered
     */
    protected Float ympmn = YMPMN_EDEFAULT;

    /**
     * This is true if the Ympmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ympmnESet;

    /**
     * The default value of the '{@link #getYmpmx() <em>Ympmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYmpmx()
     * @generated
     * @ordered
     */
    protected static final Float YMPMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYmpmx() <em>Ympmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYmpmx()
     * @generated
     * @ordered
     */
    protected Float ympmx = YMPMX_EDEFAULT;

    /**
     * This is true if the Ympmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ympmxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovSteamFV4Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovSteamFV4();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCpsmn() {
        return cpsmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCpsmn( Float newCpsmn ) {
        Float oldCpsmn = cpsmn;
        cpsmn = newCpsmn;
        boolean oldCpsmnESet = cpsmnESet;
        cpsmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__CPSMN, oldCpsmn, cpsmn, !oldCpsmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCpsmn() {
        Float oldCpsmn = cpsmn;
        boolean oldCpsmnESet = cpsmnESet;
        cpsmn = CPSMN_EDEFAULT;
        cpsmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__CPSMN, oldCpsmn, CPSMN_EDEFAULT, oldCpsmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCpsmn() {
        return cpsmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCpsmx() {
        return cpsmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCpsmx( Float newCpsmx ) {
        Float oldCpsmx = cpsmx;
        cpsmx = newCpsmx;
        boolean oldCpsmxESet = cpsmxESet;
        cpsmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__CPSMX, oldCpsmx, cpsmx, !oldCpsmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCpsmx() {
        Float oldCpsmx = cpsmx;
        boolean oldCpsmxESet = cpsmxESet;
        cpsmx = CPSMX_EDEFAULT;
        cpsmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__CPSMX, oldCpsmx, CPSMX_EDEFAULT, oldCpsmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCpsmx() {
        return cpsmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCrmn() {
        return crmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCrmn( Float newCrmn ) {
        Float oldCrmn = crmn;
        crmn = newCrmn;
        boolean oldCrmnESet = crmnESet;
        crmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__CRMN, oldCrmn, crmn, !oldCrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCrmn() {
        Float oldCrmn = crmn;
        boolean oldCrmnESet = crmnESet;
        crmn = CRMN_EDEFAULT;
        crmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__CRMN, oldCrmn, CRMN_EDEFAULT, oldCrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrmn() {
        return crmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCrmx() {
        return crmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCrmx( Float newCrmx ) {
        Float oldCrmx = crmx;
        crmx = newCrmx;
        boolean oldCrmxESet = crmxESet;
        crmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__CRMX, oldCrmx, crmx, !oldCrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCrmx() {
        Float oldCrmx = crmx;
        boolean oldCrmxESet = crmxESet;
        crmx = CRMX_EDEFAULT;
        crmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__CRMX, oldCrmx, CRMX_EDEFAULT, oldCrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrmx() {
        return crmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKdc() {
        return kdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdc( Float newKdc ) {
        Float oldKdc = kdc;
        kdc = newKdc;
        boolean oldKdcESet = kdcESet;
        kdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KDC, oldKdc, kdc, !oldKdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdc() {
        Float oldKdc = kdc;
        boolean oldKdcESet = kdcESet;
        kdc = KDC_EDEFAULT;
        kdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KDC, oldKdc, KDC_EDEFAULT, oldKdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdc() {
        return kdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKf1() {
        return kf1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf1( Float newKf1 ) {
        Float oldKf1 = kf1;
        kf1 = newKf1;
        boolean oldKf1ESet = kf1ESet;
        kf1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KF1, oldKf1, kf1, !oldKf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf1() {
        Float oldKf1 = kf1;
        boolean oldKf1ESet = kf1ESet;
        kf1 = KF1_EDEFAULT;
        kf1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KF1, oldKf1, KF1_EDEFAULT, oldKf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf1() {
        return kf1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKf3() {
        return kf3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf3( Float newKf3 ) {
        Float oldKf3 = kf3;
        kf3 = newKf3;
        boolean oldKf3ESet = kf3ESet;
        kf3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KF3, oldKf3, kf3, !oldKf3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf3() {
        Float oldKf3 = kf3;
        boolean oldKf3ESet = kf3ESet;
        kf3 = KF3_EDEFAULT;
        kf3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KF3, oldKf3, KF3_EDEFAULT, oldKf3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf3() {
        return kf3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKhp() {
        return khp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKhp( Float newKhp ) {
        Float oldKhp = khp;
        khp = newKhp;
        boolean oldKhpESet = khpESet;
        khpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KHP, oldKhp, khp, !oldKhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKhp() {
        Float oldKhp = khp;
        boolean oldKhpESet = khpESet;
        khp = KHP_EDEFAULT;
        khpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KHP, oldKhp, KHP_EDEFAULT, oldKhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKhp() {
        return khpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKic() {
        return kic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKic( Float newKic ) {
        Float oldKic = kic;
        kic = newKic;
        boolean oldKicESet = kicESet;
        kicESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KIC, oldKic, kic, !oldKicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKic() {
        Float oldKic = kic;
        boolean oldKicESet = kicESet;
        kic = KIC_EDEFAULT;
        kicESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KIC, oldKic, KIC_EDEFAULT, oldKicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKic() {
        return kicESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKip() {
        return kip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKip( Float newKip ) {
        Float oldKip = kip;
        kip = newKip;
        boolean oldKipESet = kipESet;
        kipESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KIP, oldKip, kip, !oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKip() {
        Float oldKip = kip;
        boolean oldKipESet = kipESet;
        kip = KIP_EDEFAULT;
        kipESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KIP, oldKip, KIP_EDEFAULT, oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKip() {
        return kipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKit() {
        return kit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKit( Float newKit ) {
        Float oldKit = kit;
        kit = newKit;
        boolean oldKitESet = kitESet;
        kitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KIT, oldKit, kit, !oldKitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKit() {
        Float oldKit = kit;
        boolean oldKitESet = kitESet;
        kit = KIT_EDEFAULT;
        kitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KIT, oldKit, KIT_EDEFAULT, oldKitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKit() {
        return kitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKmp1() {
        return kmp1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKmp1( Float newKmp1 ) {
        Float oldKmp1 = kmp1;
        kmp1 = newKmp1;
        boolean oldKmp1ESet = kmp1ESet;
        kmp1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KMP1, oldKmp1, kmp1, !oldKmp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKmp1() {
        Float oldKmp1 = kmp1;
        boolean oldKmp1ESet = kmp1ESet;
        kmp1 = KMP1_EDEFAULT;
        kmp1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KMP1, oldKmp1, KMP1_EDEFAULT, oldKmp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKmp1() {
        return kmp1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKmp2() {
        return kmp2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKmp2( Float newKmp2 ) {
        Float oldKmp2 = kmp2;
        kmp2 = newKmp2;
        boolean oldKmp2ESet = kmp2ESet;
        kmp2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KMP2, oldKmp2, kmp2, !oldKmp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKmp2() {
        Float oldKmp2 = kmp2;
        boolean oldKmp2ESet = kmp2ESet;
        kmp2 = KMP2_EDEFAULT;
        kmp2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KMP2, oldKmp2, KMP2_EDEFAULT, oldKmp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKmp2() {
        return kmp2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpc() {
        return kpc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpc( Float newKpc ) {
        Float oldKpc = kpc;
        kpc = newKpc;
        boolean oldKpcESet = kpcESet;
        kpcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KPC, oldKpc, kpc, !oldKpcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpc() {
        Float oldKpc = kpc;
        boolean oldKpcESet = kpcESet;
        kpc = KPC_EDEFAULT;
        kpcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KPC, oldKpc, KPC_EDEFAULT, oldKpcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpc() {
        return kpcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpp() {
        return kpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpp( Float newKpp ) {
        Float oldKpp = kpp;
        kpp = newKpp;
        boolean oldKppESet = kppESet;
        kppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KPP, oldKpp, kpp, !oldKppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpp() {
        Float oldKpp = kpp;
        boolean oldKppESet = kppESet;
        kpp = KPP_EDEFAULT;
        kppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KPP, oldKpp, KPP_EDEFAULT, oldKppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpp() {
        return kppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpt() {
        return kpt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpt( Float newKpt ) {
        Float oldKpt = kpt;
        kpt = newKpt;
        boolean oldKptESet = kptESet;
        kptESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KPT, oldKpt, kpt, !oldKptESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpt() {
        Float oldKpt = kpt;
        boolean oldKptESet = kptESet;
        kpt = KPT_EDEFAULT;
        kptESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KPT, oldKpt, KPT_EDEFAULT, oldKptESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpt() {
        return kptESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKrc() {
        return krc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKrc( Float newKrc ) {
        Float oldKrc = krc;
        krc = newKrc;
        boolean oldKrcESet = krcESet;
        krcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KRC, oldKrc, krc, !oldKrcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKrc() {
        Float oldKrc = krc;
        boolean oldKrcESet = krcESet;
        krc = KRC_EDEFAULT;
        krcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KRC, oldKrc, KRC_EDEFAULT, oldKrcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKrc() {
        return krcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKsh() {
        return ksh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKsh( Float newKsh ) {
        Float oldKsh = ksh;
        ksh = newKsh;
        boolean oldKshESet = kshESet;
        kshESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__KSH, oldKsh, ksh, !oldKshESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKsh() {
        Float oldKsh = ksh;
        boolean oldKshESet = kshESet;
        ksh = KSH_EDEFAULT;
        kshESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__KSH, oldKsh, KSH_EDEFAULT, oldKshESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKsh() {
        return kshESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLpi() {
        return lpi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLpi( Float newLpi ) {
        Float oldLpi = lpi;
        lpi = newLpi;
        boolean oldLpiESet = lpiESet;
        lpiESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__LPI, oldLpi, lpi, !oldLpiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLpi() {
        Float oldLpi = lpi;
        boolean oldLpiESet = lpiESet;
        lpi = LPI_EDEFAULT;
        lpiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__LPI, oldLpi, LPI_EDEFAULT, oldLpiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLpi() {
        return lpiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLps() {
        return lps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLps( Float newLps ) {
        Float oldLps = lps;
        lps = newLps;
        boolean oldLpsESet = lpsESet;
        lpsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__LPS, oldLps, lps, !oldLpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLps() {
        Float oldLps = lps;
        boolean oldLpsESet = lpsESet;
        lps = LPS_EDEFAULT;
        lpsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__LPS, oldLps, LPS_EDEFAULT, oldLpsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLps() {
        return lpsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMnef() {
        return mnef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMnef( Float newMnef ) {
        Float oldMnef = mnef;
        mnef = newMnef;
        boolean oldMnefESet = mnefESet;
        mnefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__MNEF, oldMnef, mnef, !oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMnef() {
        Float oldMnef = mnef;
        boolean oldMnefESet = mnefESet;
        mnef = MNEF_EDEFAULT;
        mnefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__MNEF, oldMnef, MNEF_EDEFAULT, oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMnef() {
        return mnefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMxef() {
        return mxef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMxef( Float newMxef ) {
        Float oldMxef = mxef;
        mxef = newMxef;
        boolean oldMxefESet = mxefESet;
        mxefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__MXEF, oldMxef, mxef, !oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMxef() {
        Float oldMxef = mxef;
        boolean oldMxefESet = mxefESet;
        mxef = MXEF_EDEFAULT;
        mxefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__MXEF, oldMxef, MXEF_EDEFAULT, oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMxef() {
        return mxefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPr1() {
        return pr1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPr1( Float newPr1 ) {
        Float oldPr1 = pr1;
        pr1 = newPr1;
        boolean oldPr1ESet = pr1ESet;
        pr1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__PR1, oldPr1, pr1, !oldPr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPr1() {
        Float oldPr1 = pr1;
        boolean oldPr1ESet = pr1ESet;
        pr1 = PR1_EDEFAULT;
        pr1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__PR1, oldPr1, PR1_EDEFAULT, oldPr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPr1() {
        return pr1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPr2() {
        return pr2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPr2( Float newPr2 ) {
        Float oldPr2 = pr2;
        pr2 = newPr2;
        boolean oldPr2ESet = pr2ESet;
        pr2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__PR2, oldPr2, pr2, !oldPr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPr2() {
        Float oldPr2 = pr2;
        boolean oldPr2ESet = pr2ESet;
        pr2 = PR2_EDEFAULT;
        pr2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__PR2, oldPr2, PR2_EDEFAULT, oldPr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPr2() {
        return pr2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPsmn() {
        return psmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPsmn( Float newPsmn ) {
        Float oldPsmn = psmn;
        psmn = newPsmn;
        boolean oldPsmnESet = psmnESet;
        psmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__PSMN, oldPsmn, psmn, !oldPsmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPsmn() {
        Float oldPsmn = psmn;
        boolean oldPsmnESet = psmnESet;
        psmn = PSMN_EDEFAULT;
        psmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__PSMN, oldPsmn, PSMN_EDEFAULT, oldPsmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPsmn() {
        return psmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRsmimn() {
        return rsmimn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRsmimn( Float newRsmimn ) {
        Float oldRsmimn = rsmimn;
        rsmimn = newRsmimn;
        boolean oldRsmimnESet = rsmimnESet;
        rsmimnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__RSMIMN, oldRsmimn, rsmimn, !oldRsmimnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRsmimn() {
        Float oldRsmimn = rsmimn;
        boolean oldRsmimnESet = rsmimnESet;
        rsmimn = RSMIMN_EDEFAULT;
        rsmimnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__RSMIMN, oldRsmimn, RSMIMN_EDEFAULT, oldRsmimnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRsmimn() {
        return rsmimnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRsmimx() {
        return rsmimx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRsmimx( Float newRsmimx ) {
        Float oldRsmimx = rsmimx;
        rsmimx = newRsmimx;
        boolean oldRsmimxESet = rsmimxESet;
        rsmimxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__RSMIMX, oldRsmimx, rsmimx, !oldRsmimxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRsmimx() {
        Float oldRsmimx = rsmimx;
        boolean oldRsmimxESet = rsmimxESet;
        rsmimx = RSMIMX_EDEFAULT;
        rsmimxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__RSMIMX, oldRsmimx, RSMIMX_EDEFAULT, oldRsmimxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRsmimx() {
        return rsmimxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRvgmn() {
        return rvgmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRvgmn( Float newRvgmn ) {
        Float oldRvgmn = rvgmn;
        rvgmn = newRvgmn;
        boolean oldRvgmnESet = rvgmnESet;
        rvgmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__RVGMN, oldRvgmn, rvgmn, !oldRvgmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRvgmn() {
        Float oldRvgmn = rvgmn;
        boolean oldRvgmnESet = rvgmnESet;
        rvgmn = RVGMN_EDEFAULT;
        rvgmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__RVGMN, oldRvgmn, RVGMN_EDEFAULT, oldRvgmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRvgmn() {
        return rvgmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRvgmx() {
        return rvgmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRvgmx( Float newRvgmx ) {
        Float oldRvgmx = rvgmx;
        rvgmx = newRvgmx;
        boolean oldRvgmxESet = rvgmxESet;
        rvgmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__RVGMX, oldRvgmx, rvgmx, !oldRvgmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRvgmx() {
        Float oldRvgmx = rvgmx;
        boolean oldRvgmxESet = rvgmxESet;
        rvgmx = RVGMX_EDEFAULT;
        rvgmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__RVGMX, oldRvgmx, RVGMX_EDEFAULT, oldRvgmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRvgmx() {
        return rvgmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSrmn() {
        return srmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrmn( Float newSrmn ) {
        Float oldSrmn = srmn;
        srmn = newSrmn;
        boolean oldSrmnESet = srmnESet;
        srmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__SRMN, oldSrmn, srmn, !oldSrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrmn() {
        Float oldSrmn = srmn;
        boolean oldSrmnESet = srmnESet;
        srmn = SRMN_EDEFAULT;
        srmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__SRMN, oldSrmn, SRMN_EDEFAULT, oldSrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrmn() {
        return srmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSrmx() {
        return srmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrmx( Float newSrmx ) {
        Float oldSrmx = srmx;
        srmx = newSrmx;
        boolean oldSrmxESet = srmxESet;
        srmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__SRMX, oldSrmx, srmx, !oldSrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrmx() {
        Float oldSrmx = srmx;
        boolean oldSrmxESet = srmxESet;
        srmx = SRMX_EDEFAULT;
        srmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__SRMX, oldSrmx, SRMX_EDEFAULT, oldSrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrmx() {
        return srmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSrsmp() {
        return srsmp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSrsmp( Float newSrsmp ) {
        Float oldSrsmp = srsmp;
        srsmp = newSrsmp;
        boolean oldSrsmpESet = srsmpESet;
        srsmpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__SRSMP, oldSrsmp, srsmp, !oldSrsmpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSrsmp() {
        Float oldSrsmp = srsmp;
        boolean oldSrsmpESet = srsmpESet;
        srsmp = SRSMP_EDEFAULT;
        srsmpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__SRSMP, oldSrsmp, SRSMP_EDEFAULT, oldSrsmpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSrsmp() {
        return srsmpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSvmn() {
        return svmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSvmn( Float newSvmn ) {
        Float oldSvmn = svmn;
        svmn = newSvmn;
        boolean oldSvmnESet = svmnESet;
        svmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__SVMN, oldSvmn, svmn, !oldSvmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvmn() {
        Float oldSvmn = svmn;
        boolean oldSvmnESet = svmnESet;
        svmn = SVMN_EDEFAULT;
        svmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__SVMN, oldSvmn, SVMN_EDEFAULT, oldSvmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvmn() {
        return svmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSvmx() {
        return svmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSvmx( Float newSvmx ) {
        Float oldSvmx = svmx;
        svmx = newSvmx;
        boolean oldSvmxESet = svmxESet;
        svmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__SVMX, oldSvmx, svmx, !oldSvmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvmx() {
        Float oldSvmx = svmx;
        boolean oldSvmxESet = svmxESet;
        svmx = SVMX_EDEFAULT;
        svmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__SVMX, oldSvmx, SVMX_EDEFAULT, oldSvmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvmx() {
        return svmxESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_FV4__TA, oldTa, ta, !oldTaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TA, oldTa, TA_EDEFAULT, oldTaESet ) );
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
    public Float getTam() {
        return tam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTam( Float newTam ) {
        Float oldTam = tam;
        tam = newTam;
        boolean oldTamESet = tamESet;
        tamESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__TAM, oldTam, tam, !oldTamESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTam() {
        Float oldTam = tam;
        boolean oldTamESet = tamESet;
        tam = TAM_EDEFAULT;
        tamESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TAM, oldTam, TAM_EDEFAULT, oldTamESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTam() {
        return tamESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_FV4__TC, oldTc, tc, !oldTcESet ) );
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
                CimPackage.GOV_STEAM_FV4__TC, oldTc, TC_EDEFAULT, oldTcESet ) );
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
    public Float getTcm() {
        return tcm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTcm( Float newTcm ) {
        Float oldTcm = tcm;
        tcm = newTcm;
        boolean oldTcmESet = tcmESet;
        tcmESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__TCM, oldTcm, tcm, !oldTcmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTcm() {
        Float oldTcm = tcm;
        boolean oldTcmESet = tcmESet;
        tcm = TCM_EDEFAULT;
        tcmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TCM, oldTcm, TCM_EDEFAULT, oldTcmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTcm() {
        return tcmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTdc() {
        return tdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdc( Float newTdc ) {
        Float oldTdc = tdc;
        tdc = newTdc;
        boolean oldTdcESet = tdcESet;
        tdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__TDC, oldTdc, tdc, !oldTdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdc() {
        Float oldTdc = tdc;
        boolean oldTdcESet = tdcESet;
        tdc = TDC_EDEFAULT;
        tdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TDC, oldTdc, TDC_EDEFAULT, oldTdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdc() {
        return tdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTf1() {
        return tf1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf1( Float newTf1 ) {
        Float oldTf1 = tf1;
        tf1 = newTf1;
        boolean oldTf1ESet = tf1ESet;
        tf1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__TF1, oldTf1, tf1, !oldTf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf1() {
        Float oldTf1 = tf1;
        boolean oldTf1ESet = tf1ESet;
        tf1 = TF1_EDEFAULT;
        tf1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TF1, oldTf1, TF1_EDEFAULT, oldTf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf1() {
        return tf1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTf2() {
        return tf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf2( Float newTf2 ) {
        Float oldTf2 = tf2;
        tf2 = newTf2;
        boolean oldTf2ESet = tf2ESet;
        tf2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__TF2, oldTf2, tf2, !oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf2() {
        Float oldTf2 = tf2;
        boolean oldTf2ESet = tf2ESet;
        tf2 = TF2_EDEFAULT;
        tf2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TF2, oldTf2, TF2_EDEFAULT, oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf2() {
        return tf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThp() {
        return thp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThp( Float newThp ) {
        Float oldThp = thp;
        thp = newThp;
        boolean oldThpESet = thpESet;
        thpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__THP, oldThp, thp, !oldThpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThp() {
        Float oldThp = thp;
        boolean oldThpESet = thpESet;
        thp = THP_EDEFAULT;
        thpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__THP, oldThp, THP_EDEFAULT, oldThpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThp() {
        return thpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTmp() {
        return tmp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTmp( Float newTmp ) {
        Float oldTmp = tmp;
        tmp = newTmp;
        boolean oldTmpESet = tmpESet;
        tmpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__TMP, oldTmp, tmp, !oldTmpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTmp() {
        Float oldTmp = tmp;
        boolean oldTmpESet = tmpESet;
        tmp = TMP_EDEFAULT;
        tmpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TMP, oldTmp, TMP_EDEFAULT, oldTmpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTmp() {
        return tmpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTrh() {
        return trh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTrh( Float newTrh ) {
        Float oldTrh = trh;
        trh = newTrh;
        boolean oldTrhESet = trhESet;
        trhESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__TRH, oldTrh, trh, !oldTrhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTrh() {
        Float oldTrh = trh;
        boolean oldTrhESet = trhESet;
        trh = TRH_EDEFAULT;
        trhESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TRH, oldTrh, TRH_EDEFAULT, oldTrhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTrh() {
        return trhESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTv() {
        return tv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTv( Float newTv ) {
        Float oldTv = tv;
        tv = newTv;
        boolean oldTvESet = tvESet;
        tvESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_FV4__TV, oldTv, tv, !oldTvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTv() {
        Float oldTv = tv;
        boolean oldTvESet = tvESet;
        tv = TV_EDEFAULT;
        tvESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TV, oldTv, TV_EDEFAULT, oldTvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTv() {
        return tvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTy() {
        return ty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTy( Float newTy ) {
        Float oldTy = ty;
        ty = newTy;
        boolean oldTyESet = tyESet;
        tyESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_FV4__TY, oldTy, ty, !oldTyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTy() {
        Float oldTy = ty;
        boolean oldTyESet = tyESet;
        ty = TY_EDEFAULT;
        tyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__TY, oldTy, TY_EDEFAULT, oldTyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTy() {
        return tyESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_FV4__Y, oldY, y, !oldYESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__Y, oldY, Y_EDEFAULT, oldYESet ) );
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
    public Float getYhpmn() {
        return yhpmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYhpmn( Float newYhpmn ) {
        Float oldYhpmn = yhpmn;
        yhpmn = newYhpmn;
        boolean oldYhpmnESet = yhpmnESet;
        yhpmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__YHPMN, oldYhpmn, yhpmn, !oldYhpmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYhpmn() {
        Float oldYhpmn = yhpmn;
        boolean oldYhpmnESet = yhpmnESet;
        yhpmn = YHPMN_EDEFAULT;
        yhpmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__YHPMN, oldYhpmn, YHPMN_EDEFAULT, oldYhpmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYhpmn() {
        return yhpmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getYhpmx() {
        return yhpmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYhpmx( Float newYhpmx ) {
        Float oldYhpmx = yhpmx;
        yhpmx = newYhpmx;
        boolean oldYhpmxESet = yhpmxESet;
        yhpmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__YHPMX, oldYhpmx, yhpmx, !oldYhpmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYhpmx() {
        Float oldYhpmx = yhpmx;
        boolean oldYhpmxESet = yhpmxESet;
        yhpmx = YHPMX_EDEFAULT;
        yhpmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__YHPMX, oldYhpmx, YHPMX_EDEFAULT, oldYhpmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYhpmx() {
        return yhpmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getYmpmn() {
        return ympmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYmpmn( Float newYmpmn ) {
        Float oldYmpmn = ympmn;
        ympmn = newYmpmn;
        boolean oldYmpmnESet = ympmnESet;
        ympmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__YMPMN, oldYmpmn, ympmn, !oldYmpmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYmpmn() {
        Float oldYmpmn = ympmn;
        boolean oldYmpmnESet = ympmnESet;
        ympmn = YMPMN_EDEFAULT;
        ympmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__YMPMN, oldYmpmn, YMPMN_EDEFAULT, oldYmpmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYmpmn() {
        return ympmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getYmpmx() {
        return ympmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYmpmx( Float newYmpmx ) {
        Float oldYmpmx = ympmx;
        ympmx = newYmpmx;
        boolean oldYmpmxESet = ympmxESet;
        ympmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_STEAM_FV4__YMPMX, oldYmpmx, ympmx, !oldYmpmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYmpmx() {
        Float oldYmpmx = ympmx;
        boolean oldYmpmxESet = ympmxESet;
        ympmx = YMPMX_EDEFAULT;
        ympmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_STEAM_FV4__YMPMX, oldYmpmx, YMPMX_EDEFAULT, oldYmpmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYmpmx() {
        return ympmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_STEAM_FV4__CPSMN:
            return getCpsmn();
        case CimPackage.GOV_STEAM_FV4__CPSMX:
            return getCpsmx();
        case CimPackage.GOV_STEAM_FV4__CRMN:
            return getCrmn();
        case CimPackage.GOV_STEAM_FV4__CRMX:
            return getCrmx();
        case CimPackage.GOV_STEAM_FV4__KDC:
            return getKdc();
        case CimPackage.GOV_STEAM_FV4__KF1:
            return getKf1();
        case CimPackage.GOV_STEAM_FV4__KF3:
            return getKf3();
        case CimPackage.GOV_STEAM_FV4__KHP:
            return getKhp();
        case CimPackage.GOV_STEAM_FV4__KIC:
            return getKic();
        case CimPackage.GOV_STEAM_FV4__KIP:
            return getKip();
        case CimPackage.GOV_STEAM_FV4__KIT:
            return getKit();
        case CimPackage.GOV_STEAM_FV4__KMP1:
            return getKmp1();
        case CimPackage.GOV_STEAM_FV4__KMP2:
            return getKmp2();
        case CimPackage.GOV_STEAM_FV4__KPC:
            return getKpc();
        case CimPackage.GOV_STEAM_FV4__KPP:
            return getKpp();
        case CimPackage.GOV_STEAM_FV4__KPT:
            return getKpt();
        case CimPackage.GOV_STEAM_FV4__KRC:
            return getKrc();
        case CimPackage.GOV_STEAM_FV4__KSH:
            return getKsh();
        case CimPackage.GOV_STEAM_FV4__LPI:
            return getLpi();
        case CimPackage.GOV_STEAM_FV4__LPS:
            return getLps();
        case CimPackage.GOV_STEAM_FV4__MNEF:
            return getMnef();
        case CimPackage.GOV_STEAM_FV4__MXEF:
            return getMxef();
        case CimPackage.GOV_STEAM_FV4__PR1:
            return getPr1();
        case CimPackage.GOV_STEAM_FV4__PR2:
            return getPr2();
        case CimPackage.GOV_STEAM_FV4__PSMN:
            return getPsmn();
        case CimPackage.GOV_STEAM_FV4__RSMIMN:
            return getRsmimn();
        case CimPackage.GOV_STEAM_FV4__RSMIMX:
            return getRsmimx();
        case CimPackage.GOV_STEAM_FV4__RVGMN:
            return getRvgmn();
        case CimPackage.GOV_STEAM_FV4__RVGMX:
            return getRvgmx();
        case CimPackage.GOV_STEAM_FV4__SRMN:
            return getSrmn();
        case CimPackage.GOV_STEAM_FV4__SRMX:
            return getSrmx();
        case CimPackage.GOV_STEAM_FV4__SRSMP:
            return getSrsmp();
        case CimPackage.GOV_STEAM_FV4__SVMN:
            return getSvmn();
        case CimPackage.GOV_STEAM_FV4__SVMX:
            return getSvmx();
        case CimPackage.GOV_STEAM_FV4__TA:
            return getTa();
        case CimPackage.GOV_STEAM_FV4__TAM:
            return getTam();
        case CimPackage.GOV_STEAM_FV4__TC:
            return getTc();
        case CimPackage.GOV_STEAM_FV4__TCM:
            return getTcm();
        case CimPackage.GOV_STEAM_FV4__TDC:
            return getTdc();
        case CimPackage.GOV_STEAM_FV4__TF1:
            return getTf1();
        case CimPackage.GOV_STEAM_FV4__TF2:
            return getTf2();
        case CimPackage.GOV_STEAM_FV4__THP:
            return getThp();
        case CimPackage.GOV_STEAM_FV4__TMP:
            return getTmp();
        case CimPackage.GOV_STEAM_FV4__TRH:
            return getTrh();
        case CimPackage.GOV_STEAM_FV4__TV:
            return getTv();
        case CimPackage.GOV_STEAM_FV4__TY:
            return getTy();
        case CimPackage.GOV_STEAM_FV4__Y:
            return getY();
        case CimPackage.GOV_STEAM_FV4__YHPMN:
            return getYhpmn();
        case CimPackage.GOV_STEAM_FV4__YHPMX:
            return getYhpmx();
        case CimPackage.GOV_STEAM_FV4__YMPMN:
            return getYmpmn();
        case CimPackage.GOV_STEAM_FV4__YMPMX:
            return getYmpmx();
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
        case CimPackage.GOV_STEAM_FV4__CPSMN:
            setCpsmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__CPSMX:
            setCpsmx( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__CRMN:
            setCrmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__CRMX:
            setCrmx( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KDC:
            setKdc( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KF1:
            setKf1( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KF3:
            setKf3( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KHP:
            setKhp( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KIC:
            setKic( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KIP:
            setKip( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KIT:
            setKit( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KMP1:
            setKmp1( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KMP2:
            setKmp2( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KPC:
            setKpc( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KPP:
            setKpp( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KPT:
            setKpt( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KRC:
            setKrc( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__KSH:
            setKsh( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__LPI:
            setLpi( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__LPS:
            setLps( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__MNEF:
            setMnef( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__MXEF:
            setMxef( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__PR1:
            setPr1( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__PR2:
            setPr2( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__PSMN:
            setPsmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__RSMIMN:
            setRsmimn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__RSMIMX:
            setRsmimx( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__RVGMN:
            setRvgmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__RVGMX:
            setRvgmx( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__SRMN:
            setSrmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__SRMX:
            setSrmx( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__SRSMP:
            setSrsmp( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__SVMN:
            setSvmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__SVMX:
            setSvmx( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TAM:
            setTam( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TCM:
            setTcm( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TDC:
            setTdc( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TF1:
            setTf1( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TF2:
            setTf2( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__THP:
            setThp( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TMP:
            setTmp( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TRH:
            setTrh( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TV:
            setTv( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__TY:
            setTy( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__Y:
            setY( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__YHPMN:
            setYhpmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__YHPMX:
            setYhpmx( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__YMPMN:
            setYmpmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_STEAM_FV4__YMPMX:
            setYmpmx( ( Float ) newValue );
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
        case CimPackage.GOV_STEAM_FV4__CPSMN:
            unsetCpsmn();
            return;
        case CimPackage.GOV_STEAM_FV4__CPSMX:
            unsetCpsmx();
            return;
        case CimPackage.GOV_STEAM_FV4__CRMN:
            unsetCrmn();
            return;
        case CimPackage.GOV_STEAM_FV4__CRMX:
            unsetCrmx();
            return;
        case CimPackage.GOV_STEAM_FV4__KDC:
            unsetKdc();
            return;
        case CimPackage.GOV_STEAM_FV4__KF1:
            unsetKf1();
            return;
        case CimPackage.GOV_STEAM_FV4__KF3:
            unsetKf3();
            return;
        case CimPackage.GOV_STEAM_FV4__KHP:
            unsetKhp();
            return;
        case CimPackage.GOV_STEAM_FV4__KIC:
            unsetKic();
            return;
        case CimPackage.GOV_STEAM_FV4__KIP:
            unsetKip();
            return;
        case CimPackage.GOV_STEAM_FV4__KIT:
            unsetKit();
            return;
        case CimPackage.GOV_STEAM_FV4__KMP1:
            unsetKmp1();
            return;
        case CimPackage.GOV_STEAM_FV4__KMP2:
            unsetKmp2();
            return;
        case CimPackage.GOV_STEAM_FV4__KPC:
            unsetKpc();
            return;
        case CimPackage.GOV_STEAM_FV4__KPP:
            unsetKpp();
            return;
        case CimPackage.GOV_STEAM_FV4__KPT:
            unsetKpt();
            return;
        case CimPackage.GOV_STEAM_FV4__KRC:
            unsetKrc();
            return;
        case CimPackage.GOV_STEAM_FV4__KSH:
            unsetKsh();
            return;
        case CimPackage.GOV_STEAM_FV4__LPI:
            unsetLpi();
            return;
        case CimPackage.GOV_STEAM_FV4__LPS:
            unsetLps();
            return;
        case CimPackage.GOV_STEAM_FV4__MNEF:
            unsetMnef();
            return;
        case CimPackage.GOV_STEAM_FV4__MXEF:
            unsetMxef();
            return;
        case CimPackage.GOV_STEAM_FV4__PR1:
            unsetPr1();
            return;
        case CimPackage.GOV_STEAM_FV4__PR2:
            unsetPr2();
            return;
        case CimPackage.GOV_STEAM_FV4__PSMN:
            unsetPsmn();
            return;
        case CimPackage.GOV_STEAM_FV4__RSMIMN:
            unsetRsmimn();
            return;
        case CimPackage.GOV_STEAM_FV4__RSMIMX:
            unsetRsmimx();
            return;
        case CimPackage.GOV_STEAM_FV4__RVGMN:
            unsetRvgmn();
            return;
        case CimPackage.GOV_STEAM_FV4__RVGMX:
            unsetRvgmx();
            return;
        case CimPackage.GOV_STEAM_FV4__SRMN:
            unsetSrmn();
            return;
        case CimPackage.GOV_STEAM_FV4__SRMX:
            unsetSrmx();
            return;
        case CimPackage.GOV_STEAM_FV4__SRSMP:
            unsetSrsmp();
            return;
        case CimPackage.GOV_STEAM_FV4__SVMN:
            unsetSvmn();
            return;
        case CimPackage.GOV_STEAM_FV4__SVMX:
            unsetSvmx();
            return;
        case CimPackage.GOV_STEAM_FV4__TA:
            unsetTa();
            return;
        case CimPackage.GOV_STEAM_FV4__TAM:
            unsetTam();
            return;
        case CimPackage.GOV_STEAM_FV4__TC:
            unsetTc();
            return;
        case CimPackage.GOV_STEAM_FV4__TCM:
            unsetTcm();
            return;
        case CimPackage.GOV_STEAM_FV4__TDC:
            unsetTdc();
            return;
        case CimPackage.GOV_STEAM_FV4__TF1:
            unsetTf1();
            return;
        case CimPackage.GOV_STEAM_FV4__TF2:
            unsetTf2();
            return;
        case CimPackage.GOV_STEAM_FV4__THP:
            unsetThp();
            return;
        case CimPackage.GOV_STEAM_FV4__TMP:
            unsetTmp();
            return;
        case CimPackage.GOV_STEAM_FV4__TRH:
            unsetTrh();
            return;
        case CimPackage.GOV_STEAM_FV4__TV:
            unsetTv();
            return;
        case CimPackage.GOV_STEAM_FV4__TY:
            unsetTy();
            return;
        case CimPackage.GOV_STEAM_FV4__Y:
            unsetY();
            return;
        case CimPackage.GOV_STEAM_FV4__YHPMN:
            unsetYhpmn();
            return;
        case CimPackage.GOV_STEAM_FV4__YHPMX:
            unsetYhpmx();
            return;
        case CimPackage.GOV_STEAM_FV4__YMPMN:
            unsetYmpmn();
            return;
        case CimPackage.GOV_STEAM_FV4__YMPMX:
            unsetYmpmx();
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
        case CimPackage.GOV_STEAM_FV4__CPSMN:
            return isSetCpsmn();
        case CimPackage.GOV_STEAM_FV4__CPSMX:
            return isSetCpsmx();
        case CimPackage.GOV_STEAM_FV4__CRMN:
            return isSetCrmn();
        case CimPackage.GOV_STEAM_FV4__CRMX:
            return isSetCrmx();
        case CimPackage.GOV_STEAM_FV4__KDC:
            return isSetKdc();
        case CimPackage.GOV_STEAM_FV4__KF1:
            return isSetKf1();
        case CimPackage.GOV_STEAM_FV4__KF3:
            return isSetKf3();
        case CimPackage.GOV_STEAM_FV4__KHP:
            return isSetKhp();
        case CimPackage.GOV_STEAM_FV4__KIC:
            return isSetKic();
        case CimPackage.GOV_STEAM_FV4__KIP:
            return isSetKip();
        case CimPackage.GOV_STEAM_FV4__KIT:
            return isSetKit();
        case CimPackage.GOV_STEAM_FV4__KMP1:
            return isSetKmp1();
        case CimPackage.GOV_STEAM_FV4__KMP2:
            return isSetKmp2();
        case CimPackage.GOV_STEAM_FV4__KPC:
            return isSetKpc();
        case CimPackage.GOV_STEAM_FV4__KPP:
            return isSetKpp();
        case CimPackage.GOV_STEAM_FV4__KPT:
            return isSetKpt();
        case CimPackage.GOV_STEAM_FV4__KRC:
            return isSetKrc();
        case CimPackage.GOV_STEAM_FV4__KSH:
            return isSetKsh();
        case CimPackage.GOV_STEAM_FV4__LPI:
            return isSetLpi();
        case CimPackage.GOV_STEAM_FV4__LPS:
            return isSetLps();
        case CimPackage.GOV_STEAM_FV4__MNEF:
            return isSetMnef();
        case CimPackage.GOV_STEAM_FV4__MXEF:
            return isSetMxef();
        case CimPackage.GOV_STEAM_FV4__PR1:
            return isSetPr1();
        case CimPackage.GOV_STEAM_FV4__PR2:
            return isSetPr2();
        case CimPackage.GOV_STEAM_FV4__PSMN:
            return isSetPsmn();
        case CimPackage.GOV_STEAM_FV4__RSMIMN:
            return isSetRsmimn();
        case CimPackage.GOV_STEAM_FV4__RSMIMX:
            return isSetRsmimx();
        case CimPackage.GOV_STEAM_FV4__RVGMN:
            return isSetRvgmn();
        case CimPackage.GOV_STEAM_FV4__RVGMX:
            return isSetRvgmx();
        case CimPackage.GOV_STEAM_FV4__SRMN:
            return isSetSrmn();
        case CimPackage.GOV_STEAM_FV4__SRMX:
            return isSetSrmx();
        case CimPackage.GOV_STEAM_FV4__SRSMP:
            return isSetSrsmp();
        case CimPackage.GOV_STEAM_FV4__SVMN:
            return isSetSvmn();
        case CimPackage.GOV_STEAM_FV4__SVMX:
            return isSetSvmx();
        case CimPackage.GOV_STEAM_FV4__TA:
            return isSetTa();
        case CimPackage.GOV_STEAM_FV4__TAM:
            return isSetTam();
        case CimPackage.GOV_STEAM_FV4__TC:
            return isSetTc();
        case CimPackage.GOV_STEAM_FV4__TCM:
            return isSetTcm();
        case CimPackage.GOV_STEAM_FV4__TDC:
            return isSetTdc();
        case CimPackage.GOV_STEAM_FV4__TF1:
            return isSetTf1();
        case CimPackage.GOV_STEAM_FV4__TF2:
            return isSetTf2();
        case CimPackage.GOV_STEAM_FV4__THP:
            return isSetThp();
        case CimPackage.GOV_STEAM_FV4__TMP:
            return isSetTmp();
        case CimPackage.GOV_STEAM_FV4__TRH:
            return isSetTrh();
        case CimPackage.GOV_STEAM_FV4__TV:
            return isSetTv();
        case CimPackage.GOV_STEAM_FV4__TY:
            return isSetTy();
        case CimPackage.GOV_STEAM_FV4__Y:
            return isSetY();
        case CimPackage.GOV_STEAM_FV4__YHPMN:
            return isSetYhpmn();
        case CimPackage.GOV_STEAM_FV4__YHPMX:
            return isSetYhpmx();
        case CimPackage.GOV_STEAM_FV4__YMPMN:
            return isSetYmpmn();
        case CimPackage.GOV_STEAM_FV4__YMPMX:
            return isSetYmpmx();
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
        result.append( " (cpsmn: " );
        if( cpsmnESet )
            result.append( cpsmn );
        else
            result.append( "<unset>" );
        result.append( ", cpsmx: " );
        if( cpsmxESet )
            result.append( cpsmx );
        else
            result.append( "<unset>" );
        result.append( ", crmn: " );
        if( crmnESet )
            result.append( crmn );
        else
            result.append( "<unset>" );
        result.append( ", crmx: " );
        if( crmxESet )
            result.append( crmx );
        else
            result.append( "<unset>" );
        result.append( ", kdc: " );
        if( kdcESet )
            result.append( kdc );
        else
            result.append( "<unset>" );
        result.append( ", kf1: " );
        if( kf1ESet )
            result.append( kf1 );
        else
            result.append( "<unset>" );
        result.append( ", kf3: " );
        if( kf3ESet )
            result.append( kf3 );
        else
            result.append( "<unset>" );
        result.append( ", khp: " );
        if( khpESet )
            result.append( khp );
        else
            result.append( "<unset>" );
        result.append( ", kic: " );
        if( kicESet )
            result.append( kic );
        else
            result.append( "<unset>" );
        result.append( ", kip: " );
        if( kipESet )
            result.append( kip );
        else
            result.append( "<unset>" );
        result.append( ", kit: " );
        if( kitESet )
            result.append( kit );
        else
            result.append( "<unset>" );
        result.append( ", kmp1: " );
        if( kmp1ESet )
            result.append( kmp1 );
        else
            result.append( "<unset>" );
        result.append( ", kmp2: " );
        if( kmp2ESet )
            result.append( kmp2 );
        else
            result.append( "<unset>" );
        result.append( ", kpc: " );
        if( kpcESet )
            result.append( kpc );
        else
            result.append( "<unset>" );
        result.append( ", kpp: " );
        if( kppESet )
            result.append( kpp );
        else
            result.append( "<unset>" );
        result.append( ", kpt: " );
        if( kptESet )
            result.append( kpt );
        else
            result.append( "<unset>" );
        result.append( ", krc: " );
        if( krcESet )
            result.append( krc );
        else
            result.append( "<unset>" );
        result.append( ", ksh: " );
        if( kshESet )
            result.append( ksh );
        else
            result.append( "<unset>" );
        result.append( ", lpi: " );
        if( lpiESet )
            result.append( lpi );
        else
            result.append( "<unset>" );
        result.append( ", lps: " );
        if( lpsESet )
            result.append( lps );
        else
            result.append( "<unset>" );
        result.append( ", mnef: " );
        if( mnefESet )
            result.append( mnef );
        else
            result.append( "<unset>" );
        result.append( ", mxef: " );
        if( mxefESet )
            result.append( mxef );
        else
            result.append( "<unset>" );
        result.append( ", pr1: " );
        if( pr1ESet )
            result.append( pr1 );
        else
            result.append( "<unset>" );
        result.append( ", pr2: " );
        if( pr2ESet )
            result.append( pr2 );
        else
            result.append( "<unset>" );
        result.append( ", psmn: " );
        if( psmnESet )
            result.append( psmn );
        else
            result.append( "<unset>" );
        result.append( ", rsmimn: " );
        if( rsmimnESet )
            result.append( rsmimn );
        else
            result.append( "<unset>" );
        result.append( ", rsmimx: " );
        if( rsmimxESet )
            result.append( rsmimx );
        else
            result.append( "<unset>" );
        result.append( ", rvgmn: " );
        if( rvgmnESet )
            result.append( rvgmn );
        else
            result.append( "<unset>" );
        result.append( ", rvgmx: " );
        if( rvgmxESet )
            result.append( rvgmx );
        else
            result.append( "<unset>" );
        result.append( ", srmn: " );
        if( srmnESet )
            result.append( srmn );
        else
            result.append( "<unset>" );
        result.append( ", srmx: " );
        if( srmxESet )
            result.append( srmx );
        else
            result.append( "<unset>" );
        result.append( ", srsmp: " );
        if( srsmpESet )
            result.append( srsmp );
        else
            result.append( "<unset>" );
        result.append( ", svmn: " );
        if( svmnESet )
            result.append( svmn );
        else
            result.append( "<unset>" );
        result.append( ", svmx: " );
        if( svmxESet )
            result.append( svmx );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", tam: " );
        if( tamESet )
            result.append( tam );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", tcm: " );
        if( tcmESet )
            result.append( tcm );
        else
            result.append( "<unset>" );
        result.append( ", tdc: " );
        if( tdcESet )
            result.append( tdc );
        else
            result.append( "<unset>" );
        result.append( ", tf1: " );
        if( tf1ESet )
            result.append( tf1 );
        else
            result.append( "<unset>" );
        result.append( ", tf2: " );
        if( tf2ESet )
            result.append( tf2 );
        else
            result.append( "<unset>" );
        result.append( ", thp: " );
        if( thpESet )
            result.append( thp );
        else
            result.append( "<unset>" );
        result.append( ", tmp: " );
        if( tmpESet )
            result.append( tmp );
        else
            result.append( "<unset>" );
        result.append( ", trh: " );
        if( trhESet )
            result.append( trh );
        else
            result.append( "<unset>" );
        result.append( ", tv: " );
        if( tvESet )
            result.append( tv );
        else
            result.append( "<unset>" );
        result.append( ", ty: " );
        if( tyESet )
            result.append( ty );
        else
            result.append( "<unset>" );
        result.append( ", y: " );
        if( yESet )
            result.append( y );
        else
            result.append( "<unset>" );
        result.append( ", yhpmn: " );
        if( yhpmnESet )
            result.append( yhpmn );
        else
            result.append( "<unset>" );
        result.append( ", yhpmx: " );
        if( yhpmxESet )
            result.append( yhpmx );
        else
            result.append( "<unset>" );
        result.append( ", ympmn: " );
        if( ympmnESet )
            result.append( ympmn );
        else
            result.append( "<unset>" );
        result.append( ", ympmx: " );
        if( ympmxESet )
            result.append( ympmx );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovSteamFV4Impl
