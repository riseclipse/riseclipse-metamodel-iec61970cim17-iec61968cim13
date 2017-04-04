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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heat Recovery Boiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatRecoveryBoiler()
 * @model
 * @generated
 */
public interface HeatRecoveryBoiler extends FossilSteamSupply {
    /**
     * Returns the value of the '<em><b>Steam Supply Rating2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Steam Supply Rating2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Steam Supply Rating2</em>' attribute.
     * @see #isSetSteamSupplyRating2()
     * @see #unsetSteamSupplyRating2()
     * @see #setSteamSupplyRating2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatRecoveryBoiler_SteamSupplyRating2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatRecoveryBoiler.steamSupplyRating2' kind='element'"
     * @generated
     */
    Float getSteamSupplyRating2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Steam Supply Rating2</em>' attribute.
     * @see #isSetSteamSupplyRating2()
     * @see #unsetSteamSupplyRating2()
     * @see #getSteamSupplyRating2()
     * @generated
     */
    void setSteamSupplyRating2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSteamSupplyRating2()
     * @see #getSteamSupplyRating2()
     * @see #setSteamSupplyRating2(Float)
     * @generated
     */
    void unsetSteamSupplyRating2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getSteamSupplyRating2 <em>Steam Supply Rating2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Steam Supply Rating2</em>' attribute is set.
     * @see #unsetSteamSupplyRating2()
     * @see #getSteamSupplyRating2()
     * @see #setSteamSupplyRating2(Float)
     * @generated
     */
    boolean isSetSteamSupplyRating2();

    /**
     * Returns the value of the '<em><b>Combustion Turbines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryBoiler <em>Heat Recovery Boiler</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combustion Turbines</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combustion Turbines</em>' reference list.
     * @see #isSetCombustionTurbines()
     * @see #unsetCombustionTurbines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHeatRecoveryBoiler_CombustionTurbines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine#getHeatRecoveryBoiler
     * @model opposite="HeatRecoveryBoiler" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HeatRecoveryBoiler.CombustionTurbines' kind='element'"
     * @generated
     */
    EList< CombustionTurbine > getCombustionTurbines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCombustionTurbines()
     * @see #getCombustionTurbines()
     * @generated
     */
    void unsetCombustionTurbines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRecoveryBoiler#getCombustionTurbines <em>Combustion Turbines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Combustion Turbines</em>' reference list is set.
     * @see #unsetCombustionTurbines()
     * @see #getCombustionTurbines()
     * @generated
     */
    boolean isSetCombustionTurbines();

} // HeatRecoveryBoiler
