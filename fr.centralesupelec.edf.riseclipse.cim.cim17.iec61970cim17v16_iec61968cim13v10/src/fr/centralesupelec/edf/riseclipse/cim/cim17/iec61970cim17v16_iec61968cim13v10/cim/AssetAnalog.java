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
 * A representation of the model object '<em><b>Asset Analog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getDetectionLimit <em>Detection Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getPrecision <em>Precision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getReportingTemperature <em>Reporting Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getTestStandard <em>Test Standard</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetAnalog()
 * @model
 * @generated
 */
public interface AssetAnalog extends Analog {
    /**
     * Returns the value of the '<em><b>Detection Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Detection Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Detection Limit</em>' attribute.
     * @see #isSetDetectionLimit()
     * @see #unsetDetectionLimit()
     * @see #setDetectionLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetAnalog_DetectionLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetAnalog.detectionLimit' kind='element'"
     * @generated
     */
    Float getDetectionLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getDetectionLimit <em>Detection Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Detection Limit</em>' attribute.
     * @see #isSetDetectionLimit()
     * @see #unsetDetectionLimit()
     * @see #getDetectionLimit()
     * @generated
     */
    void setDetectionLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getDetectionLimit <em>Detection Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDetectionLimit()
     * @see #getDetectionLimit()
     * @see #setDetectionLimit(Float)
     * @generated
     */
    void unsetDetectionLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getDetectionLimit <em>Detection Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Detection Limit</em>' attribute is set.
     * @see #unsetDetectionLimit()
     * @see #getDetectionLimit()
     * @see #setDetectionLimit(Float)
     * @generated
     */
    boolean isSetDetectionLimit();

    /**
     * Returns the value of the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Precision</em>' attribute.
     * @see #isSetPrecision()
     * @see #unsetPrecision()
     * @see #setPrecision(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetAnalog_Precision()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetAnalog.precision' kind='element'"
     * @generated
     */
    Float getPrecision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Precision</em>' attribute.
     * @see #isSetPrecision()
     * @see #unsetPrecision()
     * @see #getPrecision()
     * @generated
     */
    void setPrecision( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getPrecision <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrecision()
     * @see #getPrecision()
     * @see #setPrecision(Float)
     * @generated
     */
    void unsetPrecision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getPrecision <em>Precision</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Precision</em>' attribute is set.
     * @see #unsetPrecision()
     * @see #getPrecision()
     * @see #setPrecision(Float)
     * @generated
     */
    boolean isSetPrecision();

    /**
     * Returns the value of the '<em><b>Reporting Temperature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reporting Temperature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reporting Temperature</em>' attribute.
     * @see #isSetReportingTemperature()
     * @see #unsetReportingTemperature()
     * @see #setReportingTemperature(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetAnalog_ReportingTemperature()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetAnalog.reportingTemperature' kind='element'"
     * @generated
     */
    Float getReportingTemperature();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getReportingTemperature <em>Reporting Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reporting Temperature</em>' attribute.
     * @see #isSetReportingTemperature()
     * @see #unsetReportingTemperature()
     * @see #getReportingTemperature()
     * @generated
     */
    void setReportingTemperature( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getReportingTemperature <em>Reporting Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingTemperature()
     * @see #getReportingTemperature()
     * @see #setReportingTemperature(Float)
     * @generated
     */
    void unsetReportingTemperature();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getReportingTemperature <em>Reporting Temperature</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reporting Temperature</em>' attribute is set.
     * @see #unsetReportingTemperature()
     * @see #getReportingTemperature()
     * @see #setReportingTemperature(Float)
     * @generated
     */
    boolean isSetReportingTemperature();

    /**
     * Returns the value of the '<em><b>Test Standard</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetAnalog <em>Asset Analog</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Standard</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Standard</em>' reference.
     * @see #isSetTestStandard()
     * @see #unsetTestStandard()
     * @see #setTestStandard(TestStandard)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetAnalog_TestStandard()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard#getAssetAnalog
     * @model opposite="AssetAnalog" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AssetAnalog.TestStandard' kind='element'"
     * @generated
     */
    TestStandard getTestStandard();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getTestStandard <em>Test Standard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Standard</em>' reference.
     * @see #isSetTestStandard()
     * @see #unsetTestStandard()
     * @see #getTestStandard()
     * @generated
     */
    void setTestStandard( TestStandard value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getTestStandard <em>Test Standard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTestStandard()
     * @see #getTestStandard()
     * @see #setTestStandard(TestStandard)
     * @generated
     */
    void unsetTestStandard();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetAnalog#getTestStandard <em>Test Standard</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Test Standard</em>' reference is set.
     * @see #unsetTestStandard()
     * @see #getTestStandard()
     * @see #setTestStandard(TestStandard)
     * @generated
     */
    boolean isSetTestStandard();

} // AssetAnalog
