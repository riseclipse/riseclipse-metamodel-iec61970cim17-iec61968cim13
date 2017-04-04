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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReading <em>Odometer Reading</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getUsageKind <em>Usage Kind</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends WorkAsset {
    /**
     * Returns the value of the '<em><b>Odometer Read Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Odometer Read Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Odometer Read Date Time</em>' attribute.
     * @see #isSetOdometerReadDateTime()
     * @see #unsetOdometerReadDateTime()
     * @see #setOdometerReadDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVehicle_OdometerReadDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Vehicle.odometerReadDateTime' kind='element'"
     * @generated
     */
    Date getOdometerReadDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Odometer Read Date Time</em>' attribute.
     * @see #isSetOdometerReadDateTime()
     * @see #unsetOdometerReadDateTime()
     * @see #getOdometerReadDateTime()
     * @generated
     */
    void setOdometerReadDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOdometerReadDateTime()
     * @see #getOdometerReadDateTime()
     * @see #setOdometerReadDateTime(Date)
     * @generated
     */
    void unsetOdometerReadDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReadDateTime <em>Odometer Read Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Odometer Read Date Time</em>' attribute is set.
     * @see #unsetOdometerReadDateTime()
     * @see #getOdometerReadDateTime()
     * @see #setOdometerReadDateTime(Date)
     * @generated
     */
    boolean isSetOdometerReadDateTime();

    /**
     * Returns the value of the '<em><b>Odometer Reading</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Odometer Reading</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Odometer Reading</em>' attribute.
     * @see #isSetOdometerReading()
     * @see #unsetOdometerReading()
     * @see #setOdometerReading(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVehicle_OdometerReading()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Vehicle.odometerReading' kind='element'"
     * @generated
     */
    Float getOdometerReading();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReading <em>Odometer Reading</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Odometer Reading</em>' attribute.
     * @see #isSetOdometerReading()
     * @see #unsetOdometerReading()
     * @see #getOdometerReading()
     * @generated
     */
    void setOdometerReading( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReading <em>Odometer Reading</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOdometerReading()
     * @see #getOdometerReading()
     * @see #setOdometerReading(Float)
     * @generated
     */
    void unsetOdometerReading();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getOdometerReading <em>Odometer Reading</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Odometer Reading</em>' attribute is set.
     * @see #unsetOdometerReading()
     * @see #getOdometerReading()
     * @see #setOdometerReading(Float)
     * @generated
     */
    boolean isSetOdometerReading();

    /**
     * Returns the value of the '<em><b>Usage Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VehicleUsageKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VehicleUsageKind
     * @see #isSetUsageKind()
     * @see #unsetUsageKind()
     * @see #setUsageKind(VehicleUsageKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVehicle_UsageKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Vehicle.usageKind' kind='element'"
     * @generated
     */
    VehicleUsageKind getUsageKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getUsageKind <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VehicleUsageKind
     * @see #isSetUsageKind()
     * @see #unsetUsageKind()
     * @see #getUsageKind()
     * @generated
     */
    void setUsageKind( VehicleUsageKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getUsageKind <em>Usage Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsageKind()
     * @see #getUsageKind()
     * @see #setUsageKind(VehicleUsageKind)
     * @generated
     */
    void unsetUsageKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vehicle#getUsageKind <em>Usage Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Kind</em>' attribute is set.
     * @see #unsetUsageKind()
     * @see #getUsageKind()
     * @see #setUsageKind(VehicleUsageKind)
     * @generated
     */
    boolean isSetUsageKind();

} // Vehicle
