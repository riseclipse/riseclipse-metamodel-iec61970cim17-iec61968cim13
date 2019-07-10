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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PWRSteamSupply;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PWR Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getColdLegFBLagTC <em>Cold Leg FB Lag TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getColdLegFBLeadTC1 <em>Cold Leg FB Lead TC1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getColdLegFBLeadTC2 <em>Cold Leg FB Lead TC2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getColdLegFG1 <em>Cold Leg FG1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getColdLegFG2 <em>Cold Leg FG2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getColdLegLagTC <em>Cold Leg Lag TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getCoreHTLagTC1 <em>Core HT Lag TC1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getCoreHTLagTC2 <em>Core HT Lag TC2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getCoreNeutronicsEffTC <em>Core Neutronics Eff TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getCoreNeutronicsHT <em>Core Neutronics HT</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getFeedbackFactor <em>Feedback Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getHotLegLagTC <em>Hot Leg Lag TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getHotLegSteamGain <em>Hot Leg Steam Gain</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getHotLegToColdLegGain <em>Hot Leg To Cold Leg Gain</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getPressureCG <em>Pressure CG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getSteamFlowFG <em>Steam Flow FG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getSteamPressureDropLagTC <em>Steam Pressure Drop Lag TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getSteamPressureFG <em>Steam Pressure FG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getThrottlePressureFactor <em>Throttle Pressure Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PWRSteamSupplyImpl#getThrottlePressureSP <em>Throttle Pressure SP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PWRSteamSupplyImpl extends SteamSupplyImpl implements PWRSteamSupply {
    /**
     * The default value of the '{@link #getColdLegFBLagTC() <em>Cold Leg FB Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFBLagTC()
     * @generated
     * @ordered
     */
    protected static final Float COLD_LEG_FB_LAG_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColdLegFBLagTC() <em>Cold Leg FB Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFBLagTC()
     * @generated
     * @ordered
     */
    protected Float coldLegFBLagTC = COLD_LEG_FB_LAG_TC_EDEFAULT;

    /**
     * This is true if the Cold Leg FB Lag TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coldLegFBLagTCESet;

    /**
     * The default value of the '{@link #getColdLegFBLeadTC1() <em>Cold Leg FB Lead TC1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFBLeadTC1()
     * @generated
     * @ordered
     */
    protected static final Float COLD_LEG_FB_LEAD_TC1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColdLegFBLeadTC1() <em>Cold Leg FB Lead TC1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFBLeadTC1()
     * @generated
     * @ordered
     */
    protected Float coldLegFBLeadTC1 = COLD_LEG_FB_LEAD_TC1_EDEFAULT;

    /**
     * This is true if the Cold Leg FB Lead TC1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coldLegFBLeadTC1ESet;

    /**
     * The default value of the '{@link #getColdLegFBLeadTC2() <em>Cold Leg FB Lead TC2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFBLeadTC2()
     * @generated
     * @ordered
     */
    protected static final Float COLD_LEG_FB_LEAD_TC2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColdLegFBLeadTC2() <em>Cold Leg FB Lead TC2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFBLeadTC2()
     * @generated
     * @ordered
     */
    protected Float coldLegFBLeadTC2 = COLD_LEG_FB_LEAD_TC2_EDEFAULT;

    /**
     * This is true if the Cold Leg FB Lead TC2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coldLegFBLeadTC2ESet;

    /**
     * The default value of the '{@link #getColdLegFG1() <em>Cold Leg FG1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFG1()
     * @generated
     * @ordered
     */
    protected static final Float COLD_LEG_FG1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColdLegFG1() <em>Cold Leg FG1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFG1()
     * @generated
     * @ordered
     */
    protected Float coldLegFG1 = COLD_LEG_FG1_EDEFAULT;

    /**
     * This is true if the Cold Leg FG1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coldLegFG1ESet;

    /**
     * The default value of the '{@link #getColdLegFG2() <em>Cold Leg FG2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFG2()
     * @generated
     * @ordered
     */
    protected static final Float COLD_LEG_FG2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColdLegFG2() <em>Cold Leg FG2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegFG2()
     * @generated
     * @ordered
     */
    protected Float coldLegFG2 = COLD_LEG_FG2_EDEFAULT;

    /**
     * This is true if the Cold Leg FG2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coldLegFG2ESet;

    /**
     * The default value of the '{@link #getColdLegLagTC() <em>Cold Leg Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegLagTC()
     * @generated
     * @ordered
     */
    protected static final Float COLD_LEG_LAG_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColdLegLagTC() <em>Cold Leg Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColdLegLagTC()
     * @generated
     * @ordered
     */
    protected Float coldLegLagTC = COLD_LEG_LAG_TC_EDEFAULT;

    /**
     * This is true if the Cold Leg Lag TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coldLegLagTCESet;

    /**
     * The default value of the '{@link #getCoreHTLagTC1() <em>Core HT Lag TC1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreHTLagTC1()
     * @generated
     * @ordered
     */
    protected static final Float CORE_HT_LAG_TC1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoreHTLagTC1() <em>Core HT Lag TC1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreHTLagTC1()
     * @generated
     * @ordered
     */
    protected Float coreHTLagTC1 = CORE_HT_LAG_TC1_EDEFAULT;

    /**
     * This is true if the Core HT Lag TC1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreHTLagTC1ESet;

    /**
     * The default value of the '{@link #getCoreHTLagTC2() <em>Core HT Lag TC2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreHTLagTC2()
     * @generated
     * @ordered
     */
    protected static final Float CORE_HT_LAG_TC2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoreHTLagTC2() <em>Core HT Lag TC2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreHTLagTC2()
     * @generated
     * @ordered
     */
    protected Float coreHTLagTC2 = CORE_HT_LAG_TC2_EDEFAULT;

    /**
     * This is true if the Core HT Lag TC2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreHTLagTC2ESet;

    /**
     * The default value of the '{@link #getCoreNeutronicsEffTC() <em>Core Neutronics Eff TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreNeutronicsEffTC()
     * @generated
     * @ordered
     */
    protected static final Float CORE_NEUTRONICS_EFF_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoreNeutronicsEffTC() <em>Core Neutronics Eff TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreNeutronicsEffTC()
     * @generated
     * @ordered
     */
    protected Float coreNeutronicsEffTC = CORE_NEUTRONICS_EFF_TC_EDEFAULT;

    /**
     * This is true if the Core Neutronics Eff TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreNeutronicsEffTCESet;

    /**
     * The default value of the '{@link #getCoreNeutronicsHT() <em>Core Neutronics HT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreNeutronicsHT()
     * @generated
     * @ordered
     */
    protected static final Float CORE_NEUTRONICS_HT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoreNeutronicsHT() <em>Core Neutronics HT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreNeutronicsHT()
     * @generated
     * @ordered
     */
    protected Float coreNeutronicsHT = CORE_NEUTRONICS_HT_EDEFAULT;

    /**
     * This is true if the Core Neutronics HT attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreNeutronicsHTESet;

    /**
     * The default value of the '{@link #getFeedbackFactor() <em>Feedback Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedbackFactor()
     * @generated
     * @ordered
     */
    protected static final Float FEEDBACK_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeedbackFactor() <em>Feedback Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedbackFactor()
     * @generated
     * @ordered
     */
    protected Float feedbackFactor = FEEDBACK_FACTOR_EDEFAULT;

    /**
     * This is true if the Feedback Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean feedbackFactorESet;

    /**
     * The default value of the '{@link #getHotLegLagTC() <em>Hot Leg Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotLegLagTC()
     * @generated
     * @ordered
     */
    protected static final Float HOT_LEG_LAG_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHotLegLagTC() <em>Hot Leg Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotLegLagTC()
     * @generated
     * @ordered
     */
    protected Float hotLegLagTC = HOT_LEG_LAG_TC_EDEFAULT;

    /**
     * This is true if the Hot Leg Lag TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hotLegLagTCESet;

    /**
     * The default value of the '{@link #getHotLegSteamGain() <em>Hot Leg Steam Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotLegSteamGain()
     * @generated
     * @ordered
     */
    protected static final Float HOT_LEG_STEAM_GAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHotLegSteamGain() <em>Hot Leg Steam Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotLegSteamGain()
     * @generated
     * @ordered
     */
    protected Float hotLegSteamGain = HOT_LEG_STEAM_GAIN_EDEFAULT;

    /**
     * This is true if the Hot Leg Steam Gain attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hotLegSteamGainESet;

    /**
     * The default value of the '{@link #getHotLegToColdLegGain() <em>Hot Leg To Cold Leg Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotLegToColdLegGain()
     * @generated
     * @ordered
     */
    protected static final Float HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHotLegToColdLegGain() <em>Hot Leg To Cold Leg Gain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHotLegToColdLegGain()
     * @generated
     * @ordered
     */
    protected Float hotLegToColdLegGain = HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT;

    /**
     * This is true if the Hot Leg To Cold Leg Gain attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hotLegToColdLegGainESet;

    /**
     * The default value of the '{@link #getPressureCG() <em>Pressure CG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCG()
     * @generated
     * @ordered
     */
    protected static final Float PRESSURE_CG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPressureCG() <em>Pressure CG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPressureCG()
     * @generated
     * @ordered
     */
    protected Float pressureCG = PRESSURE_CG_EDEFAULT;

    /**
     * This is true if the Pressure CG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pressureCGESet;

    /**
     * The default value of the '{@link #getSteamFlowFG() <em>Steam Flow FG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamFlowFG()
     * @generated
     * @ordered
     */
    protected static final Float STEAM_FLOW_FG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSteamFlowFG() <em>Steam Flow FG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamFlowFG()
     * @generated
     * @ordered
     */
    protected Float steamFlowFG = STEAM_FLOW_FG_EDEFAULT;

    /**
     * This is true if the Steam Flow FG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean steamFlowFGESet;

    /**
     * The default value of the '{@link #getSteamPressureDropLagTC() <em>Steam Pressure Drop Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamPressureDropLagTC()
     * @generated
     * @ordered
     */
    protected static final Float STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSteamPressureDropLagTC() <em>Steam Pressure Drop Lag TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamPressureDropLagTC()
     * @generated
     * @ordered
     */
    protected Float steamPressureDropLagTC = STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT;

    /**
     * This is true if the Steam Pressure Drop Lag TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean steamPressureDropLagTCESet;

    /**
     * The default value of the '{@link #getSteamPressureFG() <em>Steam Pressure FG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamPressureFG()
     * @generated
     * @ordered
     */
    protected static final Float STEAM_PRESSURE_FG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSteamPressureFG() <em>Steam Pressure FG</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamPressureFG()
     * @generated
     * @ordered
     */
    protected Float steamPressureFG = STEAM_PRESSURE_FG_EDEFAULT;

    /**
     * This is true if the Steam Pressure FG attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean steamPressureFGESet;

    /**
     * The default value of the '{@link #getThrottlePressureFactor() <em>Throttle Pressure Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottlePressureFactor()
     * @generated
     * @ordered
     */
    protected static final Float THROTTLE_PRESSURE_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThrottlePressureFactor() <em>Throttle Pressure Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottlePressureFactor()
     * @generated
     * @ordered
     */
    protected Float throttlePressureFactor = THROTTLE_PRESSURE_FACTOR_EDEFAULT;

    /**
     * This is true if the Throttle Pressure Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean throttlePressureFactorESet;

    /**
     * The default value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottlePressureSP()
     * @generated
     * @ordered
     */
    protected static final Float THROTTLE_PRESSURE_SP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThrottlePressureSP() <em>Throttle Pressure SP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThrottlePressureSP()
     * @generated
     * @ordered
     */
    protected Float throttlePressureSP = THROTTLE_PRESSURE_SP_EDEFAULT;

    /**
     * This is true if the Throttle Pressure SP attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean throttlePressureSPESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PWRSteamSupplyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPWRSteamSupply();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getColdLegFBLagTC() {
        return coldLegFBLagTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColdLegFBLagTC( Float newColdLegFBLagTC ) {
        Float oldColdLegFBLagTC = coldLegFBLagTC;
        coldLegFBLagTC = newColdLegFBLagTC;
        boolean oldColdLegFBLagTCESet = coldLegFBLagTCESet;
        coldLegFBLagTCESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC,
                    oldColdLegFBLagTC, coldLegFBLagTC, !oldColdLegFBLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetColdLegFBLagTC() {
        Float oldColdLegFBLagTC = coldLegFBLagTC;
        boolean oldColdLegFBLagTCESet = coldLegFBLagTCESet;
        coldLegFBLagTC = COLD_LEG_FB_LAG_TC_EDEFAULT;
        coldLegFBLagTCESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC,
                    oldColdLegFBLagTC, COLD_LEG_FB_LAG_TC_EDEFAULT, oldColdLegFBLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetColdLegFBLagTC() {
        return coldLegFBLagTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getColdLegFBLeadTC1() {
        return coldLegFBLeadTC1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColdLegFBLeadTC1( Float newColdLegFBLeadTC1 ) {
        Float oldColdLegFBLeadTC1 = coldLegFBLeadTC1;
        coldLegFBLeadTC1 = newColdLegFBLeadTC1;
        boolean oldColdLegFBLeadTC1ESet = coldLegFBLeadTC1ESet;
        coldLegFBLeadTC1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1,
                    oldColdLegFBLeadTC1, coldLegFBLeadTC1, !oldColdLegFBLeadTC1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetColdLegFBLeadTC1() {
        Float oldColdLegFBLeadTC1 = coldLegFBLeadTC1;
        boolean oldColdLegFBLeadTC1ESet = coldLegFBLeadTC1ESet;
        coldLegFBLeadTC1 = COLD_LEG_FB_LEAD_TC1_EDEFAULT;
        coldLegFBLeadTC1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1,
                    oldColdLegFBLeadTC1, COLD_LEG_FB_LEAD_TC1_EDEFAULT, oldColdLegFBLeadTC1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetColdLegFBLeadTC1() {
        return coldLegFBLeadTC1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getColdLegFBLeadTC2() {
        return coldLegFBLeadTC2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColdLegFBLeadTC2( Float newColdLegFBLeadTC2 ) {
        Float oldColdLegFBLeadTC2 = coldLegFBLeadTC2;
        coldLegFBLeadTC2 = newColdLegFBLeadTC2;
        boolean oldColdLegFBLeadTC2ESet = coldLegFBLeadTC2ESet;
        coldLegFBLeadTC2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2,
                    oldColdLegFBLeadTC2, coldLegFBLeadTC2, !oldColdLegFBLeadTC2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetColdLegFBLeadTC2() {
        Float oldColdLegFBLeadTC2 = coldLegFBLeadTC2;
        boolean oldColdLegFBLeadTC2ESet = coldLegFBLeadTC2ESet;
        coldLegFBLeadTC2 = COLD_LEG_FB_LEAD_TC2_EDEFAULT;
        coldLegFBLeadTC2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2,
                    oldColdLegFBLeadTC2, COLD_LEG_FB_LEAD_TC2_EDEFAULT, oldColdLegFBLeadTC2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetColdLegFBLeadTC2() {
        return coldLegFBLeadTC2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getColdLegFG1() {
        return coldLegFG1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColdLegFG1( Float newColdLegFG1 ) {
        Float oldColdLegFG1 = coldLegFG1;
        coldLegFG1 = newColdLegFG1;
        boolean oldColdLegFG1ESet = coldLegFG1ESet;
        coldLegFG1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1, oldColdLegFG1, coldLegFG1, !oldColdLegFG1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetColdLegFG1() {
        Float oldColdLegFG1 = coldLegFG1;
        boolean oldColdLegFG1ESet = coldLegFG1ESet;
        coldLegFG1 = COLD_LEG_FG1_EDEFAULT;
        coldLegFG1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1, oldColdLegFG1, COLD_LEG_FG1_EDEFAULT, oldColdLegFG1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetColdLegFG1() {
        return coldLegFG1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getColdLegFG2() {
        return coldLegFG2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColdLegFG2( Float newColdLegFG2 ) {
        Float oldColdLegFG2 = coldLegFG2;
        coldLegFG2 = newColdLegFG2;
        boolean oldColdLegFG2ESet = coldLegFG2ESet;
        coldLegFG2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2, oldColdLegFG2, coldLegFG2, !oldColdLegFG2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetColdLegFG2() {
        Float oldColdLegFG2 = coldLegFG2;
        boolean oldColdLegFG2ESet = coldLegFG2ESet;
        coldLegFG2 = COLD_LEG_FG2_EDEFAULT;
        coldLegFG2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2, oldColdLegFG2, COLD_LEG_FG2_EDEFAULT, oldColdLegFG2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetColdLegFG2() {
        return coldLegFG2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getColdLegLagTC() {
        return coldLegLagTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setColdLegLagTC( Float newColdLegLagTC ) {
        Float oldColdLegLagTC = coldLegLagTC;
        coldLegLagTC = newColdLegLagTC;
        boolean oldColdLegLagTCESet = coldLegLagTCESet;
        coldLegLagTCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC, oldColdLegLagTC, coldLegLagTC, !oldColdLegLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetColdLegLagTC() {
        Float oldColdLegLagTC = coldLegLagTC;
        boolean oldColdLegLagTCESet = coldLegLagTCESet;
        coldLegLagTC = COLD_LEG_LAG_TC_EDEFAULT;
        coldLegLagTCESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC,
                    oldColdLegLagTC, COLD_LEG_LAG_TC_EDEFAULT, oldColdLegLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetColdLegLagTC() {
        return coldLegLagTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoreHTLagTC1() {
        return coreHTLagTC1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoreHTLagTC1( Float newCoreHTLagTC1 ) {
        Float oldCoreHTLagTC1 = coreHTLagTC1;
        coreHTLagTC1 = newCoreHTLagTC1;
        boolean oldCoreHTLagTC1ESet = coreHTLagTC1ESet;
        coreHTLagTC1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1, oldCoreHTLagTC1, coreHTLagTC1, !oldCoreHTLagTC1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoreHTLagTC1() {
        Float oldCoreHTLagTC1 = coreHTLagTC1;
        boolean oldCoreHTLagTC1ESet = coreHTLagTC1ESet;
        coreHTLagTC1 = CORE_HT_LAG_TC1_EDEFAULT;
        coreHTLagTC1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1,
                    oldCoreHTLagTC1, CORE_HT_LAG_TC1_EDEFAULT, oldCoreHTLagTC1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreHTLagTC1() {
        return coreHTLagTC1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoreHTLagTC2() {
        return coreHTLagTC2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoreHTLagTC2( Float newCoreHTLagTC2 ) {
        Float oldCoreHTLagTC2 = coreHTLagTC2;
        coreHTLagTC2 = newCoreHTLagTC2;
        boolean oldCoreHTLagTC2ESet = coreHTLagTC2ESet;
        coreHTLagTC2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2, oldCoreHTLagTC2, coreHTLagTC2, !oldCoreHTLagTC2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoreHTLagTC2() {
        Float oldCoreHTLagTC2 = coreHTLagTC2;
        boolean oldCoreHTLagTC2ESet = coreHTLagTC2ESet;
        coreHTLagTC2 = CORE_HT_LAG_TC2_EDEFAULT;
        coreHTLagTC2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2,
                    oldCoreHTLagTC2, CORE_HT_LAG_TC2_EDEFAULT, oldCoreHTLagTC2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreHTLagTC2() {
        return coreHTLagTC2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoreNeutronicsEffTC() {
        return coreNeutronicsEffTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoreNeutronicsEffTC( Float newCoreNeutronicsEffTC ) {
        Float oldCoreNeutronicsEffTC = coreNeutronicsEffTC;
        coreNeutronicsEffTC = newCoreNeutronicsEffTC;
        boolean oldCoreNeutronicsEffTCESet = coreNeutronicsEffTCESet;
        coreNeutronicsEffTCESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC,
                    oldCoreNeutronicsEffTC, coreNeutronicsEffTC, !oldCoreNeutronicsEffTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoreNeutronicsEffTC() {
        Float oldCoreNeutronicsEffTC = coreNeutronicsEffTC;
        boolean oldCoreNeutronicsEffTCESet = coreNeutronicsEffTCESet;
        coreNeutronicsEffTC = CORE_NEUTRONICS_EFF_TC_EDEFAULT;
        coreNeutronicsEffTCESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC,
                        oldCoreNeutronicsEffTC, CORE_NEUTRONICS_EFF_TC_EDEFAULT, oldCoreNeutronicsEffTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreNeutronicsEffTC() {
        return coreNeutronicsEffTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoreNeutronicsHT() {
        return coreNeutronicsHT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoreNeutronicsHT( Float newCoreNeutronicsHT ) {
        Float oldCoreNeutronicsHT = coreNeutronicsHT;
        coreNeutronicsHT = newCoreNeutronicsHT;
        boolean oldCoreNeutronicsHTESet = coreNeutronicsHTESet;
        coreNeutronicsHTESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT,
                    oldCoreNeutronicsHT, coreNeutronicsHT, !oldCoreNeutronicsHTESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoreNeutronicsHT() {
        Float oldCoreNeutronicsHT = coreNeutronicsHT;
        boolean oldCoreNeutronicsHTESet = coreNeutronicsHTESet;
        coreNeutronicsHT = CORE_NEUTRONICS_HT_EDEFAULT;
        coreNeutronicsHTESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT,
                    oldCoreNeutronicsHT, CORE_NEUTRONICS_HT_EDEFAULT, oldCoreNeutronicsHTESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreNeutronicsHT() {
        return coreNeutronicsHTESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFeedbackFactor() {
        return feedbackFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFeedbackFactor( Float newFeedbackFactor ) {
        Float oldFeedbackFactor = feedbackFactor;
        feedbackFactor = newFeedbackFactor;
        boolean oldFeedbackFactorESet = feedbackFactorESet;
        feedbackFactorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR,
                    oldFeedbackFactor, feedbackFactor, !oldFeedbackFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFeedbackFactor() {
        Float oldFeedbackFactor = feedbackFactor;
        boolean oldFeedbackFactorESet = feedbackFactorESet;
        feedbackFactor = FEEDBACK_FACTOR_EDEFAULT;
        feedbackFactorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR,
                    oldFeedbackFactor, FEEDBACK_FACTOR_EDEFAULT, oldFeedbackFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFeedbackFactor() {
        return feedbackFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHotLegLagTC() {
        return hotLegLagTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHotLegLagTC( Float newHotLegLagTC ) {
        Float oldHotLegLagTC = hotLegLagTC;
        hotLegLagTC = newHotLegLagTC;
        boolean oldHotLegLagTCESet = hotLegLagTCESet;
        hotLegLagTCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC, oldHotLegLagTC, hotLegLagTC, !oldHotLegLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHotLegLagTC() {
        Float oldHotLegLagTC = hotLegLagTC;
        boolean oldHotLegLagTCESet = hotLegLagTCESet;
        hotLegLagTC = HOT_LEG_LAG_TC_EDEFAULT;
        hotLegLagTCESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC,
                    oldHotLegLagTC, HOT_LEG_LAG_TC_EDEFAULT, oldHotLegLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHotLegLagTC() {
        return hotLegLagTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHotLegSteamGain() {
        return hotLegSteamGain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHotLegSteamGain( Float newHotLegSteamGain ) {
        Float oldHotLegSteamGain = hotLegSteamGain;
        hotLegSteamGain = newHotLegSteamGain;
        boolean oldHotLegSteamGainESet = hotLegSteamGainESet;
        hotLegSteamGainESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN,
                    oldHotLegSteamGain, hotLegSteamGain, !oldHotLegSteamGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHotLegSteamGain() {
        Float oldHotLegSteamGain = hotLegSteamGain;
        boolean oldHotLegSteamGainESet = hotLegSteamGainESet;
        hotLegSteamGain = HOT_LEG_STEAM_GAIN_EDEFAULT;
        hotLegSteamGainESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN,
                    oldHotLegSteamGain, HOT_LEG_STEAM_GAIN_EDEFAULT, oldHotLegSteamGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHotLegSteamGain() {
        return hotLegSteamGainESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHotLegToColdLegGain() {
        return hotLegToColdLegGain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHotLegToColdLegGain( Float newHotLegToColdLegGain ) {
        Float oldHotLegToColdLegGain = hotLegToColdLegGain;
        hotLegToColdLegGain = newHotLegToColdLegGain;
        boolean oldHotLegToColdLegGainESet = hotLegToColdLegGainESet;
        hotLegToColdLegGainESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN,
                        oldHotLegToColdLegGain, hotLegToColdLegGain, !oldHotLegToColdLegGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHotLegToColdLegGain() {
        Float oldHotLegToColdLegGain = hotLegToColdLegGain;
        boolean oldHotLegToColdLegGainESet = hotLegToColdLegGainESet;
        hotLegToColdLegGain = HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT;
        hotLegToColdLegGainESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN,
                        oldHotLegToColdLegGain, HOT_LEG_TO_COLD_LEG_GAIN_EDEFAULT, oldHotLegToColdLegGainESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHotLegToColdLegGain() {
        return hotLegToColdLegGainESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPressureCG() {
        return pressureCG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPressureCG( Float newPressureCG ) {
        Float oldPressureCG = pressureCG;
        pressureCG = newPressureCG;
        boolean oldPressureCGESet = pressureCGESet;
        pressureCGESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__PRESSURE_CG, oldPressureCG, pressureCG, !oldPressureCGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPressureCG() {
        Float oldPressureCG = pressureCG;
        boolean oldPressureCGESet = pressureCGESet;
        pressureCG = PRESSURE_CG_EDEFAULT;
        pressureCGESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PWR_STEAM_SUPPLY__PRESSURE_CG, oldPressureCG, PRESSURE_CG_EDEFAULT, oldPressureCGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPressureCG() {
        return pressureCGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSteamFlowFG() {
        return steamFlowFG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSteamFlowFG( Float newSteamFlowFG ) {
        Float oldSteamFlowFG = steamFlowFG;
        steamFlowFG = newSteamFlowFG;
        boolean oldSteamFlowFGESet = steamFlowFGESet;
        steamFlowFGESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG, oldSteamFlowFG, steamFlowFG, !oldSteamFlowFGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamFlowFG() {
        Float oldSteamFlowFG = steamFlowFG;
        boolean oldSteamFlowFGESet = steamFlowFGESet;
        steamFlowFG = STEAM_FLOW_FG_EDEFAULT;
        steamFlowFGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG,
                    oldSteamFlowFG, STEAM_FLOW_FG_EDEFAULT, oldSteamFlowFGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamFlowFG() {
        return steamFlowFGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSteamPressureDropLagTC() {
        return steamPressureDropLagTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSteamPressureDropLagTC( Float newSteamPressureDropLagTC ) {
        Float oldSteamPressureDropLagTC = steamPressureDropLagTC;
        steamPressureDropLagTC = newSteamPressureDropLagTC;
        boolean oldSteamPressureDropLagTCESet = steamPressureDropLagTCESet;
        steamPressureDropLagTCESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC,
                        oldSteamPressureDropLagTC, steamPressureDropLagTC, !oldSteamPressureDropLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamPressureDropLagTC() {
        Float oldSteamPressureDropLagTC = steamPressureDropLagTC;
        boolean oldSteamPressureDropLagTCESet = steamPressureDropLagTCESet;
        steamPressureDropLagTC = STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT;
        steamPressureDropLagTCESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC, oldSteamPressureDropLagTC,
                STEAM_PRESSURE_DROP_LAG_TC_EDEFAULT, oldSteamPressureDropLagTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamPressureDropLagTC() {
        return steamPressureDropLagTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSteamPressureFG() {
        return steamPressureFG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSteamPressureFG( Float newSteamPressureFG ) {
        Float oldSteamPressureFG = steamPressureFG;
        steamPressureFG = newSteamPressureFG;
        boolean oldSteamPressureFGESet = steamPressureFGESet;
        steamPressureFGESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG,
                    oldSteamPressureFG, steamPressureFG, !oldSteamPressureFGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamPressureFG() {
        Float oldSteamPressureFG = steamPressureFG;
        boolean oldSteamPressureFGESet = steamPressureFGESet;
        steamPressureFG = STEAM_PRESSURE_FG_EDEFAULT;
        steamPressureFGESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG,
                    oldSteamPressureFG, STEAM_PRESSURE_FG_EDEFAULT, oldSteamPressureFGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamPressureFG() {
        return steamPressureFGESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThrottlePressureFactor() {
        return throttlePressureFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThrottlePressureFactor( Float newThrottlePressureFactor ) {
        Float oldThrottlePressureFactor = throttlePressureFactor;
        throttlePressureFactor = newThrottlePressureFactor;
        boolean oldThrottlePressureFactorESet = throttlePressureFactorESet;
        throttlePressureFactorESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR,
                        oldThrottlePressureFactor, throttlePressureFactor, !oldThrottlePressureFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThrottlePressureFactor() {
        Float oldThrottlePressureFactor = throttlePressureFactor;
        boolean oldThrottlePressureFactorESet = throttlePressureFactorESet;
        throttlePressureFactor = THROTTLE_PRESSURE_FACTOR_EDEFAULT;
        throttlePressureFactorESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR,
                        oldThrottlePressureFactor, THROTTLE_PRESSURE_FACTOR_EDEFAULT, oldThrottlePressureFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThrottlePressureFactor() {
        return throttlePressureFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThrottlePressureSP() {
        return throttlePressureSP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThrottlePressureSP( Float newThrottlePressureSP ) {
        Float oldThrottlePressureSP = throttlePressureSP;
        throttlePressureSP = newThrottlePressureSP;
        boolean oldThrottlePressureSPESet = throttlePressureSPESet;
        throttlePressureSPESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP,
                    oldThrottlePressureSP, throttlePressureSP, !oldThrottlePressureSPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThrottlePressureSP() {
        Float oldThrottlePressureSP = throttlePressureSP;
        boolean oldThrottlePressureSPESet = throttlePressureSPESet;
        throttlePressureSP = THROTTLE_PRESSURE_SP_EDEFAULT;
        throttlePressureSPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP,
                    oldThrottlePressureSP, THROTTLE_PRESSURE_SP_EDEFAULT, oldThrottlePressureSPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThrottlePressureSP() {
        return throttlePressureSPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
            return getColdLegFBLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
            return getColdLegFBLeadTC1();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
            return getColdLegFBLeadTC2();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
            return getColdLegFG1();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
            return getColdLegFG2();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
            return getColdLegLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
            return getCoreHTLagTC1();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
            return getCoreHTLagTC2();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
            return getCoreNeutronicsEffTC();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
            return getCoreNeutronicsHT();
        case CimPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
            return getFeedbackFactor();
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
            return getHotLegLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
            return getHotLegSteamGain();
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
            return getHotLegToColdLegGain();
        case CimPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
            return getPressureCG();
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
            return getSteamFlowFG();
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
            return getSteamPressureDropLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
            return getSteamPressureFG();
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
            return getThrottlePressureFactor();
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            return getThrottlePressureSP();
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
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
            setColdLegFBLagTC( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
            setColdLegFBLeadTC1( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
            setColdLegFBLeadTC2( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
            setColdLegFG1( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
            setColdLegFG2( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
            setColdLegLagTC( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
            setCoreHTLagTC1( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
            setCoreHTLagTC2( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
            setCoreNeutronicsEffTC( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
            setCoreNeutronicsHT( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
            setFeedbackFactor( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
            setHotLegLagTC( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
            setHotLegSteamGain( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
            setHotLegToColdLegGain( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
            setPressureCG( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
            setSteamFlowFG( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
            setSteamPressureDropLagTC( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
            setSteamPressureFG( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
            setThrottlePressureFactor( ( Float ) newValue );
            return;
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            setThrottlePressureSP( ( Float ) newValue );
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
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
            unsetColdLegFBLagTC();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
            unsetColdLegFBLeadTC1();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
            unsetColdLegFBLeadTC2();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
            unsetColdLegFG1();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
            unsetColdLegFG2();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
            unsetColdLegLagTC();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
            unsetCoreHTLagTC1();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
            unsetCoreHTLagTC2();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
            unsetCoreNeutronicsEffTC();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
            unsetCoreNeutronicsHT();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
            unsetFeedbackFactor();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
            unsetHotLegLagTC();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
            unsetHotLegSteamGain();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
            unsetHotLegToColdLegGain();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
            unsetPressureCG();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
            unsetSteamFlowFG();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
            unsetSteamPressureDropLagTC();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
            unsetSteamPressureFG();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
            unsetThrottlePressureFactor();
            return;
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            unsetThrottlePressureSP();
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
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LAG_TC:
            return isSetColdLegFBLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC1:
            return isSetColdLegFBLeadTC1();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FB_LEAD_TC2:
            return isSetColdLegFBLeadTC2();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG1:
            return isSetColdLegFG1();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_FG2:
            return isSetColdLegFG2();
        case CimPackage.PWR_STEAM_SUPPLY__COLD_LEG_LAG_TC:
            return isSetColdLegLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC1:
            return isSetCoreHTLagTC1();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_HT_LAG_TC2:
            return isSetCoreHTLagTC2();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_EFF_TC:
            return isSetCoreNeutronicsEffTC();
        case CimPackage.PWR_STEAM_SUPPLY__CORE_NEUTRONICS_HT:
            return isSetCoreNeutronicsHT();
        case CimPackage.PWR_STEAM_SUPPLY__FEEDBACK_FACTOR:
            return isSetFeedbackFactor();
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_LAG_TC:
            return isSetHotLegLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_STEAM_GAIN:
            return isSetHotLegSteamGain();
        case CimPackage.PWR_STEAM_SUPPLY__HOT_LEG_TO_COLD_LEG_GAIN:
            return isSetHotLegToColdLegGain();
        case CimPackage.PWR_STEAM_SUPPLY__PRESSURE_CG:
            return isSetPressureCG();
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_FLOW_FG:
            return isSetSteamFlowFG();
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_DROP_LAG_TC:
            return isSetSteamPressureDropLagTC();
        case CimPackage.PWR_STEAM_SUPPLY__STEAM_PRESSURE_FG:
            return isSetSteamPressureFG();
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_FACTOR:
            return isSetThrottlePressureFactor();
        case CimPackage.PWR_STEAM_SUPPLY__THROTTLE_PRESSURE_SP:
            return isSetThrottlePressureSP();
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
        result.append( " (coldLegFBLagTC: " );
        if( coldLegFBLagTCESet )
            result.append( coldLegFBLagTC );
        else
            result.append( "<unset>" );
        result.append( ", coldLegFBLeadTC1: " );
        if( coldLegFBLeadTC1ESet )
            result.append( coldLegFBLeadTC1 );
        else
            result.append( "<unset>" );
        result.append( ", coldLegFBLeadTC2: " );
        if( coldLegFBLeadTC2ESet )
            result.append( coldLegFBLeadTC2 );
        else
            result.append( "<unset>" );
        result.append( ", coldLegFG1: " );
        if( coldLegFG1ESet )
            result.append( coldLegFG1 );
        else
            result.append( "<unset>" );
        result.append( ", coldLegFG2: " );
        if( coldLegFG2ESet )
            result.append( coldLegFG2 );
        else
            result.append( "<unset>" );
        result.append( ", coldLegLagTC: " );
        if( coldLegLagTCESet )
            result.append( coldLegLagTC );
        else
            result.append( "<unset>" );
        result.append( ", coreHTLagTC1: " );
        if( coreHTLagTC1ESet )
            result.append( coreHTLagTC1 );
        else
            result.append( "<unset>" );
        result.append( ", coreHTLagTC2: " );
        if( coreHTLagTC2ESet )
            result.append( coreHTLagTC2 );
        else
            result.append( "<unset>" );
        result.append( ", coreNeutronicsEffTC: " );
        if( coreNeutronicsEffTCESet )
            result.append( coreNeutronicsEffTC );
        else
            result.append( "<unset>" );
        result.append( ", coreNeutronicsHT: " );
        if( coreNeutronicsHTESet )
            result.append( coreNeutronicsHT );
        else
            result.append( "<unset>" );
        result.append( ", feedbackFactor: " );
        if( feedbackFactorESet )
            result.append( feedbackFactor );
        else
            result.append( "<unset>" );
        result.append( ", hotLegLagTC: " );
        if( hotLegLagTCESet )
            result.append( hotLegLagTC );
        else
            result.append( "<unset>" );
        result.append( ", hotLegSteamGain: " );
        if( hotLegSteamGainESet )
            result.append( hotLegSteamGain );
        else
            result.append( "<unset>" );
        result.append( ", hotLegToColdLegGain: " );
        if( hotLegToColdLegGainESet )
            result.append( hotLegToColdLegGain );
        else
            result.append( "<unset>" );
        result.append( ", pressureCG: " );
        if( pressureCGESet )
            result.append( pressureCG );
        else
            result.append( "<unset>" );
        result.append( ", steamFlowFG: " );
        if( steamFlowFGESet )
            result.append( steamFlowFG );
        else
            result.append( "<unset>" );
        result.append( ", steamPressureDropLagTC: " );
        if( steamPressureDropLagTCESet )
            result.append( steamPressureDropLagTC );
        else
            result.append( "<unset>" );
        result.append( ", steamPressureFG: " );
        if( steamPressureFGESet )
            result.append( steamPressureFG );
        else
            result.append( "<unset>" );
        result.append( ", throttlePressureFactor: " );
        if( throttlePressureFactorESet )
            result.append( throttlePressureFactor );
        else
            result.append( "<unset>" );
        result.append( ", throttlePressureSP: " );
        if( throttlePressureSPESet )
            result.append( throttlePressureSP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PWRSteamSupplyImpl
