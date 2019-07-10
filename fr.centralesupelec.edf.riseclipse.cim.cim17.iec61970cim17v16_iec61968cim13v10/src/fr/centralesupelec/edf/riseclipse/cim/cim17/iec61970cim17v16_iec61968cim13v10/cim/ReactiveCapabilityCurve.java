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
 * A representation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getEquivalentInjection <em>Equivalent Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReactiveCapabilityCurve()
 * @model
 * @generated
 */
public interface ReactiveCapabilityCurve extends Curve {
    /**
     * Returns the value of the '<em><b>Coolant Temperature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Coolant Temperature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Coolant Temperature</em>' attribute.
     * @see #isSetCoolantTemperature()
     * @see #unsetCoolantTemperature()
     * @see #setCoolantTemperature(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReactiveCapabilityCurve_CoolantTemperature()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReactiveCapabilityCurve.coolantTemperature' kind='element'"
     * @generated
     */
    Float getCoolantTemperature();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Coolant Temperature</em>' attribute.
     * @see #isSetCoolantTemperature()
     * @see #unsetCoolantTemperature()
     * @see #getCoolantTemperature()
     * @generated
     */
    void setCoolantTemperature( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoolantTemperature()
     * @see #getCoolantTemperature()
     * @see #setCoolantTemperature(Float)
     * @generated
     */
    void unsetCoolantTemperature();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getCoolantTemperature <em>Coolant Temperature</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Coolant Temperature</em>' attribute is set.
     * @see #unsetCoolantTemperature()
     * @see #getCoolantTemperature()
     * @see #setCoolantTemperature(Float)
     * @generated
     */
    boolean isSetCoolantTemperature();

    /**
     * Returns the value of the '<em><b>Hydrogen Pressure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydrogen Pressure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydrogen Pressure</em>' attribute.
     * @see #isSetHydrogenPressure()
     * @see #unsetHydrogenPressure()
     * @see #setHydrogenPressure(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReactiveCapabilityCurve_HydrogenPressure()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReactiveCapabilityCurve.hydrogenPressure' kind='element'"
     * @generated
     */
    Float getHydrogenPressure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydrogen Pressure</em>' attribute.
     * @see #isSetHydrogenPressure()
     * @see #unsetHydrogenPressure()
     * @see #getHydrogenPressure()
     * @generated
     */
    void setHydrogenPressure( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydrogenPressure()
     * @see #getHydrogenPressure()
     * @see #setHydrogenPressure(Float)
     * @generated
     */
    void unsetHydrogenPressure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getHydrogenPressure <em>Hydrogen Pressure</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydrogen Pressure</em>' attribute is set.
     * @see #unsetHydrogenPressure()
     * @see #getHydrogenPressure()
     * @see #setHydrogenPressure(Float)
     * @generated
     */
    boolean isSetHydrogenPressure();

    /**
     * Returns the value of the '<em><b>Equivalent Injection</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentInjection}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentInjection#getReactiveCapabilityCurve <em>Reactive Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equivalent Injection</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equivalent Injection</em>' reference list.
     * @see #isSetEquivalentInjection()
     * @see #unsetEquivalentInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReactiveCapabilityCurve_EquivalentInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentInjection#getReactiveCapabilityCurve
     * @model opposite="ReactiveCapabilityCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReactiveCapabilityCurve.EquivalentInjection' kind='element'"
     * @generated
     */
    EList< EquivalentInjection > getEquivalentInjection();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getEquivalentInjection <em>Equivalent Injection</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquivalentInjection()
     * @see #getEquivalentInjection()
     * @generated
     */
    void unsetEquivalentInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getEquivalentInjection <em>Equivalent Injection</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equivalent Injection</em>' reference list is set.
     * @see #unsetEquivalentInjection()
     * @see #getEquivalentInjection()
     * @generated
     */
    boolean isSetEquivalentInjection();

    /**
     * Returns the value of the '<em><b>Initially Used By Synchronous Machines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initially Used By Synchronous Machines</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initially Used By Synchronous Machines</em>' reference list.
     * @see #isSetInitiallyUsedBySynchronousMachines()
     * @see #unsetInitiallyUsedBySynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReactiveCapabilityCurve_InitiallyUsedBySynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getInitialReactiveCapabilityCurve
     * @model opposite="InitialReactiveCapabilityCurve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReactiveCapabilityCurve.InitiallyUsedBySynchronousMachines' kind='element'"
     * @generated
     */
    EList< SynchronousMachine > getInitiallyUsedBySynchronousMachines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitiallyUsedBySynchronousMachines()
     * @see #getInitiallyUsedBySynchronousMachines()
     * @generated
     */
    void unsetInitiallyUsedBySynchronousMachines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initially Used By Synchronous Machines</em>' reference list is set.
     * @see #unsetInitiallyUsedBySynchronousMachines()
     * @see #getInitiallyUsedBySynchronousMachines()
     * @generated
     */
    boolean isSetInitiallyUsedBySynchronousMachines();

    /**
     * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronous Machines</em>' reference list.
     * @see #isSetSynchronousMachines()
     * @see #unsetSynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReactiveCapabilityCurve_SynchronousMachines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine#getReactiveCapabilityCurves
     * @model opposite="ReactiveCapabilityCurves" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReactiveCapabilityCurve.SynchronousMachines' kind='element'"
     * @generated
     */
    EList< SynchronousMachine > getSynchronousMachines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachines()
     * @see #getSynchronousMachines()
     * @generated
     */
    void unsetSynchronousMachines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machines</em>' reference list is set.
     * @see #unsetSynchronousMachines()
     * @see #getSynchronousMachines()
     * @generated
     */
    boolean isSetSynchronousMachines();

} // ReactiveCapabilityCurve
