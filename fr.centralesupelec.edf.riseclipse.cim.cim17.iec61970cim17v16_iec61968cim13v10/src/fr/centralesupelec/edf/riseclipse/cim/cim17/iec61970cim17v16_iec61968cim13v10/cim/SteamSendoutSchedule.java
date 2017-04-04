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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Sendout Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamSendoutSchedule()
 * @model
 * @generated
 */
public interface SteamSendoutSchedule extends RegularIntervalSchedule {
    /**
     * Returns the value of the '<em><b>Cogeneration Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cogeneration Plant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cogeneration Plant</em>' reference.
     * @see #isSetCogenerationPlant()
     * @see #unsetCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamSendoutSchedule_CogenerationPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getSteamSendoutSchedule
     * @model opposite="SteamSendoutSchedule" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamSendoutSchedule.CogenerationPlant' kind='element'"
     * @generated
     */
    CogenerationPlant getCogenerationPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cogeneration Plant</em>' reference.
     * @see #isSetCogenerationPlant()
     * @see #unsetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @generated
     */
    void setCogenerationPlant( CogenerationPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @generated
     */
    void unsetCogenerationPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cogeneration Plant</em>' reference is set.
     * @see #unsetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @generated
     */
    boolean isSetCogenerationPlant();

} // SteamSendoutSchedule
