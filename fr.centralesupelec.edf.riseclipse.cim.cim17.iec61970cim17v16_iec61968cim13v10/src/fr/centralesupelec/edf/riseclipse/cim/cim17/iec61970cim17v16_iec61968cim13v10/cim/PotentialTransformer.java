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
 * A representation of the model object '<em><b>Potential Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getPtClass <em>Pt Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPotentialTransformer()
 * @model
 * @generated
 */
public interface PotentialTransformer extends Sensor {
    /**
     * Returns the value of the '<em><b>Accuracy Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accuracy Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accuracy Class</em>' attribute.
     * @see #isSetAccuracyClass()
     * @see #unsetAccuracyClass()
     * @see #setAccuracyClass(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPotentialTransformer_AccuracyClass()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PotentialTransformer.accuracyClass' kind='element'"
     * @generated
     */
    String getAccuracyClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accuracy Class</em>' attribute.
     * @see #isSetAccuracyClass()
     * @see #unsetAccuracyClass()
     * @see #getAccuracyClass()
     * @generated
     */
    void setAccuracyClass( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccuracyClass()
     * @see #getAccuracyClass()
     * @see #setAccuracyClass(String)
     * @generated
     */
    void unsetAccuracyClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accuracy Class</em>' attribute is set.
     * @see #unsetAccuracyClass()
     * @see #getAccuracyClass()
     * @see #setAccuracyClass(String)
     * @generated
     */
    boolean isSetAccuracyClass();

    /**
     * Returns the value of the '<em><b>Nominal Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nominal Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nominal Ratio</em>' attribute.
     * @see #isSetNominalRatio()
     * @see #unsetNominalRatio()
     * @see #setNominalRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPotentialTransformer_NominalRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PotentialTransformer.nominalRatio' kind='element'"
     * @generated
     */
    Float getNominalRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Ratio</em>' attribute.
     * @see #isSetNominalRatio()
     * @see #unsetNominalRatio()
     * @see #getNominalRatio()
     * @generated
     */
    void setNominalRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalRatio()
     * @see #getNominalRatio()
     * @see #setNominalRatio(Float)
     * @generated
     */
    void unsetNominalRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Ratio</em>' attribute is set.
     * @see #unsetNominalRatio()
     * @see #getNominalRatio()
     * @see #setNominalRatio(Float)
     * @generated
     */
    boolean isSetNominalRatio();

    /**
     * Returns the value of the '<em><b>Pt Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pt Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pt Class</em>' attribute.
     * @see #isSetPtClass()
     * @see #unsetPtClass()
     * @see #setPtClass(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPotentialTransformer_PtClass()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PotentialTransformer.ptClass' kind='element'"
     * @generated
     */
    String getPtClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getPtClass <em>Pt Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pt Class</em>' attribute.
     * @see #isSetPtClass()
     * @see #unsetPtClass()
     * @see #getPtClass()
     * @generated
     */
    void setPtClass( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getPtClass <em>Pt Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPtClass()
     * @see #getPtClass()
     * @see #setPtClass(String)
     * @generated
     */
    void unsetPtClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getPtClass <em>Pt Class</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pt Class</em>' attribute is set.
     * @see #unsetPtClass()
     * @see #getPtClass()
     * @see #setPtClass(String)
     * @generated
     */
    boolean isSetPtClass();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformerKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformerKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(PotentialTransformerKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPotentialTransformer_Type()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PotentialTransformer.type' kind='element'"
     * @generated
     */
    PotentialTransformerKind getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformerKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( PotentialTransformerKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(PotentialTransformerKind)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PotentialTransformer#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(PotentialTransformerKind)
     * @generated
     */
    boolean isSetType();

} // PotentialTransformer
