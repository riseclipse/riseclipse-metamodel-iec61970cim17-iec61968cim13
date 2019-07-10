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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends WorkAsset {
    /**
     * Returns the value of the '<em><b>Last Calibration Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Calibration Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Calibration Date</em>' attribute.
     * @see #isSetLastCalibrationDate()
     * @see #unsetLastCalibrationDate()
     * @see #setLastCalibrationDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTool_LastCalibrationDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Tool.lastCalibrationDate' kind='element'"
     * @generated
     */
    Date getLastCalibrationDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Calibration Date</em>' attribute.
     * @see #isSetLastCalibrationDate()
     * @see #unsetLastCalibrationDate()
     * @see #getLastCalibrationDate()
     * @generated
     */
    void setLastCalibrationDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLastCalibrationDate()
     * @see #getLastCalibrationDate()
     * @see #setLastCalibrationDate(Date)
     * @generated
     */
    void unsetLastCalibrationDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tool#getLastCalibrationDate <em>Last Calibration Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Last Calibration Date</em>' attribute is set.
     * @see #unsetLastCalibrationDate()
     * @see #getLastCalibrationDate()
     * @see #setLastCalibrationDate(Date)
     * @generated
     */
    boolean isSetLastCalibrationDate();

} // Tool
