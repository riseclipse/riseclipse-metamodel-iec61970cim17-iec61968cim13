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
 * A representation of the model object '<em><b>Test Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenID <em>Specimen ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestDataSet()
 * @model
 * @generated
 */
public interface TestDataSet extends ProcedureDataSet {
    /**
     * Returns the value of the '<em><b>Conclusion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conclusion</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conclusion</em>' attribute.
     * @see #isSetConclusion()
     * @see #unsetConclusion()
     * @see #setConclusion(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestDataSet_Conclusion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestDataSet.conclusion' kind='element'"
     * @generated
     */
    String getConclusion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getConclusion <em>Conclusion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conclusion</em>' attribute.
     * @see #isSetConclusion()
     * @see #unsetConclusion()
     * @see #getConclusion()
     * @generated
     */
    void setConclusion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getConclusion <em>Conclusion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConclusion()
     * @see #getConclusion()
     * @see #setConclusion(String)
     * @generated
     */
    void unsetConclusion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getConclusion <em>Conclusion</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conclusion</em>' attribute is set.
     * @see #unsetConclusion()
     * @see #getConclusion()
     * @see #setConclusion(String)
     * @generated
     */
    boolean isSetConclusion();

    /**
     * Returns the value of the '<em><b>Specimen ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specimen ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specimen ID</em>' attribute.
     * @see #isSetSpecimenID()
     * @see #unsetSpecimenID()
     * @see #setSpecimenID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestDataSet_SpecimenID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestDataSet.specimenID' kind='element'"
     * @generated
     */
    String getSpecimenID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenID <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specimen ID</em>' attribute.
     * @see #isSetSpecimenID()
     * @see #unsetSpecimenID()
     * @see #getSpecimenID()
     * @generated
     */
    void setSpecimenID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenID <em>Specimen ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecimenID()
     * @see #getSpecimenID()
     * @see #setSpecimenID(String)
     * @generated
     */
    void unsetSpecimenID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenID <em>Specimen ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Specimen ID</em>' attribute is set.
     * @see #unsetSpecimenID()
     * @see #getSpecimenID()
     * @see #setSpecimenID(String)
     * @generated
     */
    boolean isSetSpecimenID();

    /**
     * Returns the value of the '<em><b>Specimen To Lab Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specimen To Lab Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specimen To Lab Date Time</em>' attribute.
     * @see #isSetSpecimenToLabDateTime()
     * @see #unsetSpecimenToLabDateTime()
     * @see #setSpecimenToLabDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTestDataSet_SpecimenToLabDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TestDataSet.specimenToLabDateTime' kind='element'"
     * @generated
     */
    Date getSpecimenToLabDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specimen To Lab Date Time</em>' attribute.
     * @see #isSetSpecimenToLabDateTime()
     * @see #unsetSpecimenToLabDateTime()
     * @see #getSpecimenToLabDateTime()
     * @generated
     */
    void setSpecimenToLabDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecimenToLabDateTime()
     * @see #getSpecimenToLabDateTime()
     * @see #setSpecimenToLabDateTime(Date)
     * @generated
     */
    void unsetSpecimenToLabDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Specimen To Lab Date Time</em>' attribute is set.
     * @see #unsetSpecimenToLabDateTime()
     * @see #getSpecimenToLabDateTime()
     * @see #setSpecimenToLabDateTime(Date)
     * @generated
     */
    boolean isSetSpecimenToLabDateTime();

} // TestDataSet
