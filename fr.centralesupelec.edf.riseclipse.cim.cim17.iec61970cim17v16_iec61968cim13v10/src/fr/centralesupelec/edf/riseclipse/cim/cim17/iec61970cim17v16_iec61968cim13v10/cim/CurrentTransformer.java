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
 * A representation of the model object '<em><b>Current Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCoreBurden <em>Core Burden</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentTransformer()
 * @model
 * @generated
 */
public interface CurrentTransformer extends Sensor {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentTransformer_AccuracyClass()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentTransformer.accuracyClass' kind='element'"
     * @generated
     */
    String getAccuracyClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccuracyClass()
     * @see #getAccuracyClass()
     * @see #setAccuracyClass(String)
     * @generated
     */
    void unsetAccuracyClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Accuracy Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Accuracy Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Accuracy Limit</em>' attribute.
     * @see #isSetAccuracyLimit()
     * @see #unsetAccuracyLimit()
     * @see #setAccuracyLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentTransformer_AccuracyLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentTransformer.accuracyLimit' kind='element'"
     * @generated
     */
    Float getAccuracyLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Accuracy Limit</em>' attribute.
     * @see #isSetAccuracyLimit()
     * @see #unsetAccuracyLimit()
     * @see #getAccuracyLimit()
     * @generated
     */
    void setAccuracyLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccuracyLimit()
     * @see #getAccuracyLimit()
     * @see #setAccuracyLimit(Float)
     * @generated
     */
    void unsetAccuracyLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Accuracy Limit</em>' attribute is set.
     * @see #unsetAccuracyLimit()
     * @see #getAccuracyLimit()
     * @see #setAccuracyLimit(Float)
     * @generated
     */
    boolean isSetAccuracyLimit();

    /**
     * Returns the value of the '<em><b>Core Burden</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Core Burden</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Core Burden</em>' attribute.
     * @see #isSetCoreBurden()
     * @see #unsetCoreBurden()
     * @see #setCoreBurden(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentTransformer_CoreBurden()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentTransformer.coreBurden' kind='element'"
     * @generated
     */
    Float getCoreBurden();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCoreBurden <em>Core Burden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Core Burden</em>' attribute.
     * @see #isSetCoreBurden()
     * @see #unsetCoreBurden()
     * @see #getCoreBurden()
     * @generated
     */
    void setCoreBurden( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCoreBurden <em>Core Burden</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCoreBurden()
     * @see #getCoreBurden()
     * @see #setCoreBurden(Float)
     * @generated
     */
    void unsetCoreBurden();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCoreBurden <em>Core Burden</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Core Burden</em>' attribute is set.
     * @see #unsetCoreBurden()
     * @see #getCoreBurden()
     * @see #setCoreBurden(Float)
     * @generated
     */
    boolean isSetCoreBurden();

    /**
     * Returns the value of the '<em><b>Ct Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ct Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ct Class</em>' attribute.
     * @see #isSetCtClass()
     * @see #unsetCtClass()
     * @see #setCtClass(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentTransformer_CtClass()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentTransformer.ctClass' kind='element'"
     * @generated
     */
    String getCtClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCtClass <em>Ct Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ct Class</em>' attribute.
     * @see #isSetCtClass()
     * @see #unsetCtClass()
     * @see #getCtClass()
     * @generated
     */
    void setCtClass( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCtClass <em>Ct Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCtClass()
     * @see #getCtClass()
     * @see #setCtClass(String)
     * @generated
     */
    void unsetCtClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getCtClass <em>Ct Class</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ct Class</em>' attribute is set.
     * @see #unsetCtClass()
     * @see #getCtClass()
     * @see #setCtClass(String)
     * @generated
     */
    boolean isSetCtClass();

    /**
     * Returns the value of the '<em><b>Usage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage</em>' attribute.
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #setUsage(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentTransformer_Usage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentTransformer.usage' kind='element'"
     * @generated
     */
    String getUsage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage</em>' attribute.
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #getUsage()
     * @generated
     */
    void setUsage( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsage()
     * @see #getUsage()
     * @see #setUsage(String)
     * @generated
     */
    void unsetUsage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentTransformer#getUsage <em>Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage</em>' attribute is set.
     * @see #unsetUsage()
     * @see #getUsage()
     * @see #setUsage(String)
     * @generated
     */
    boolean isSetUsage();

} // CurrentTransformer
