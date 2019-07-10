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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getBaseQ <em>Base Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCondenserP <em>Condenser P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantType <em>Coolant Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthing <em>Earthing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getIkk <em>Ikk</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxU <em>Max U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinU <em>Min U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMu <em>Mu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getQPercent <em>QPercent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR2 <em>R2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX2 <em>X2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine()
 * @model
 * @generated
 */
public interface SynchronousMachine extends RotatingMachine {
    /**
     * Returns the value of the '<em><b>AVR To Manual Lag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AVR To Manual Lag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>AVR To Manual Lag</em>' attribute.
     * @see #isSetAVRToManualLag()
     * @see #unsetAVRToManualLag()
     * @see #setAVRToManualLag(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_AVRToManualLag()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.aVRToManualLag' kind='element'"
     * @generated
     */
    Float getAVRToManualLag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AVR To Manual Lag</em>' attribute.
     * @see #isSetAVRToManualLag()
     * @see #unsetAVRToManualLag()
     * @see #getAVRToManualLag()
     * @generated
     */
    void setAVRToManualLag( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAVRToManualLag()
     * @see #getAVRToManualLag()
     * @see #setAVRToManualLag(Float)
     * @generated
     */
    void unsetAVRToManualLag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AVR To Manual Lag</em>' attribute is set.
     * @see #unsetAVRToManualLag()
     * @see #getAVRToManualLag()
     * @see #setAVRToManualLag(Float)
     * @generated
     */
    boolean isSetAVRToManualLag();

    /**
     * Returns the value of the '<em><b>AVR To Manual Lead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AVR To Manual Lead</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>AVR To Manual Lead</em>' attribute.
     * @see #isSetAVRToManualLead()
     * @see #unsetAVRToManualLead()
     * @see #setAVRToManualLead(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_AVRToManualLead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.aVRToManualLead' kind='element'"
     * @generated
     */
    Float getAVRToManualLead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AVR To Manual Lead</em>' attribute.
     * @see #isSetAVRToManualLead()
     * @see #unsetAVRToManualLead()
     * @see #getAVRToManualLead()
     * @generated
     */
    void setAVRToManualLead( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAVRToManualLead()
     * @see #getAVRToManualLead()
     * @see #setAVRToManualLead(Float)
     * @generated
     */
    void unsetAVRToManualLead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AVR To Manual Lead</em>' attribute is set.
     * @see #unsetAVRToManualLead()
     * @see #getAVRToManualLead()
     * @see #setAVRToManualLead(Float)
     * @generated
     */
    boolean isSetAVRToManualLead();

    /**
     * Returns the value of the '<em><b>Base Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Q</em>' attribute.
     * @see #isSetBaseQ()
     * @see #unsetBaseQ()
     * @see #setBaseQ(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_BaseQ()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.baseQ' kind='element'"
     * @generated
     */
    Float getBaseQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getBaseQ <em>Base Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Q</em>' attribute.
     * @see #isSetBaseQ()
     * @see #unsetBaseQ()
     * @see #getBaseQ()
     * @generated
     */
    void setBaseQ( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getBaseQ <em>Base Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseQ()
     * @see #getBaseQ()
     * @see #setBaseQ(Float)
     * @generated
     */
    void unsetBaseQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getBaseQ <em>Base Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Q</em>' attribute is set.
     * @see #unsetBaseQ()
     * @see #getBaseQ()
     * @see #setBaseQ(Float)
     * @generated
     */
    boolean isSetBaseQ();

    /**
     * Returns the value of the '<em><b>Condenser P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condenser P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condenser P</em>' attribute.
     * @see #isSetCondenserP()
     * @see #unsetCondenserP()
     * @see #setCondenserP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_CondenserP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.condenserP' kind='element'"
     * @generated
     */
    Float getCondenserP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCondenserP <em>Condenser P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condenser P</em>' attribute.
     * @see #isSetCondenserP()
     * @see #unsetCondenserP()
     * @see #getCondenserP()
     * @generated
     */
    void setCondenserP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCondenserP <em>Condenser P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCondenserP()
     * @see #getCondenserP()
     * @see #setCondenserP(Float)
     * @generated
     */
    void unsetCondenserP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCondenserP <em>Condenser P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Condenser P</em>' attribute is set.
     * @see #unsetCondenserP()
     * @see #getCondenserP()
     * @see #setCondenserP(Float)
     * @generated
     */
    boolean isSetCondenserP();

    /**
     * Returns the value of the '<em><b>Coolant Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Coolant Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Coolant Condition</em>' attribute.
     * @see #isSetCoolantCondition()
     * @see #unsetCoolantCondition()
     * @see #setCoolantCondition(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_CoolantCondition()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.coolantCondition' kind='element'"
     * @generated
     */
    Float getCoolantCondition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Coolant Condition</em>' attribute.
     * @see #isSetCoolantCondition()
     * @see #unsetCoolantCondition()
     * @see #getCoolantCondition()
     * @generated
     */
    void setCoolantCondition( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoolantCondition()
     * @see #getCoolantCondition()
     * @see #setCoolantCondition(Float)
     * @generated
     */
    void unsetCoolantCondition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Coolant Condition</em>' attribute is set.
     * @see #unsetCoolantCondition()
     * @see #getCoolantCondition()
     * @see #setCoolantCondition(Float)
     * @generated
     */
    boolean isSetCoolantCondition();

    /**
     * Returns the value of the '<em><b>Coolant Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoolantType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Coolant Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Coolant Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoolantType
     * @see #isSetCoolantType()
     * @see #unsetCoolantType()
     * @see #setCoolantType(CoolantType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_CoolantType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.coolantType' kind='element'"
     * @generated
     */
    CoolantType getCoolantType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantType <em>Coolant Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Coolant Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoolantType
     * @see #isSetCoolantType()
     * @see #unsetCoolantType()
     * @see #getCoolantType()
     * @generated
     */
    void setCoolantType( CoolantType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantType <em>Coolant Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoolantType()
     * @see #getCoolantType()
     * @see #setCoolantType(CoolantType)
     * @generated
     */
    void unsetCoolantType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getCoolantType <em>Coolant Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Coolant Type</em>' attribute is set.
     * @see #unsetCoolantType()
     * @see #getCoolantType()
     * @see #setCoolantType(CoolantType)
     * @generated
     */
    boolean isSetCoolantType();

    /**
     * Returns the value of the '<em><b>Earthing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Earthing</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Earthing</em>' attribute.
     * @see #isSetEarthing()
     * @see #unsetEarthing()
     * @see #setEarthing(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_Earthing()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.earthing' kind='element'"
     * @generated
     */
    Boolean getEarthing();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthing <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earthing</em>' attribute.
     * @see #isSetEarthing()
     * @see #unsetEarthing()
     * @see #getEarthing()
     * @generated
     */
    void setEarthing( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthing <em>Earthing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarthing()
     * @see #getEarthing()
     * @see #setEarthing(Boolean)
     * @generated
     */
    void unsetEarthing();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthing <em>Earthing</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earthing</em>' attribute is set.
     * @see #unsetEarthing()
     * @see #getEarthing()
     * @see #setEarthing(Boolean)
     * @generated
     */
    boolean isSetEarthing();

    /**
     * Returns the value of the '<em><b>Earthing Star Point R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Earthing Star Point R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Earthing Star Point R</em>' attribute.
     * @see #isSetEarthingStarPointR()
     * @see #unsetEarthingStarPointR()
     * @see #setEarthingStarPointR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_EarthingStarPointR()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.earthingStarPointR' kind='element'"
     * @generated
     */
    Float getEarthingStarPointR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earthing Star Point R</em>' attribute.
     * @see #isSetEarthingStarPointR()
     * @see #unsetEarthingStarPointR()
     * @see #getEarthingStarPointR()
     * @generated
     */
    void setEarthingStarPointR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarthingStarPointR()
     * @see #getEarthingStarPointR()
     * @see #setEarthingStarPointR(Float)
     * @generated
     */
    void unsetEarthingStarPointR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointR <em>Earthing Star Point R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earthing Star Point R</em>' attribute is set.
     * @see #unsetEarthingStarPointR()
     * @see #getEarthingStarPointR()
     * @see #setEarthingStarPointR(Float)
     * @generated
     */
    boolean isSetEarthingStarPointR();

    /**
     * Returns the value of the '<em><b>Earthing Star Point X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Earthing Star Point X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Earthing Star Point X</em>' attribute.
     * @see #isSetEarthingStarPointX()
     * @see #unsetEarthingStarPointX()
     * @see #setEarthingStarPointX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_EarthingStarPointX()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.earthingStarPointX' kind='element'"
     * @generated
     */
    Float getEarthingStarPointX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earthing Star Point X</em>' attribute.
     * @see #isSetEarthingStarPointX()
     * @see #unsetEarthingStarPointX()
     * @see #getEarthingStarPointX()
     * @generated
     */
    void setEarthingStarPointX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarthingStarPointX()
     * @see #getEarthingStarPointX()
     * @see #setEarthingStarPointX(Float)
     * @generated
     */
    void unsetEarthingStarPointX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getEarthingStarPointX <em>Earthing Star Point X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earthing Star Point X</em>' attribute is set.
     * @see #unsetEarthingStarPointX()
     * @see #getEarthingStarPointX()
     * @see #setEarthingStarPointX(Float)
     * @generated
     */
    boolean isSetEarthingStarPointX();

    /**
     * Returns the value of the '<em><b>Ikk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ikk</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ikk</em>' attribute.
     * @see #isSetIkk()
     * @see #unsetIkk()
     * @see #setIkk(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_Ikk()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.ikk' kind='element'"
     * @generated
     */
    Float getIkk();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getIkk <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ikk</em>' attribute.
     * @see #isSetIkk()
     * @see #unsetIkk()
     * @see #getIkk()
     * @generated
     */
    void setIkk( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getIkk <em>Ikk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIkk()
     * @see #getIkk()
     * @see #setIkk(Float)
     * @generated
     */
    void unsetIkk();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getIkk <em>Ikk</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ikk</em>' attribute is set.
     * @see #unsetIkk()
     * @see #getIkk()
     * @see #setIkk(Float)
     * @generated
     */
    boolean isSetIkk();

    /**
     * Returns the value of the '<em><b>Manual To AVR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manual To AVR</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manual To AVR</em>' attribute.
     * @see #isSetManualToAVR()
     * @see #unsetManualToAVR()
     * @see #setManualToAVR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_ManualToAVR()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.manualToAVR' kind='element'"
     * @generated
     */
    Float getManualToAVR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manual To AVR</em>' attribute.
     * @see #isSetManualToAVR()
     * @see #unsetManualToAVR()
     * @see #getManualToAVR()
     * @generated
     */
    void setManualToAVR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetManualToAVR()
     * @see #getManualToAVR()
     * @see #setManualToAVR(Float)
     * @generated
     */
    void unsetManualToAVR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Manual To AVR</em>' attribute is set.
     * @see #unsetManualToAVR()
     * @see #getManualToAVR()
     * @see #setManualToAVR(Float)
     * @generated
     */
    boolean isSetManualToAVR();

    /**
     * Returns the value of the '<em><b>Max Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #setMaxQ(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_MaxQ()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.maxQ' kind='element'"
     * @generated
     */
    Float getMaxQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @generated
     */
    void setMaxQ( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Float)
     * @generated
     */
    void unsetMaxQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Q</em>' attribute is set.
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Float)
     * @generated
     */
    boolean isSetMaxQ();

    /**
     * Returns the value of the '<em><b>Max U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max U</em>' attribute.
     * @see #isSetMaxU()
     * @see #unsetMaxU()
     * @see #setMaxU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_MaxU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.maxU' kind='element'"
     * @generated
     */
    Float getMaxU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxU <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max U</em>' attribute.
     * @see #isSetMaxU()
     * @see #unsetMaxU()
     * @see #getMaxU()
     * @generated
     */
    void setMaxU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxU <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxU()
     * @see #getMaxU()
     * @see #setMaxU(Float)
     * @generated
     */
    void unsetMaxU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMaxU <em>Max U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max U</em>' attribute is set.
     * @see #unsetMaxU()
     * @see #getMaxU()
     * @see #setMaxU(Float)
     * @generated
     */
    boolean isSetMaxU();

    /**
     * Returns the value of the '<em><b>Min Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #setMinQ(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_MinQ()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.minQ' kind='element'"
     * @generated
     */
    Float getMinQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @generated
     */
    void setMinQ( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Float)
     * @generated
     */
    void unsetMinQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Q</em>' attribute is set.
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Float)
     * @generated
     */
    boolean isSetMinQ();

    /**
     * Returns the value of the '<em><b>Min U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min U</em>' attribute.
     * @see #isSetMinU()
     * @see #unsetMinU()
     * @see #setMinU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_MinU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.minU' kind='element'"
     * @generated
     */
    Float getMinU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinU <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min U</em>' attribute.
     * @see #isSetMinU()
     * @see #unsetMinU()
     * @see #getMinU()
     * @generated
     */
    void setMinU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinU <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinU()
     * @see #getMinU()
     * @see #setMinU(Float)
     * @generated
     */
    void unsetMinU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMinU <em>Min U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min U</em>' attribute is set.
     * @see #unsetMinU()
     * @see #getMinU()
     * @see #setMinU(Float)
     * @generated
     */
    boolean isSetMinU();

    /**
     * Returns the value of the '<em><b>Mu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mu</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mu</em>' attribute.
     * @see #isSetMu()
     * @see #unsetMu()
     * @see #setMu(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_Mu()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.mu' kind='element'"
     * @generated
     */
    Float getMu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMu <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mu</em>' attribute.
     * @see #isSetMu()
     * @see #unsetMu()
     * @see #getMu()
     * @generated
     */
    void setMu( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMu <em>Mu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMu()
     * @see #getMu()
     * @see #setMu(Float)
     * @generated
     */
    void unsetMu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getMu <em>Mu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mu</em>' attribute is set.
     * @see #unsetMu()
     * @see #getMu()
     * @see #setMu(Float)
     * @generated
     */
    boolean isSetMu();

    /**
     * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineOperatingMode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineOperatingMode
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #setOperatingMode(SynchronousMachineOperatingMode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_OperatingMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.operatingMode' kind='element'"
     * @generated
     */
    SynchronousMachineOperatingMode getOperatingMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineOperatingMode
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @generated
     */
    void setOperatingMode( SynchronousMachineOperatingMode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(SynchronousMachineOperatingMode)
     * @generated
     */
    void unsetOperatingMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operating Mode</em>' attribute is set.
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(SynchronousMachineOperatingMode)
     * @generated
     */
    boolean isSetOperatingMode();

    /**
     * Returns the value of the '<em><b>QPercent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QPercent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QPercent</em>' attribute.
     * @see #isSetQPercent()
     * @see #unsetQPercent()
     * @see #setQPercent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_QPercent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.qPercent' kind='element'"
     * @generated
     */
    Float getQPercent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QPercent</em>' attribute.
     * @see #isSetQPercent()
     * @see #unsetQPercent()
     * @see #getQPercent()
     * @generated
     */
    void setQPercent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQPercent()
     * @see #getQPercent()
     * @see #setQPercent(Float)
     * @generated
     */
    void unsetQPercent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QPercent</em>' attribute is set.
     * @see #unsetQPercent()
     * @see #getQPercent()
     * @see #setQPercent(Float)
     * @generated
     */
    boolean isSetQPercent();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_R()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.r' kind='element'"
     * @generated
     */
    Float getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Float)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_R0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.r0' kind='element'"
     * @generated
     */
    Float getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #getR0()
     * @generated
     */
    void setR0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Float)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR0 <em>R0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R0</em>' attribute is set.
     * @see #unsetR0()
     * @see #getR0()
     * @see #setR0(Float)
     * @generated
     */
    boolean isSetR0();

    /**
     * Returns the value of the '<em><b>R2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R2</em>' attribute.
     * @see #isSetR2()
     * @see #unsetR2()
     * @see #setR2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_R2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.r2' kind='element'"
     * @generated
     */
    Float getR2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR2 <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R2</em>' attribute.
     * @see #isSetR2()
     * @see #unsetR2()
     * @see #getR2()
     * @generated
     */
    void setR2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR2 <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR2()
     * @see #getR2()
     * @see #setR2(Float)
     * @generated
     */
    void unsetR2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getR2 <em>R2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R2</em>' attribute is set.
     * @see #unsetR2()
     * @see #getR2()
     * @see #setR2(Float)
     * @generated
     */
    boolean isSetR2();

    /**
     * Returns the value of the '<em><b>Reference Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #setReferencePriority(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_ReferencePriority()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.referencePriority' kind='element'"
     * @generated
     */
    Integer getReferencePriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @generated
     */
    void setReferencePriority( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(Integer)
     * @generated
     */
    void unsetReferencePriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reference Priority</em>' attribute is set.
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(Integer)
     * @generated
     */
    boolean isSetReferencePriority();

    /**
     * Returns the value of the '<em><b>Sat Direct Subtrans X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sat Direct Subtrans X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sat Direct Subtrans X</em>' attribute.
     * @see #isSetSatDirectSubtransX()
     * @see #unsetSatDirectSubtransX()
     * @see #setSatDirectSubtransX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_SatDirectSubtransX()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.satDirectSubtransX' kind='element'"
     * @generated
     */
    Float getSatDirectSubtransX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sat Direct Subtrans X</em>' attribute.
     * @see #isSetSatDirectSubtransX()
     * @see #unsetSatDirectSubtransX()
     * @see #getSatDirectSubtransX()
     * @generated
     */
    void setSatDirectSubtransX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSatDirectSubtransX()
     * @see #getSatDirectSubtransX()
     * @see #setSatDirectSubtransX(Float)
     * @generated
     */
    void unsetSatDirectSubtransX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSubtransX <em>Sat Direct Subtrans X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sat Direct Subtrans X</em>' attribute is set.
     * @see #unsetSatDirectSubtransX()
     * @see #getSatDirectSubtransX()
     * @see #setSatDirectSubtransX(Float)
     * @generated
     */
    boolean isSetSatDirectSubtransX();

    /**
     * Returns the value of the '<em><b>Sat Direct Sync X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sat Direct Sync X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sat Direct Sync X</em>' attribute.
     * @see #isSetSatDirectSyncX()
     * @see #unsetSatDirectSyncX()
     * @see #setSatDirectSyncX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_SatDirectSyncX()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.satDirectSyncX' kind='element'"
     * @generated
     */
    Float getSatDirectSyncX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sat Direct Sync X</em>' attribute.
     * @see #isSetSatDirectSyncX()
     * @see #unsetSatDirectSyncX()
     * @see #getSatDirectSyncX()
     * @generated
     */
    void setSatDirectSyncX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSatDirectSyncX()
     * @see #getSatDirectSyncX()
     * @see #setSatDirectSyncX(Float)
     * @generated
     */
    void unsetSatDirectSyncX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectSyncX <em>Sat Direct Sync X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sat Direct Sync X</em>' attribute is set.
     * @see #unsetSatDirectSyncX()
     * @see #getSatDirectSyncX()
     * @see #setSatDirectSyncX(Float)
     * @generated
     */
    boolean isSetSatDirectSyncX();

    /**
     * Returns the value of the '<em><b>Sat Direct Trans X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sat Direct Trans X</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sat Direct Trans X</em>' attribute.
     * @see #isSetSatDirectTransX()
     * @see #unsetSatDirectTransX()
     * @see #setSatDirectTransX(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_SatDirectTransX()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.satDirectTransX' kind='element'"
     * @generated
     */
    Float getSatDirectTransX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sat Direct Trans X</em>' attribute.
     * @see #isSetSatDirectTransX()
     * @see #unsetSatDirectTransX()
     * @see #getSatDirectTransX()
     * @generated
     */
    void setSatDirectTransX( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSatDirectTransX()
     * @see #getSatDirectTransX()
     * @see #setSatDirectTransX(Float)
     * @generated
     */
    void unsetSatDirectTransX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSatDirectTransX <em>Sat Direct Trans X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sat Direct Trans X</em>' attribute is set.
     * @see #unsetSatDirectTransX()
     * @see #getSatDirectTransX()
     * @see #setSatDirectTransX(Float)
     * @generated
     */
    boolean isSetSatDirectTransX();

    /**
     * Returns the value of the '<em><b>Short Circuit Rotor Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitRotorKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short Circuit Rotor Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short Circuit Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitRotorKind
     * @see #isSetShortCircuitRotorType()
     * @see #unsetShortCircuitRotorType()
     * @see #setShortCircuitRotorType(ShortCircuitRotorKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_ShortCircuitRotorType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.shortCircuitRotorType' kind='element'"
     * @generated
     */
    ShortCircuitRotorKind getShortCircuitRotorType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Circuit Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitRotorKind
     * @see #isSetShortCircuitRotorType()
     * @see #unsetShortCircuitRotorType()
     * @see #getShortCircuitRotorType()
     * @generated
     */
    void setShortCircuitRotorType( ShortCircuitRotorKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShortCircuitRotorType()
     * @see #getShortCircuitRotorType()
     * @see #setShortCircuitRotorType(ShortCircuitRotorKind)
     * @generated
     */
    void unsetShortCircuitRotorType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getShortCircuitRotorType <em>Short Circuit Rotor Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Short Circuit Rotor Type</em>' attribute is set.
     * @see #unsetShortCircuitRotorType()
     * @see #getShortCircuitRotorType()
     * @see #setShortCircuitRotorType(ShortCircuitRotorKind)
     * @generated
     */
    boolean isSetShortCircuitRotorType();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(SynchronousMachineKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_Type()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.type' kind='element'"
     * @generated
     */
    SynchronousMachineKind getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( SynchronousMachineKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(SynchronousMachineKind)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(SynchronousMachineKind)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Voltage Regulation Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Regulation Range</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Regulation Range</em>' attribute.
     * @see #isSetVoltageRegulationRange()
     * @see #unsetVoltageRegulationRange()
     * @see #setVoltageRegulationRange(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_VoltageRegulationRange()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.voltageRegulationRange' kind='element'"
     * @generated
     */
    Float getVoltageRegulationRange();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Regulation Range</em>' attribute.
     * @see #isSetVoltageRegulationRange()
     * @see #unsetVoltageRegulationRange()
     * @see #getVoltageRegulationRange()
     * @generated
     */
    void setVoltageRegulationRange( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageRegulationRange()
     * @see #getVoltageRegulationRange()
     * @see #setVoltageRegulationRange(Float)
     * @generated
     */
    void unsetVoltageRegulationRange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getVoltageRegulationRange <em>Voltage Regulation Range</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Regulation Range</em>' attribute is set.
     * @see #unsetVoltageRegulationRange()
     * @see #getVoltageRegulationRange()
     * @see #setVoltageRegulationRange(Float)
     * @generated
     */
    boolean isSetVoltageRegulationRange();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X0</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_X0()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.x0' kind='element'"
     * @generated
     */
    Float getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #getX0()
     * @generated
     */
    void setX0( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Float)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX0 <em>X0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X0</em>' attribute is set.
     * @see #unsetX0()
     * @see #getX0()
     * @see #setX0(Float)
     * @generated
     */
    boolean isSetX0();

    /**
     * Returns the value of the '<em><b>X2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X2</em>' attribute.
     * @see #isSetX2()
     * @see #unsetX2()
     * @see #setX2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_X2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.x2' kind='element'"
     * @generated
     */
    Float getX2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX2 <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2</em>' attribute.
     * @see #isSetX2()
     * @see #unsetX2()
     * @see #getX2()
     * @generated
     */
    void setX2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX2 <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX2()
     * @see #getX2()
     * @see #setX2(Float)
     * @generated
     */
    void unsetX2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getX2 <em>X2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X2</em>' attribute is set.
     * @see #unsetX2()
     * @see #getX2()
     * @see #setX2(Float)
     * @generated
     */
    boolean isSetX2();

    /**
     * Returns the value of the '<em><b>Reactive Capability Curves</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reactive Capability Curves</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reactive Capability Curves</em>' reference list.
     * @see #isSetReactiveCapabilityCurves()
     * @see #unsetReactiveCapabilityCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_ReactiveCapabilityCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getSynchronousMachines
     * @model opposite="SynchronousMachines" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.ReactiveCapabilityCurves' kind='element'"
     * @generated
     */
    EList< ReactiveCapabilityCurve > getReactiveCapabilityCurves();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReactiveCapabilityCurves()
     * @see #getReactiveCapabilityCurves()
     * @generated
     */
    void unsetReactiveCapabilityCurves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reactive Capability Curves</em>' reference list is set.
     * @see #unsetReactiveCapabilityCurves()
     * @see #getReactiveCapabilityCurves()
     * @generated
     */
    boolean isSetReactiveCapabilityCurves();

    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics#getSynchronousMachine <em>Synchronous Machine</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronous Machine Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDynamics#getSynchronousMachine
     * @model opposite="SynchronousMachine" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.SynchronousMachineDynamics' kind='element'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @generated
     */
    void setSynchronousMachineDynamics( SynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machine Dynamics</em>' reference is set.
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    boolean isSetSynchronousMachineDynamics();

    /**
     * Returns the value of the '<em><b>Prime Movers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PrimeMover}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prime Movers</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prime Movers</em>' reference list.
     * @see #isSetPrimeMovers()
     * @see #unsetPrimeMovers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_PrimeMovers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PrimeMover#getSynchronousMachines
     * @model opposite="SynchronousMachines" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.PrimeMovers' kind='element'"
     * @generated
     */
    EList< PrimeMover > getPrimeMovers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrimeMovers()
     * @see #getPrimeMovers()
     * @generated
     */
    void unsetPrimeMovers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prime Movers</em>' reference list is set.
     * @see #unsetPrimeMovers()
     * @see #getPrimeMovers()
     * @generated
     */
    boolean isSetPrimeMovers();

    /**
     * Returns the value of the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Reactive Capability Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Reactive Capability Curve</em>' reference.
     * @see #isSetInitialReactiveCapabilityCurve()
     * @see #unsetInitialReactiveCapabilityCurve()
     * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachine_InitialReactiveCapabilityCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines
     * @model opposite="InitiallyUsedBySynchronousMachines" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachine.InitialReactiveCapabilityCurve' kind='element'"
     * @generated
     */
    ReactiveCapabilityCurve getInitialReactiveCapabilityCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Reactive Capability Curve</em>' reference.
     * @see #isSetInitialReactiveCapabilityCurve()
     * @see #unsetInitialReactiveCapabilityCurve()
     * @see #getInitialReactiveCapabilityCurve()
     * @generated
     */
    void setInitialReactiveCapabilityCurve( ReactiveCapabilityCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitialReactiveCapabilityCurve()
     * @see #getInitialReactiveCapabilityCurve()
     * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @generated
     */
    void unsetInitialReactiveCapabilityCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initial Reactive Capability Curve</em>' reference is set.
     * @see #unsetInitialReactiveCapabilityCurve()
     * @see #getInitialReactiveCapabilityCurve()
     * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @generated
     */
    boolean isSetInitialReactiveCapabilityCurve();

} // SynchronousMachine
