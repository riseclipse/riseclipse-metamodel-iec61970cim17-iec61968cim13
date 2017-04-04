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
 * A representation of the model object '<em><b>Wind Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGeneratingUnit()
 * @model
 * @generated
 */
public interface WindGeneratingUnit extends GeneratingUnit {
    /**
     * Returns the value of the '<em><b>Wind Gen Unit Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenUnitKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Unit Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Unit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenUnitKind
     * @see #isSetWindGenUnitType()
     * @see #unsetWindGenUnitType()
     * @see #setWindGenUnitType(WindGenUnitKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindGeneratingUnit_WindGenUnitType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindGeneratingUnit.windGenUnitType' kind='element'"
     * @generated
     */
    WindGenUnitKind getWindGenUnitType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Unit Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenUnitKind
     * @see #isSetWindGenUnitType()
     * @see #unsetWindGenUnitType()
     * @see #getWindGenUnitType()
     * @generated
     */
    void setWindGenUnitType( WindGenUnitKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenUnitType()
     * @see #getWindGenUnitType()
     * @see #setWindGenUnitType(WindGenUnitKind)
     * @generated
     */
    void unsetWindGenUnitType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGeneratingUnit#getWindGenUnitType <em>Wind Gen Unit Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Unit Type</em>' attribute is set.
     * @see #unsetWindGenUnitType()
     * @see #getWindGenUnitType()
     * @see #setWindGenUnitType(WindGenUnitKind)
     * @generated
     */
    boolean isSetWindGenUnitType();

} // WindGeneratingUnit
