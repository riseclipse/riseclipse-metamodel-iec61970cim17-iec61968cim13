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
 * A representation of the model object '<em><b>Steam Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamSupply()
 * @model
 * @generated
 */
public interface SteamSupply extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Steam Supply Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Steam Supply Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Steam Supply Rating</em>' attribute.
     * @see #isSetSteamSupplyRating()
     * @see #unsetSteamSupplyRating()
     * @see #setSteamSupplyRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamSupply_SteamSupplyRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamSupply.steamSupplyRating' kind='element'"
     * @generated
     */
    Float getSteamSupplyRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Steam Supply Rating</em>' attribute.
     * @see #isSetSteamSupplyRating()
     * @see #unsetSteamSupplyRating()
     * @see #getSteamSupplyRating()
     * @generated
     */
    void setSteamSupplyRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSteamSupplyRating()
     * @see #getSteamSupplyRating()
     * @see #setSteamSupplyRating(Float)
     * @generated
     */
    void unsetSteamSupplyRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamSupplyRating <em>Steam Supply Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Steam Supply Rating</em>' attribute is set.
     * @see #unsetSteamSupplyRating()
     * @see #getSteamSupplyRating()
     * @see #setSteamSupplyRating(Float)
     * @generated
     */
    boolean isSetSteamSupplyRating();

    /**
     * Returns the value of the '<em><b>Steam Turbines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Steam Turbines</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Steam Turbines</em>' reference list.
     * @see #isSetSteamTurbines()
     * @see #unsetSteamTurbines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamSupply_SteamTurbines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamSupplys
     * @model opposite="SteamSupplys" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamSupply.SteamTurbines' kind='element'"
     * @generated
     */
    EList< SteamTurbine > getSteamTurbines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSteamTurbines()
     * @see #getSteamTurbines()
     * @generated
     */
    void unsetSteamTurbines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Steam Turbines</em>' reference list is set.
     * @see #unsetSteamTurbines()
     * @see #getSteamTurbines()
     * @generated
     */
    boolean isSetSteamTurbines();

} // SteamSupply
