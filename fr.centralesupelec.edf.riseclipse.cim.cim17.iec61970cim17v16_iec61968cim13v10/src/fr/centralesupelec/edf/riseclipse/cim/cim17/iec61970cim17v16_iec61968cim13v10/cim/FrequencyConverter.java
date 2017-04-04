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
 * A representation of the model object '<em><b>Frequency Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxU <em>Max U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinU <em>Min U</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFrequencyConverter()
 * @model
 * @generated
 */
public interface FrequencyConverter extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Frequency</em>' attribute.
     * @see #isSetFrequency()
     * @see #unsetFrequency()
     * @see #setFrequency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFrequencyConverter_Frequency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FrequencyConverter.frequency' kind='element'"
     * @generated
     */
    Float getFrequency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getFrequency <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Frequency</em>' attribute.
     * @see #isSetFrequency()
     * @see #unsetFrequency()
     * @see #getFrequency()
     * @generated
     */
    void setFrequency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getFrequency <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFrequency()
     * @see #getFrequency()
     * @see #setFrequency(Float)
     * @generated
     */
    void unsetFrequency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getFrequency <em>Frequency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Frequency</em>' attribute is set.
     * @see #unsetFrequency()
     * @see #getFrequency()
     * @see #setFrequency(Float)
     * @generated
     */
    boolean isSetFrequency();

    /**
     * Returns the value of the '<em><b>Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max P</em>' attribute.
     * @see #isSetMaxP()
     * @see #unsetMaxP()
     * @see #setMaxP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFrequencyConverter_MaxP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FrequencyConverter.maxP' kind='element'"
     * @generated
     */
    Float getMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max P</em>' attribute.
     * @see #isSetMaxP()
     * @see #unsetMaxP()
     * @see #getMaxP()
     * @generated
     */
    void setMaxP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Float)
     * @generated
     */
    void unsetMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxP <em>Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max P</em>' attribute is set.
     * @see #unsetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Float)
     * @generated
     */
    boolean isSetMaxP();

    /**
     * Returns the value of the '<em><b>Max U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max U</em>' attribute.
     * @see #isSetMaxU()
     * @see #unsetMaxU()
     * @see #setMaxU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFrequencyConverter_MaxU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FrequencyConverter.maxU' kind='element'"
     * @generated
     */
    Float getMaxU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxU <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max U</em>' attribute.
     * @see #isSetMaxU()
     * @see #unsetMaxU()
     * @see #getMaxU()
     * @generated
     */
    void setMaxU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxU <em>Max U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxU()
     * @see #getMaxU()
     * @see #setMaxU(Float)
     * @generated
     */
    void unsetMaxU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMaxU <em>Max U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max U</em>' attribute is set.
     * @see #unsetMaxU()
     * @see #getMaxU()
     * @see #setMaxU(Float)
     * @generated
     */
    boolean isSetMaxU();

    /**
     * Returns the value of the '<em><b>Min P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min P</em>' attribute.
     * @see #isSetMinP()
     * @see #unsetMinP()
     * @see #setMinP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFrequencyConverter_MinP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FrequencyConverter.minP' kind='element'"
     * @generated
     */
    Float getMinP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min P</em>' attribute.
     * @see #isSetMinP()
     * @see #unsetMinP()
     * @see #getMinP()
     * @generated
     */
    void setMinP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinP()
     * @see #getMinP()
     * @see #setMinP(Float)
     * @generated
     */
    void unsetMinP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinP <em>Min P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min P</em>' attribute is set.
     * @see #unsetMinP()
     * @see #getMinP()
     * @see #setMinP(Float)
     * @generated
     */
    boolean isSetMinP();

    /**
     * Returns the value of the '<em><b>Min U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min U</em>' attribute.
     * @see #isSetMinU()
     * @see #unsetMinU()
     * @see #setMinU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFrequencyConverter_MinU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FrequencyConverter.minU' kind='element'"
     * @generated
     */
    Float getMinU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinU <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min U</em>' attribute.
     * @see #isSetMinU()
     * @see #unsetMinU()
     * @see #getMinU()
     * @generated
     */
    void setMinU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinU <em>Min U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinU()
     * @see #getMinU()
     * @see #setMinU(Float)
     * @generated
     */
    void unsetMinU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FrequencyConverter#getMinU <em>Min U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min U</em>' attribute is set.
     * @see #unsetMinU()
     * @see #getMinU()
     * @see #setMinU(Float)
     * @generated
     */
    boolean isSetMinU();

} // FrequencyConverter
