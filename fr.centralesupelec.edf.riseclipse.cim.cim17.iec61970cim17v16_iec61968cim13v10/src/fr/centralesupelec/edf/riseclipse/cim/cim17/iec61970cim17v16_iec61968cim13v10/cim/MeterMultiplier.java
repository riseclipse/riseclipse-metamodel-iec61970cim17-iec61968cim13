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
 * A representation of the model object '<em><b>Meter Multiplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterMultiplier()
 * @model
 * @generated
 */
public interface MeterMultiplier extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplierKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplierKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(MeterMultiplierKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterMultiplier_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MeterMultiplier.kind' kind='element'"
     * @generated
     */
    MeterMultiplierKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplierKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( MeterMultiplierKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(MeterMultiplierKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(MeterMultiplierKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterMultiplier_Value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MeterMultiplier.value' kind='element'"
     * @generated
     */
    Float getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Meter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getMeterMultipliers <em>Meter Multipliers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meter</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #setMeter(Meter)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMeterMultiplier_Meter()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter#getMeterMultipliers
     * @model opposite="MeterMultipliers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MeterMultiplier.Meter' kind='element'"
     * @generated
     */
    Meter getMeter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meter</em>' reference.
     * @see #isSetMeter()
     * @see #unsetMeter()
     * @see #getMeter()
     * @generated
     */
    void setMeter( Meter value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getMeter <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    void unsetMeter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterMultiplier#getMeter <em>Meter</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meter</em>' reference is set.
     * @see #unsetMeter()
     * @see #getMeter()
     * @see #setMeter(Meter)
     * @generated
     */
    boolean isSetMeter();

} // MeterMultiplier
