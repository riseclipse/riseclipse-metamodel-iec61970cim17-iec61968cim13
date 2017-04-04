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
 * A representation of the model object '<em><b>Lab Test Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusionConfidence <em>Conclusion Confidence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getReasonForTest <em>Reason For Test</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getTestEquipmentID <em>Test Equipment ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getAssetTestLab <em>Asset Test Lab</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getSpecimen <em>Specimen</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLabTestDataSet()
 * @model
 * @generated
 */
public interface LabTestDataSet extends ProcedureDataSet {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLabTestDataSet_Conclusion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LabTestDataSet.conclusion' kind='element'"
     * @generated
     */
    String getConclusion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusion <em>Conclusion</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusion <em>Conclusion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConclusion()
     * @see #getConclusion()
     * @see #setConclusion(String)
     * @generated
     */
    void unsetConclusion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusion <em>Conclusion</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Conclusion Confidence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conclusion Confidence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conclusion Confidence</em>' attribute.
     * @see #isSetConclusionConfidence()
     * @see #unsetConclusionConfidence()
     * @see #setConclusionConfidence(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLabTestDataSet_ConclusionConfidence()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LabTestDataSet.conclusionConfidence' kind='element'"
     * @generated
     */
    String getConclusionConfidence();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusionConfidence <em>Conclusion Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conclusion Confidence</em>' attribute.
     * @see #isSetConclusionConfidence()
     * @see #unsetConclusionConfidence()
     * @see #getConclusionConfidence()
     * @generated
     */
    void setConclusionConfidence( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusionConfidence <em>Conclusion Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConclusionConfidence()
     * @see #getConclusionConfidence()
     * @see #setConclusionConfidence(String)
     * @generated
     */
    void unsetConclusionConfidence();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getConclusionConfidence <em>Conclusion Confidence</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conclusion Confidence</em>' attribute is set.
     * @see #unsetConclusionConfidence()
     * @see #getConclusionConfidence()
     * @see #setConclusionConfidence(String)
     * @generated
     */
    boolean isSetConclusionConfidence();

    /**
     * Returns the value of the '<em><b>Reason For Test</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestReason}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reason For Test</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reason For Test</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestReason
     * @see #isSetReasonForTest()
     * @see #unsetReasonForTest()
     * @see #setReasonForTest(TestReason)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLabTestDataSet_ReasonForTest()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LabTestDataSet.reasonForTest' kind='element'"
     * @generated
     */
    TestReason getReasonForTest();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getReasonForTest <em>Reason For Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reason For Test</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestReason
     * @see #isSetReasonForTest()
     * @see #unsetReasonForTest()
     * @see #getReasonForTest()
     * @generated
     */
    void setReasonForTest( TestReason value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getReasonForTest <em>Reason For Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReasonForTest()
     * @see #getReasonForTest()
     * @see #setReasonForTest(TestReason)
     * @generated
     */
    void unsetReasonForTest();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getReasonForTest <em>Reason For Test</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reason For Test</em>' attribute is set.
     * @see #unsetReasonForTest()
     * @see #getReasonForTest()
     * @see #setReasonForTest(TestReason)
     * @generated
     */
    boolean isSetReasonForTest();

    /**
     * Returns the value of the '<em><b>Test Equipment ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Equipment ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Equipment ID</em>' attribute.
     * @see #isSetTestEquipmentID()
     * @see #unsetTestEquipmentID()
     * @see #setTestEquipmentID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLabTestDataSet_TestEquipmentID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LabTestDataSet.testEquipmentID' kind='element'"
     * @generated
     */
    String getTestEquipmentID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getTestEquipmentID <em>Test Equipment ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Equipment ID</em>' attribute.
     * @see #isSetTestEquipmentID()
     * @see #unsetTestEquipmentID()
     * @see #getTestEquipmentID()
     * @generated
     */
    void setTestEquipmentID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getTestEquipmentID <em>Test Equipment ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestEquipmentID()
     * @see #getTestEquipmentID()
     * @see #setTestEquipmentID(String)
     * @generated
     */
    void unsetTestEquipmentID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getTestEquipmentID <em>Test Equipment ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Equipment ID</em>' attribute is set.
     * @see #unsetTestEquipmentID()
     * @see #getTestEquipmentID()
     * @see #setTestEquipmentID(String)
     * @generated
     */
    boolean isSetTestEquipmentID();

    /**
     * Returns the value of the '<em><b>Asset Test Lab</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetTestLab#getLabTestDataSet <em>Lab Test Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Test Lab</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Test Lab</em>' reference.
     * @see #isSetAssetTestLab()
     * @see #unsetAssetTestLab()
     * @see #setAssetTestLab(AssetTestLab)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLabTestDataSet_AssetTestLab()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetTestLab#getLabTestDataSet
     * @model opposite="LabTestDataSet" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LabTestDataSet.AssetTestLab' kind='element'"
     * @generated
     */
    AssetTestLab getAssetTestLab();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getAssetTestLab <em>Asset Test Lab</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Test Lab</em>' reference.
     * @see #isSetAssetTestLab()
     * @see #unsetAssetTestLab()
     * @see #getAssetTestLab()
     * @generated
     */
    void setAssetTestLab( AssetTestLab value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getAssetTestLab <em>Asset Test Lab</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetTestLab()
     * @see #getAssetTestLab()
     * @see #setAssetTestLab(AssetTestLab)
     * @generated
     */
    void unsetAssetTestLab();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getAssetTestLab <em>Asset Test Lab</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Test Lab</em>' reference is set.
     * @see #unsetAssetTestLab()
     * @see #getAssetTestLab()
     * @see #setAssetTestLab(AssetTestLab)
     * @generated
     */
    boolean isSetAssetTestLab();

    /**
     * Returns the value of the '<em><b>Specimen</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getLabTestDataSet <em>Lab Test Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specimen</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specimen</em>' reference.
     * @see #isSetSpecimen()
     * @see #unsetSpecimen()
     * @see #setSpecimen(Specimen)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLabTestDataSet_Specimen()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen#getLabTestDataSet
     * @model opposite="LabTestDataSet" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LabTestDataSet.Specimen' kind='element'"
     * @generated
     */
    Specimen getSpecimen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getSpecimen <em>Specimen</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specimen</em>' reference.
     * @see #isSetSpecimen()
     * @see #unsetSpecimen()
     * @see #getSpecimen()
     * @generated
     */
    void setSpecimen( Specimen value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getSpecimen <em>Specimen</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecimen()
     * @see #getSpecimen()
     * @see #setSpecimen(Specimen)
     * @generated
     */
    void unsetSpecimen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LabTestDataSet#getSpecimen <em>Specimen</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Specimen</em>' reference is set.
     * @see #unsetSpecimen()
     * @see #getSpecimen()
     * @see #setSpecimen(Specimen)
     * @generated
     */
    boolean isSetSpecimen();

} // LabTestDataSet
