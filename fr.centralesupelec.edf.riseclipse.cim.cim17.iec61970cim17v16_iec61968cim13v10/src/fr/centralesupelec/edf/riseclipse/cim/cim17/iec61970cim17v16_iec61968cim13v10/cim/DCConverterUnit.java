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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DC Converter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCConverterUnit()
 * @model
 * @generated
 */
public interface DCConverterUnit extends DCEquipmentContainer {
    /**
     * Returns the value of the '<em><b>Operation Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterOperatingModeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterOperatingModeKind
     * @see #isSetOperationMode()
     * @see #unsetOperationMode()
     * @see #setOperationMode(DCConverterOperatingModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCConverterUnit_OperationMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCConverterUnit.operationMode' kind='element'"
     * @generated
     */
    DCConverterOperatingModeKind getOperationMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterOperatingModeKind
     * @see #isSetOperationMode()
     * @see #unsetOperationMode()
     * @see #getOperationMode()
     * @generated
     */
    void setOperationMode( DCConverterOperatingModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationMode()
     * @see #getOperationMode()
     * @see #setOperationMode(DCConverterOperatingModeKind)
     * @generated
     */
    void unsetOperationMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getOperationMode <em>Operation Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operation Mode</em>' attribute is set.
     * @see #unsetOperationMode()
     * @see #getOperationMode()
     * @see #setOperationMode(DCConverterOperatingModeKind)
     * @generated
     */
    boolean isSetOperationMode();

    /**
     * Returns the value of the '<em><b>Substation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation#getDCConverterUnit <em>DC Converter Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #setSubstation(Substation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDCConverterUnit_Substation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation#getDCConverterUnit
     * @model opposite="DCConverterUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DCConverterUnit.Substation' kind='element'"
     * @generated
     */
    Substation getSubstation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @generated
     */
    void setSubstation( Substation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    void unsetSubstation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DCConverterUnit#getSubstation <em>Substation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substation</em>' reference is set.
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    boolean isSetSubstation();

} // DCConverterUnit
