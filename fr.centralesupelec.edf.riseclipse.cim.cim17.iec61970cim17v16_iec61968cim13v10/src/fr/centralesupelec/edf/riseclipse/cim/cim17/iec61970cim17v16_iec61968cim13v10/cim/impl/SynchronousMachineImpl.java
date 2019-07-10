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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoolantType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PrimeMover;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitRotorKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineOperatingMode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getAVRToManualLag <em>AVR To Manual Lag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getAVRToManualLead <em>AVR To Manual Lead</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getBaseQ <em>Base Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getCondenserP <em>Condenser P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getCoolantCondition <em>Coolant Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getCoolantType <em>Coolant Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getEarthing <em>Earthing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getEarthingStarPointR <em>Earthing Star Point R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getEarthingStarPointX <em>Earthing Star Point X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getIkk <em>Ikk</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getManualToAVR <em>Manual To AVR</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getMaxU <em>Max U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getMinU <em>Min U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getQPercent <em>QPercent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getSatDirectSyncX <em>Sat Direct Sync X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getSatDirectTransX <em>Sat Direct Trans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getVoltageRegulationRange <em>Voltage Regulation Range</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getPrimeMovers <em>Prime Movers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineImpl#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineImpl extends RotatingMachineImpl implements SynchronousMachine {
    /**
     * The default value of the '{@link #getAVRToManualLag() <em>AVR To Manual Lag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRToManualLag()
     * @generated
     * @ordered
     */
    protected static final Float AVR_TO_MANUAL_LAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAVRToManualLag() <em>AVR To Manual Lag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRToManualLag()
     * @generated
     * @ordered
     */
    protected Float aVRToManualLag = AVR_TO_MANUAL_LAG_EDEFAULT;

    /**
     * This is true if the AVR To Manual Lag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aVRToManualLagESet;

    /**
     * The default value of the '{@link #getAVRToManualLead() <em>AVR To Manual Lead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRToManualLead()
     * @generated
     * @ordered
     */
    protected static final Float AVR_TO_MANUAL_LEAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAVRToManualLead() <em>AVR To Manual Lead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRToManualLead()
     * @generated
     * @ordered
     */
    protected Float aVRToManualLead = AVR_TO_MANUAL_LEAD_EDEFAULT;

    /**
     * This is true if the AVR To Manual Lead attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aVRToManualLeadESet;

    /**
     * The default value of the '{@link #getBaseQ() <em>Base Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseQ()
     * @generated
     * @ordered
     */
    protected static final Float BASE_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaseQ() <em>Base Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseQ()
     * @generated
     * @ordered
     */
    protected Float baseQ = BASE_Q_EDEFAULT;

    /**
     * This is true if the Base Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseQESet;

    /**
     * The default value of the '{@link #getCondenserP() <em>Condenser P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondenserP()
     * @generated
     * @ordered
     */
    protected static final Float CONDENSER_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCondenserP() <em>Condenser P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondenserP()
     * @generated
     * @ordered
     */
    protected Float condenserP = CONDENSER_P_EDEFAULT;

    /**
     * This is true if the Condenser P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean condenserPESet;

    /**
     * The default value of the '{@link #getCoolantCondition() <em>Coolant Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolantCondition()
     * @generated
     * @ordered
     */
    protected static final Float COOLANT_CONDITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoolantCondition() <em>Coolant Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolantCondition()
     * @generated
     * @ordered
     */
    protected Float coolantCondition = COOLANT_CONDITION_EDEFAULT;

    /**
     * This is true if the Coolant Condition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coolantConditionESet;

    /**
     * The default value of the '{@link #getCoolantType() <em>Coolant Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolantType()
     * @generated
     * @ordered
     */
    protected static final CoolantType COOLANT_TYPE_EDEFAULT = CoolantType.AIR;

    /**
     * The cached value of the '{@link #getCoolantType() <em>Coolant Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolantType()
     * @generated
     * @ordered
     */
    protected CoolantType coolantType = COOLANT_TYPE_EDEFAULT;

    /**
     * This is true if the Coolant Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coolantTypeESet;

    /**
     * The default value of the '{@link #getEarthing() <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthing()
     * @generated
     * @ordered
     */
    protected static final Boolean EARTHING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarthing() <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthing()
     * @generated
     * @ordered
     */
    protected Boolean earthing = EARTHING_EDEFAULT;

    /**
     * This is true if the Earthing attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earthingESet;

    /**
     * The default value of the '{@link #getEarthingStarPointR() <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointR()
     * @generated
     * @ordered
     */
    protected static final Float EARTHING_STAR_POINT_R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarthingStarPointR() <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointR()
     * @generated
     * @ordered
     */
    protected Float earthingStarPointR = EARTHING_STAR_POINT_R_EDEFAULT;

    /**
     * This is true if the Earthing Star Point R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earthingStarPointRESet;

    /**
     * The default value of the '{@link #getEarthingStarPointX() <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointX()
     * @generated
     * @ordered
     */
    protected static final Float EARTHING_STAR_POINT_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEarthingStarPointX() <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEarthingStarPointX()
     * @generated
     * @ordered
     */
    protected Float earthingStarPointX = EARTHING_STAR_POINT_X_EDEFAULT;

    /**
     * This is true if the Earthing Star Point X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean earthingStarPointXESet;

    /**
     * The default value of the '{@link #getIkk() <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIkk()
     * @generated
     * @ordered
     */
    protected static final Float IKK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIkk() <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIkk()
     * @generated
     * @ordered
     */
    protected Float ikk = IKK_EDEFAULT;

    /**
     * This is true if the Ikk attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ikkESet;

    /**
     * The default value of the '{@link #getManualToAVR() <em>Manual To AVR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManualToAVR()
     * @generated
     * @ordered
     */
    protected static final Float MANUAL_TO_AVR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getManualToAVR() <em>Manual To AVR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManualToAVR()
     * @generated
     * @ordered
     */
    protected Float manualToAVR = MANUAL_TO_AVR_EDEFAULT;

    /**
     * This is true if the Manual To AVR attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean manualToAVRESet;

    /**
     * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected static final Float MAX_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected Float maxQ = MAX_Q_EDEFAULT;

    /**
     * This is true if the Max Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxQESet;

    /**
     * The default value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxU()
     * @generated
     * @ordered
     */
    protected static final Float MAX_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxU()
     * @generated
     * @ordered
     */
    protected Float maxU = MAX_U_EDEFAULT;

    /**
     * This is true if the Max U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxUESet;

    /**
     * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected static final Float MIN_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected Float minQ = MIN_Q_EDEFAULT;

    /**
     * This is true if the Min Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minQESet;

    /**
     * The default value of the '{@link #getMinU() <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinU()
     * @generated
     * @ordered
     */
    protected static final Float MIN_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinU() <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinU()
     * @generated
     * @ordered
     */
    protected Float minU = MIN_U_EDEFAULT;

    /**
     * This is true if the Min U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minUESet;

    /**
     * The default value of the '{@link #getMu() <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMu()
     * @generated
     * @ordered
     */
    protected static final Float MU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMu()
     * @generated
     * @ordered
     */
    protected Float mu = MU_EDEFAULT;

    /**
     * This is true if the Mu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean muESet;

    /**
     * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected static final SynchronousMachineOperatingMode OPERATING_MODE_EDEFAULT = SynchronousMachineOperatingMode.GENERATOR;

    /**
     * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected SynchronousMachineOperatingMode operatingMode = OPERATING_MODE_EDEFAULT;

    /**
     * This is true if the Operating Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatingModeESet;

    /**
     * The default value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPercent()
     * @generated
     * @ordered
     */
    protected static final Float QPERCENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPercent()
     * @generated
     * @ordered
     */
    protected Float qPercent = QPERCENT_EDEFAULT;

    /**
     * This is true if the QPercent attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qPercentESet;

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
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2()
     * @generated
     * @ordered
     */
    protected static final Float R2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR2()
     * @generated
     * @ordered
     */
    protected Float r2 = R2_EDEFAULT;

    /**
     * This is true if the R2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r2ESet;

    /**
     * The default value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencePriority()
     * @generated
     * @ordered
     */
    protected static final Integer REFERENCE_PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencePriority()
     * @generated
     * @ordered
     */
    protected Integer referencePriority = REFERENCE_PRIORITY_EDEFAULT;

    /**
     * This is true if the Reference Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean referencePriorityESet;

    /**
     * The default value of the '{@link #getSatDirectSubtransX() <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSubtransX()
     * @generated
     * @ordered
     */
    protected static final Float SAT_DIRECT_SUBTRANS_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSatDirectSubtransX() <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSubtransX()
     * @generated
     * @ordered
     */
    protected Float satDirectSubtransX = SAT_DIRECT_SUBTRANS_X_EDEFAULT;

    /**
     * This is true if the Sat Direct Subtrans X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean satDirectSubtransXESet;

    /**
     * The default value of the '{@link #getSatDirectSyncX() <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSyncX()
     * @generated
     * @ordered
     */
    protected static final Float SAT_DIRECT_SYNC_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSatDirectSyncX() <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectSyncX()
     * @generated
     * @ordered
     */
    protected Float satDirectSyncX = SAT_DIRECT_SYNC_X_EDEFAULT;

    /**
     * This is true if the Sat Direct Sync X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean satDirectSyncXESet;

    /**
     * The default value of the '{@link #getSatDirectTransX() <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectTransX()
     * @generated
     * @ordered
     */
    protected static final Float SAT_DIRECT_TRANS_X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSatDirectTransX() <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSatDirectTransX()
     * @generated
     * @ordered
     */
    protected Float satDirectTransX = SAT_DIRECT_TRANS_X_EDEFAULT;

    /**
     * This is true if the Sat Direct Trans X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean satDirectTransXESet;

    /**
     * The default value of the '{@link #getShortCircuitRotorType() <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitRotorType()
     * @generated
     * @ordered
     */
    protected static final ShortCircuitRotorKind SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT = ShortCircuitRotorKind.SALIENT_POLE1;

    /**
     * The cached value of the '{@link #getShortCircuitRotorType() <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitRotorType()
     * @generated
     * @ordered
     */
    protected ShortCircuitRotorKind shortCircuitRotorType = SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT;

    /**
     * This is true if the Short Circuit Rotor Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortCircuitRotorTypeESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final SynchronousMachineKind TYPE_EDEFAULT = SynchronousMachineKind.GENERATOR;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected SynchronousMachineKind type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The default value of the '{@link #getVoltageRegulationRange() <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageRegulationRange()
     * @generated
     * @ordered
     */
    protected static final Float VOLTAGE_REGULATION_RANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageRegulationRange() <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageRegulationRange()
     * @generated
     * @ordered
     */
    protected Float voltageRegulationRange = VOLTAGE_REGULATION_RANGE_EDEFAULT;

    /**
     * This is true if the Voltage Regulation Range attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageRegulationRangeESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected static final Float X2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX2()
     * @generated
     * @ordered
     */
    protected Float x2 = X2_EDEFAULT;

    /**
     * This is true if the X2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x2ESet;

    /**
     * The cached value of the '{@link #getReactiveCapabilityCurves() <em>Reactive Capability Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReactiveCapabilityCurves()
     * @generated
     * @ordered
     */
    protected EList< ReactiveCapabilityCurve > reactiveCapabilityCurves;

    /**
     * The cached value of the '{@link #getSynchronousMachineDynamics() <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected SynchronousMachineDynamics synchronousMachineDynamics;

    /**
     * This is true if the Synchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineDynamicsESet;

    /**
     * The cached value of the '{@link #getPrimeMovers() <em>Prime Movers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimeMovers()
     * @generated
     * @ordered
     */
    protected EList< PrimeMover > primeMovers;

    /**
     * The cached value of the '{@link #getInitialReactiveCapabilityCurve() <em>Initial Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialReactiveCapabilityCurve()
     * @generated
     * @ordered
     */
    protected ReactiveCapabilityCurve initialReactiveCapabilityCurve;

    /**
     * This is true if the Initial Reactive Capability Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialReactiveCapabilityCurveESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronousMachineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchronousMachine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAVRToManualLag() {
        return aVRToManualLag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAVRToManualLag( Float newAVRToManualLag ) {
        Float oldAVRToManualLag = aVRToManualLag;
        aVRToManualLag = newAVRToManualLag;
        boolean oldAVRToManualLagESet = aVRToManualLagESet;
        aVRToManualLagESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG,
                    oldAVRToManualLag, aVRToManualLag, !oldAVRToManualLagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAVRToManualLag() {
        Float oldAVRToManualLag = aVRToManualLag;
        boolean oldAVRToManualLagESet = aVRToManualLagESet;
        aVRToManualLag = AVR_TO_MANUAL_LAG_EDEFAULT;
        aVRToManualLagESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG,
                    oldAVRToManualLag, AVR_TO_MANUAL_LAG_EDEFAULT, oldAVRToManualLagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAVRToManualLag() {
        return aVRToManualLagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAVRToManualLead() {
        return aVRToManualLead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAVRToManualLead( Float newAVRToManualLead ) {
        Float oldAVRToManualLead = aVRToManualLead;
        aVRToManualLead = newAVRToManualLead;
        boolean oldAVRToManualLeadESet = aVRToManualLeadESet;
        aVRToManualLeadESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD,
                    oldAVRToManualLead, aVRToManualLead, !oldAVRToManualLeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAVRToManualLead() {
        Float oldAVRToManualLead = aVRToManualLead;
        boolean oldAVRToManualLeadESet = aVRToManualLeadESet;
        aVRToManualLead = AVR_TO_MANUAL_LEAD_EDEFAULT;
        aVRToManualLeadESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD,
                        oldAVRToManualLead, AVR_TO_MANUAL_LEAD_EDEFAULT, oldAVRToManualLeadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAVRToManualLead() {
        return aVRToManualLeadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBaseQ() {
        return baseQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseQ( Float newBaseQ ) {
        Float oldBaseQ = baseQ;
        baseQ = newBaseQ;
        boolean oldBaseQESet = baseQESet;
        baseQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__BASE_Q, oldBaseQ, baseQ, !oldBaseQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBaseQ() {
        Float oldBaseQ = baseQ;
        boolean oldBaseQESet = baseQESet;
        baseQ = BASE_Q_EDEFAULT;
        baseQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__BASE_Q, oldBaseQ, BASE_Q_EDEFAULT, oldBaseQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseQ() {
        return baseQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCondenserP() {
        return condenserP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCondenserP( Float newCondenserP ) {
        Float oldCondenserP = condenserP;
        condenserP = newCondenserP;
        boolean oldCondenserPESet = condenserPESet;
        condenserPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__CONDENSER_P, oldCondenserP, condenserP, !oldCondenserPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCondenserP() {
        Float oldCondenserP = condenserP;
        boolean oldCondenserPESet = condenserPESet;
        condenserP = CONDENSER_P_EDEFAULT;
        condenserPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__CONDENSER_P, oldCondenserP, CONDENSER_P_EDEFAULT, oldCondenserPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCondenserP() {
        return condenserPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoolantCondition() {
        return coolantCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoolantCondition( Float newCoolantCondition ) {
        Float oldCoolantCondition = coolantCondition;
        coolantCondition = newCoolantCondition;
        boolean oldCoolantConditionESet = coolantConditionESet;
        coolantConditionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION,
                    oldCoolantCondition, coolantCondition, !oldCoolantConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoolantCondition() {
        Float oldCoolantCondition = coolantCondition;
        boolean oldCoolantConditionESet = coolantConditionESet;
        coolantCondition = COOLANT_CONDITION_EDEFAULT;
        coolantConditionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION,
                    oldCoolantCondition, COOLANT_CONDITION_EDEFAULT, oldCoolantConditionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoolantCondition() {
        return coolantConditionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CoolantType getCoolantType() {
        return coolantType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoolantType( CoolantType newCoolantType ) {
        CoolantType oldCoolantType = coolantType;
        coolantType = newCoolantType == null ? COOLANT_TYPE_EDEFAULT : newCoolantType;
        boolean oldCoolantTypeESet = coolantTypeESet;
        coolantTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE, oldCoolantType, coolantType, !oldCoolantTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoolantType() {
        CoolantType oldCoolantType = coolantType;
        boolean oldCoolantTypeESet = coolantTypeESet;
        coolantType = COOLANT_TYPE_EDEFAULT;
        coolantTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE,
                    oldCoolantType, COOLANT_TYPE_EDEFAULT, oldCoolantTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoolantType() {
        return coolantTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getEarthing() {
        return earthing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarthing( Boolean newEarthing ) {
        Boolean oldEarthing = earthing;
        earthing = newEarthing;
        boolean oldEarthingESet = earthingESet;
        earthingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__EARTHING, oldEarthing, earthing, !oldEarthingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarthing() {
        Boolean oldEarthing = earthing;
        boolean oldEarthingESet = earthingESet;
        earthing = EARTHING_EDEFAULT;
        earthingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__EARTHING, oldEarthing, EARTHING_EDEFAULT, oldEarthingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarthing() {
        return earthingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEarthingStarPointR() {
        return earthingStarPointR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarthingStarPointR( Float newEarthingStarPointR ) {
        Float oldEarthingStarPointR = earthingStarPointR;
        earthingStarPointR = newEarthingStarPointR;
        boolean oldEarthingStarPointRESet = earthingStarPointRESet;
        earthingStarPointRESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R,
                        oldEarthingStarPointR, earthingStarPointR, !oldEarthingStarPointRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarthingStarPointR() {
        Float oldEarthingStarPointR = earthingStarPointR;
        boolean oldEarthingStarPointRESet = earthingStarPointRESet;
        earthingStarPointR = EARTHING_STAR_POINT_R_EDEFAULT;
        earthingStarPointRESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R,
                        oldEarthingStarPointR, EARTHING_STAR_POINT_R_EDEFAULT, oldEarthingStarPointRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarthingStarPointR() {
        return earthingStarPointRESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEarthingStarPointX() {
        return earthingStarPointX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEarthingStarPointX( Float newEarthingStarPointX ) {
        Float oldEarthingStarPointX = earthingStarPointX;
        earthingStarPointX = newEarthingStarPointX;
        boolean oldEarthingStarPointXESet = earthingStarPointXESet;
        earthingStarPointXESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X,
                        oldEarthingStarPointX, earthingStarPointX, !oldEarthingStarPointXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEarthingStarPointX() {
        Float oldEarthingStarPointX = earthingStarPointX;
        boolean oldEarthingStarPointXESet = earthingStarPointXESet;
        earthingStarPointX = EARTHING_STAR_POINT_X_EDEFAULT;
        earthingStarPointXESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X,
                        oldEarthingStarPointX, EARTHING_STAR_POINT_X_EDEFAULT, oldEarthingStarPointXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEarthingStarPointX() {
        return earthingStarPointXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIkk() {
        return ikk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIkk( Float newIkk ) {
        Float oldIkk = ikk;
        ikk = newIkk;
        boolean oldIkkESet = ikkESet;
        ikkESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__IKK, oldIkk, ikk, !oldIkkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIkk() {
        Float oldIkk = ikk;
        boolean oldIkkESet = ikkESet;
        ikk = IKK_EDEFAULT;
        ikkESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__IKK, oldIkk, IKK_EDEFAULT, oldIkkESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIkk() {
        return ikkESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getManualToAVR() {
        return manualToAVR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setManualToAVR( Float newManualToAVR ) {
        Float oldManualToAVR = manualToAVR;
        manualToAVR = newManualToAVR;
        boolean oldManualToAVRESet = manualToAVRESet;
        manualToAVRESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR, oldManualToAVR, manualToAVR, !oldManualToAVRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetManualToAVR() {
        Float oldManualToAVR = manualToAVR;
        boolean oldManualToAVRESet = manualToAVRESet;
        manualToAVR = MANUAL_TO_AVR_EDEFAULT;
        manualToAVRESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR,
                    oldManualToAVR, MANUAL_TO_AVR_EDEFAULT, oldManualToAVRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetManualToAVR() {
        return manualToAVRESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxQ() {
        return maxQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxQ( Float newMaxQ ) {
        Float oldMaxQ = maxQ;
        maxQ = newMaxQ;
        boolean oldMaxQESet = maxQESet;
        maxQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__MAX_Q, oldMaxQ, maxQ, !oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxQ() {
        Float oldMaxQ = maxQ;
        boolean oldMaxQESet = maxQESet;
        maxQ = MAX_Q_EDEFAULT;
        maxQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__MAX_Q, oldMaxQ, MAX_Q_EDEFAULT, oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxQ() {
        return maxQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxU() {
        return maxU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxU( Float newMaxU ) {
        Float oldMaxU = maxU;
        maxU = newMaxU;
        boolean oldMaxUESet = maxUESet;
        maxUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__MAX_U, oldMaxU, maxU, !oldMaxUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxU() {
        Float oldMaxU = maxU;
        boolean oldMaxUESet = maxUESet;
        maxU = MAX_U_EDEFAULT;
        maxUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__MAX_U, oldMaxU, MAX_U_EDEFAULT, oldMaxUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxU() {
        return maxUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinQ() {
        return minQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinQ( Float newMinQ ) {
        Float oldMinQ = minQ;
        minQ = newMinQ;
        boolean oldMinQESet = minQESet;
        minQESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__MIN_Q, oldMinQ, minQ, !oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinQ() {
        Float oldMinQ = minQ;
        boolean oldMinQESet = minQESet;
        minQ = MIN_Q_EDEFAULT;
        minQESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__MIN_Q, oldMinQ, MIN_Q_EDEFAULT, oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinQ() {
        return minQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinU() {
        return minU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinU( Float newMinU ) {
        Float oldMinU = minU;
        minU = newMinU;
        boolean oldMinUESet = minUESet;
        minUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__MIN_U, oldMinU, minU, !oldMinUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinU() {
        Float oldMinU = minU;
        boolean oldMinUESet = minUESet;
        minU = MIN_U_EDEFAULT;
        minUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__MIN_U, oldMinU, MIN_U_EDEFAULT, oldMinUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinU() {
        return minUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMu() {
        return mu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMu( Float newMu ) {
        Float oldMu = mu;
        mu = newMu;
        boolean oldMuESet = muESet;
        muESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__MU, oldMu, mu, !oldMuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMu() {
        Float oldMu = mu;
        boolean oldMuESet = muESet;
        mu = MU_EDEFAULT;
        muESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__MU, oldMu, MU_EDEFAULT, oldMuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMu() {
        return muESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineOperatingMode getOperatingMode() {
        return operatingMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperatingMode( SynchronousMachineOperatingMode newOperatingMode ) {
        SynchronousMachineOperatingMode oldOperatingMode = operatingMode;
        operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE,
                    oldOperatingMode, operatingMode, !oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperatingMode() {
        SynchronousMachineOperatingMode oldOperatingMode = operatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingMode = OPERATING_MODE_EDEFAULT;
        operatingModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE,
                    oldOperatingMode, OPERATING_MODE_EDEFAULT, oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatingMode() {
        return operatingModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQPercent() {
        return qPercent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQPercent( Float newQPercent ) {
        Float oldQPercent = qPercent;
        qPercent = newQPercent;
        boolean oldQPercentESet = qPercentESet;
        qPercentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__QPERCENT, oldQPercent, qPercent, !oldQPercentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQPercent() {
        Float oldQPercent = qPercent;
        boolean oldQPercentESet = qPercentESet;
        qPercent = QPERCENT_EDEFAULT;
        qPercentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__QPERCENT, oldQPercent, QPERCENT_EDEFAULT, oldQPercentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQPercent() {
        return qPercentESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__R, oldR, r, !oldRESet ) );
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
                CimPackage.SYNCHRONOUS_MACHINE__R, oldR, R_EDEFAULT, oldRESet ) );
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
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__R0, oldR0, r0, !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR2() {
        return r2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR2( Float newR2 ) {
        Float oldR2 = r2;
        r2 = newR2;
        boolean oldR2ESet = r2ESet;
        r2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__R2, oldR2, r2, !oldR2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR2() {
        Float oldR2 = r2;
        boolean oldR2ESet = r2ESet;
        r2 = R2_EDEFAULT;
        r2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__R2, oldR2, R2_EDEFAULT, oldR2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR2() {
        return r2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getReferencePriority() {
        return referencePriority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferencePriority( Integer newReferencePriority ) {
        Integer oldReferencePriority = referencePriority;
        referencePriority = newReferencePriority;
        boolean oldReferencePriorityESet = referencePriorityESet;
        referencePriorityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY,
                    oldReferencePriority, referencePriority, !oldReferencePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferencePriority() {
        Integer oldReferencePriority = referencePriority;
        boolean oldReferencePriorityESet = referencePriorityESet;
        referencePriority = REFERENCE_PRIORITY_EDEFAULT;
        referencePriorityESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY,
                        oldReferencePriority, REFERENCE_PRIORITY_EDEFAULT, oldReferencePriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferencePriority() {
        return referencePriorityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSatDirectSubtransX() {
        return satDirectSubtransX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSatDirectSubtransX( Float newSatDirectSubtransX ) {
        Float oldSatDirectSubtransX = satDirectSubtransX;
        satDirectSubtransX = newSatDirectSubtransX;
        boolean oldSatDirectSubtransXESet = satDirectSubtransXESet;
        satDirectSubtransXESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X,
                        oldSatDirectSubtransX, satDirectSubtransX, !oldSatDirectSubtransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSatDirectSubtransX() {
        Float oldSatDirectSubtransX = satDirectSubtransX;
        boolean oldSatDirectSubtransXESet = satDirectSubtransXESet;
        satDirectSubtransX = SAT_DIRECT_SUBTRANS_X_EDEFAULT;
        satDirectSubtransXESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X,
                        oldSatDirectSubtransX, SAT_DIRECT_SUBTRANS_X_EDEFAULT, oldSatDirectSubtransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSatDirectSubtransX() {
        return satDirectSubtransXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSatDirectSyncX() {
        return satDirectSyncX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSatDirectSyncX( Float newSatDirectSyncX ) {
        Float oldSatDirectSyncX = satDirectSyncX;
        satDirectSyncX = newSatDirectSyncX;
        boolean oldSatDirectSyncXESet = satDirectSyncXESet;
        satDirectSyncXESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X,
                    oldSatDirectSyncX, satDirectSyncX, !oldSatDirectSyncXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSatDirectSyncX() {
        Float oldSatDirectSyncX = satDirectSyncX;
        boolean oldSatDirectSyncXESet = satDirectSyncXESet;
        satDirectSyncX = SAT_DIRECT_SYNC_X_EDEFAULT;
        satDirectSyncXESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X,
                    oldSatDirectSyncX, SAT_DIRECT_SYNC_X_EDEFAULT, oldSatDirectSyncXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSatDirectSyncX() {
        return satDirectSyncXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSatDirectTransX() {
        return satDirectTransX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSatDirectTransX( Float newSatDirectTransX ) {
        Float oldSatDirectTransX = satDirectTransX;
        satDirectTransX = newSatDirectTransX;
        boolean oldSatDirectTransXESet = satDirectTransXESet;
        satDirectTransXESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X,
                    oldSatDirectTransX, satDirectTransX, !oldSatDirectTransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSatDirectTransX() {
        Float oldSatDirectTransX = satDirectTransX;
        boolean oldSatDirectTransXESet = satDirectTransXESet;
        satDirectTransX = SAT_DIRECT_TRANS_X_EDEFAULT;
        satDirectTransXESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X,
                        oldSatDirectTransX, SAT_DIRECT_TRANS_X_EDEFAULT, oldSatDirectTransXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSatDirectTransX() {
        return satDirectTransXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ShortCircuitRotorKind getShortCircuitRotorType() {
        return shortCircuitRotorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortCircuitRotorType( ShortCircuitRotorKind newShortCircuitRotorType ) {
        ShortCircuitRotorKind oldShortCircuitRotorType = shortCircuitRotorType;
        shortCircuitRotorType = newShortCircuitRotorType == null ? SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT
                : newShortCircuitRotorType;
        boolean oldShortCircuitRotorTypeESet = shortCircuitRotorTypeESet;
        shortCircuitRotorTypeESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE,
                        oldShortCircuitRotorType, shortCircuitRotorType, !oldShortCircuitRotorTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortCircuitRotorType() {
        ShortCircuitRotorKind oldShortCircuitRotorType = shortCircuitRotorType;
        boolean oldShortCircuitRotorTypeESet = shortCircuitRotorTypeESet;
        shortCircuitRotorType = SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT;
        shortCircuitRotorTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE, oldShortCircuitRotorType,
                SHORT_CIRCUIT_ROTOR_TYPE_EDEFAULT, oldShortCircuitRotorTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortCircuitRotorType() {
        return shortCircuitRotorTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineKind getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( SynchronousMachineKind newType ) {
        SynchronousMachineKind oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        SynchronousMachineKind oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVoltageRegulationRange() {
        return voltageRegulationRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageRegulationRange( Float newVoltageRegulationRange ) {
        Float oldVoltageRegulationRange = voltageRegulationRange;
        voltageRegulationRange = newVoltageRegulationRange;
        boolean oldVoltageRegulationRangeESet = voltageRegulationRangeESet;
        voltageRegulationRangeESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE,
                        oldVoltageRegulationRange, voltageRegulationRange, !oldVoltageRegulationRangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageRegulationRange() {
        Float oldVoltageRegulationRange = voltageRegulationRange;
        boolean oldVoltageRegulationRangeESet = voltageRegulationRangeESet;
        voltageRegulationRange = VOLTAGE_REGULATION_RANGE_EDEFAULT;
        voltageRegulationRangeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE, oldVoltageRegulationRange,
                VOLTAGE_REGULATION_RANGE_EDEFAULT, oldVoltageRegulationRangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageRegulationRange() {
        return voltageRegulationRangeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__X0, oldX0, x0, !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX2() {
        return x2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX2( Float newX2 ) {
        Float oldX2 = x2;
        x2 = newX2;
        boolean oldX2ESet = x2ESet;
        x2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE__X2, oldX2, x2, !oldX2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX2() {
        Float oldX2 = x2;
        boolean oldX2ESet = x2ESet;
        x2 = X2_EDEFAULT;
        x2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE__X2, oldX2, X2_EDEFAULT, oldX2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX2() {
        return x2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReactiveCapabilityCurve > getReactiveCapabilityCurves() {
        if( reactiveCapabilityCurves == null ) {
            reactiveCapabilityCurves = new EObjectWithInverseEList.Unsettable.ManyInverse< ReactiveCapabilityCurve >(
                    ReactiveCapabilityCurve.class, this, CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES,
                    CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES );
        }
        return reactiveCapabilityCurves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReactiveCapabilityCurves() {
        if( reactiveCapabilityCurves != null ) ( ( InternalEList.Unsettable< ? > ) reactiveCapabilityCurves ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReactiveCapabilityCurves() {
        return reactiveCapabilityCurves != null
                && ( ( InternalEList.Unsettable< ? > ) reactiveCapabilityCurves ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineDynamics getSynchronousMachineDynamics() {
        return synchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachineDynamics(
            SynchronousMachineDynamics newSynchronousMachineDynamics, NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = newSynchronousMachineDynamics;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSynchronousMachineDynamics( SynchronousMachineDynamics newSynchronousMachineDynamics ) {
        if( newSynchronousMachineDynamics != synchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                        msgs );
            if( newSynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newSynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                        msgs );
            msgs = basicSetSynchronousMachineDynamics( newSynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, newSynchronousMachineDynamics,
                    newSynchronousMachineDynamics, !oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachineDynamics( NotificationChain msgs ) {
        SynchronousMachineDynamics oldSynchronousMachineDynamics = synchronousMachineDynamics;
        synchronousMachineDynamics = null;
        boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
        synchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, oldSynchronousMachineDynamics, null,
                    oldSynchronousMachineDynamicsESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSynchronousMachineDynamics() {
        if( synchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                    msgs );
            msgs = basicUnsetSynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineDynamicsESet = synchronousMachineDynamicsESet;
            synchronousMachineDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                    oldSynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachineDynamics() {
        return synchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PrimeMover > getPrimeMovers() {
        if( primeMovers == null ) {
            primeMovers = new EObjectWithInverseEList.Unsettable.ManyInverse< PrimeMover >( PrimeMover.class, this,
                    CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS, CimPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES );
        }
        return primeMovers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrimeMovers() {
        if( primeMovers != null ) ( ( InternalEList.Unsettable< ? > ) primeMovers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrimeMovers() {
        return primeMovers != null && ( ( InternalEList.Unsettable< ? > ) primeMovers ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
        return initialReactiveCapabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitialReactiveCapabilityCurve(
            ReactiveCapabilityCurve newInitialReactiveCapabilityCurve, NotificationChain msgs ) {
        ReactiveCapabilityCurve oldInitialReactiveCapabilityCurve = initialReactiveCapabilityCurve;
        initialReactiveCapabilityCurve = newInitialReactiveCapabilityCurve;
        boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
        initialReactiveCapabilityCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE,
                    oldInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve,
                    !oldInitialReactiveCapabilityCurveESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInitialReactiveCapabilityCurve( ReactiveCapabilityCurve newInitialReactiveCapabilityCurve ) {
        if( newInitialReactiveCapabilityCurve != initialReactiveCapabilityCurve ) {
            NotificationChain msgs = null;
            if( initialReactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) initialReactiveCapabilityCurve ).eInverseRemove( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                        ReactiveCapabilityCurve.class, msgs );
            if( newInitialReactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) newInitialReactiveCapabilityCurve ).eInverseAdd( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                        ReactiveCapabilityCurve.class, msgs );
            msgs = basicSetInitialReactiveCapabilityCurve( newInitialReactiveCapabilityCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
            initialReactiveCapabilityCurveESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE,
                    newInitialReactiveCapabilityCurve, newInitialReactiveCapabilityCurve,
                    !oldInitialReactiveCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInitialReactiveCapabilityCurve( NotificationChain msgs ) {
        ReactiveCapabilityCurve oldInitialReactiveCapabilityCurve = initialReactiveCapabilityCurve;
        initialReactiveCapabilityCurve = null;
        boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
        initialReactiveCapabilityCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE,
                    oldInitialReactiveCapabilityCurve, null, oldInitialReactiveCapabilityCurveESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInitialReactiveCapabilityCurve() {
        if( initialReactiveCapabilityCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) initialReactiveCapabilityCurve ).eInverseRemove( this,
                    CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                    ReactiveCapabilityCurve.class, msgs );
            msgs = basicUnsetInitialReactiveCapabilityCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInitialReactiveCapabilityCurveESet = initialReactiveCapabilityCurveESet;
            initialReactiveCapabilityCurveESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE, null, null,
                    oldInitialReactiveCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitialReactiveCapabilityCurve() {
        return initialReactiveCapabilityCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReactiveCapabilityCurves() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            if( synchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) synchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, SynchronousMachineDynamics.class,
                        msgs );
            return basicSetSynchronousMachineDynamics( ( SynchronousMachineDynamics ) otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPrimeMovers() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            if( initialReactiveCapabilityCurve != null )
                msgs = ( ( InternalEObject ) initialReactiveCapabilityCurve ).eInverseRemove( this,
                        CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                        ReactiveCapabilityCurve.class, msgs );
            return basicSetInitialReactiveCapabilityCurve( ( ReactiveCapabilityCurve ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
            return ( ( InternalEList< ? > ) getReactiveCapabilityCurves() ).basicRemove( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetSynchronousMachineDynamics( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
            return ( ( InternalEList< ? > ) getPrimeMovers() ).basicRemove( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            return basicUnsetInitialReactiveCapabilityCurve( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
            return getAVRToManualLag();
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
            return getAVRToManualLead();
        case CimPackage.SYNCHRONOUS_MACHINE__BASE_Q:
            return getBaseQ();
        case CimPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
            return getCondenserP();
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
            return getCoolantCondition();
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
            return getCoolantType();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            return getEarthing();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            return getEarthingStarPointR();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            return getEarthingStarPointX();
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            return getIkk();
        case CimPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
            return getManualToAVR();
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            return getMaxQ();
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_U:
            return getMaxU();
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            return getMinQ();
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_U:
            return getMinU();
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            return getMu();
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            return getOperatingMode();
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            return getQPercent();
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            return getR();
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            return getR0();
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            return getR2();
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            return getReferencePriority();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            return getSatDirectSubtransX();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            return getSatDirectSyncX();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            return getSatDirectTransX();
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            return getShortCircuitRotorType();
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            return getType();
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            return getVoltageRegulationRange();
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            return getX0();
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            return getX2();
        case CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
            return getReactiveCapabilityCurves();
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            return getSynchronousMachineDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
            return getPrimeMovers();
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            return getInitialReactiveCapabilityCurve();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
            setAVRToManualLag( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
            setAVRToManualLead( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__BASE_Q:
            setBaseQ( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
            setCondenserP( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
            setCoolantCondition( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
            setCoolantType( ( CoolantType ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            setEarthing( ( Boolean ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            setEarthingStarPointR( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            setEarthingStarPointX( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            setIkk( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
            setManualToAVR( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            setMaxQ( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_U:
            setMaxU( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            setMinQ( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_U:
            setMinU( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            setMu( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            setOperatingMode( ( SynchronousMachineOperatingMode ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            setQPercent( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            setR2( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            setReferencePriority( ( Integer ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            setSatDirectSubtransX( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            setSatDirectSyncX( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            setSatDirectTransX( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            setShortCircuitRotorType( ( ShortCircuitRotorKind ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            setType( ( SynchronousMachineKind ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            setVoltageRegulationRange( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            setX2( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
            getReactiveCapabilityCurves().clear();
            getReactiveCapabilityCurves().addAll( ( Collection< ? extends ReactiveCapabilityCurve > ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            setSynchronousMachineDynamics( ( SynchronousMachineDynamics ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
            getPrimeMovers().clear();
            getPrimeMovers().addAll( ( Collection< ? extends PrimeMover > ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            setInitialReactiveCapabilityCurve( ( ReactiveCapabilityCurve ) newValue );
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
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
            unsetAVRToManualLag();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
            unsetAVRToManualLead();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__BASE_Q:
            unsetBaseQ();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
            unsetCondenserP();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
            unsetCoolantCondition();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
            unsetCoolantType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            unsetEarthing();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            unsetEarthingStarPointR();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            unsetEarthingStarPointX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            unsetIkk();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
            unsetManualToAVR();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            unsetMaxQ();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_U:
            unsetMaxU();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            unsetMinQ();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_U:
            unsetMinU();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            unsetMu();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            unsetOperatingMode();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            unsetQPercent();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            unsetR();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            unsetR0();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            unsetR2();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            unsetReferencePriority();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            unsetSatDirectSubtransX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            unsetSatDirectSyncX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            unsetSatDirectTransX();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            unsetShortCircuitRotorType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            unsetType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            unsetVoltageRegulationRange();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            unsetX0();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            unsetX2();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
            unsetReactiveCapabilityCurves();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            unsetSynchronousMachineDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
            unsetPrimeMovers();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            unsetInitialReactiveCapabilityCurve();
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
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
            return isSetAVRToManualLag();
        case CimPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
            return isSetAVRToManualLead();
        case CimPackage.SYNCHRONOUS_MACHINE__BASE_Q:
            return isSetBaseQ();
        case CimPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
            return isSetCondenserP();
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
            return isSetCoolantCondition();
        case CimPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
            return isSetCoolantType();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING:
            return isSetEarthing();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_R:
            return isSetEarthingStarPointR();
        case CimPackage.SYNCHRONOUS_MACHINE__EARTHING_STAR_POINT_X:
            return isSetEarthingStarPointX();
        case CimPackage.SYNCHRONOUS_MACHINE__IKK:
            return isSetIkk();
        case CimPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
            return isSetManualToAVR();
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_Q:
            return isSetMaxQ();
        case CimPackage.SYNCHRONOUS_MACHINE__MAX_U:
            return isSetMaxU();
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_Q:
            return isSetMinQ();
        case CimPackage.SYNCHRONOUS_MACHINE__MIN_U:
            return isSetMinU();
        case CimPackage.SYNCHRONOUS_MACHINE__MU:
            return isSetMu();
        case CimPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
            return isSetOperatingMode();
        case CimPackage.SYNCHRONOUS_MACHINE__QPERCENT:
            return isSetQPercent();
        case CimPackage.SYNCHRONOUS_MACHINE__R:
            return isSetR();
        case CimPackage.SYNCHRONOUS_MACHINE__R0:
            return isSetR0();
        case CimPackage.SYNCHRONOUS_MACHINE__R2:
            return isSetR2();
        case CimPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
            return isSetReferencePriority();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SUBTRANS_X:
            return isSetSatDirectSubtransX();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_SYNC_X:
            return isSetSatDirectSyncX();
        case CimPackage.SYNCHRONOUS_MACHINE__SAT_DIRECT_TRANS_X:
            return isSetSatDirectTransX();
        case CimPackage.SYNCHRONOUS_MACHINE__SHORT_CIRCUIT_ROTOR_TYPE:
            return isSetShortCircuitRotorType();
        case CimPackage.SYNCHRONOUS_MACHINE__TYPE:
            return isSetType();
        case CimPackage.SYNCHRONOUS_MACHINE__VOLTAGE_REGULATION_RANGE:
            return isSetVoltageRegulationRange();
        case CimPackage.SYNCHRONOUS_MACHINE__X0:
            return isSetX0();
        case CimPackage.SYNCHRONOUS_MACHINE__X2:
            return isSetX2();
        case CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
            return isSetReactiveCapabilityCurves();
        case CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetSynchronousMachineDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
            return isSetPrimeMovers();
        case CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
            return isSetInitialReactiveCapabilityCurve();
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
        result.append( " (aVRToManualLag: " );
        if( aVRToManualLagESet )
            result.append( aVRToManualLag );
        else
            result.append( "<unset>" );
        result.append( ", aVRToManualLead: " );
        if( aVRToManualLeadESet )
            result.append( aVRToManualLead );
        else
            result.append( "<unset>" );
        result.append( ", baseQ: " );
        if( baseQESet )
            result.append( baseQ );
        else
            result.append( "<unset>" );
        result.append( ", condenserP: " );
        if( condenserPESet )
            result.append( condenserP );
        else
            result.append( "<unset>" );
        result.append( ", coolantCondition: " );
        if( coolantConditionESet )
            result.append( coolantCondition );
        else
            result.append( "<unset>" );
        result.append( ", coolantType: " );
        if( coolantTypeESet )
            result.append( coolantType );
        else
            result.append( "<unset>" );
        result.append( ", earthing: " );
        if( earthingESet )
            result.append( earthing );
        else
            result.append( "<unset>" );
        result.append( ", earthingStarPointR: " );
        if( earthingStarPointRESet )
            result.append( earthingStarPointR );
        else
            result.append( "<unset>" );
        result.append( ", earthingStarPointX: " );
        if( earthingStarPointXESet )
            result.append( earthingStarPointX );
        else
            result.append( "<unset>" );
        result.append( ", ikk: " );
        if( ikkESet )
            result.append( ikk );
        else
            result.append( "<unset>" );
        result.append( ", manualToAVR: " );
        if( manualToAVRESet )
            result.append( manualToAVR );
        else
            result.append( "<unset>" );
        result.append( ", maxQ: " );
        if( maxQESet )
            result.append( maxQ );
        else
            result.append( "<unset>" );
        result.append( ", maxU: " );
        if( maxUESet )
            result.append( maxU );
        else
            result.append( "<unset>" );
        result.append( ", minQ: " );
        if( minQESet )
            result.append( minQ );
        else
            result.append( "<unset>" );
        result.append( ", minU: " );
        if( minUESet )
            result.append( minU );
        else
            result.append( "<unset>" );
        result.append( ", mu: " );
        if( muESet )
            result.append( mu );
        else
            result.append( "<unset>" );
        result.append( ", operatingMode: " );
        if( operatingModeESet )
            result.append( operatingMode );
        else
            result.append( "<unset>" );
        result.append( ", qPercent: " );
        if( qPercentESet )
            result.append( qPercent );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", r2: " );
        if( r2ESet )
            result.append( r2 );
        else
            result.append( "<unset>" );
        result.append( ", referencePriority: " );
        if( referencePriorityESet )
            result.append( referencePriority );
        else
            result.append( "<unset>" );
        result.append( ", satDirectSubtransX: " );
        if( satDirectSubtransXESet )
            result.append( satDirectSubtransX );
        else
            result.append( "<unset>" );
        result.append( ", satDirectSyncX: " );
        if( satDirectSyncXESet )
            result.append( satDirectSyncX );
        else
            result.append( "<unset>" );
        result.append( ", satDirectTransX: " );
        if( satDirectTransXESet )
            result.append( satDirectTransX );
        else
            result.append( "<unset>" );
        result.append( ", shortCircuitRotorType: " );
        if( shortCircuitRotorTypeESet )
            result.append( shortCircuitRotorType );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ", voltageRegulationRange: " );
        if( voltageRegulationRangeESet )
            result.append( voltageRegulationRange );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", x2: " );
        if( x2ESet )
            result.append( x2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SynchronousMachineImpl
