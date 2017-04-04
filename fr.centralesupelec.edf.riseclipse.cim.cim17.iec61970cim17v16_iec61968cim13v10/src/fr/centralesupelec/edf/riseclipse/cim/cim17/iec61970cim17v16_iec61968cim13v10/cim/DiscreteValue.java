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
 * A representation of the model object '<em><b>Discrete Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getCommand <em>Command</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getDiscrete <em>Discrete</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscreteValue()
 * @model
 * @generated
 */
public interface DiscreteValue extends MeasurementValue {
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
     * @see #setValue(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscreteValue_Value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscreteValue.value' kind='element'"
     * @generated
     */
    Integer getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(Integer)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(Integer)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Command</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Command#getDiscreteValue <em>Discrete Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Command</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Command</em>' reference.
     * @see #isSetCommand()
     * @see #unsetCommand()
     * @see #setCommand(Command)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscreteValue_Command()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Command#getDiscreteValue
     * @model opposite="DiscreteValue" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscreteValue.Command' kind='element'"
     * @generated
     */
    Command getCommand();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getCommand <em>Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Command</em>' reference.
     * @see #isSetCommand()
     * @see #unsetCommand()
     * @see #getCommand()
     * @generated
     */
    void setCommand( Command value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getCommand <em>Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommand()
     * @see #getCommand()
     * @see #setCommand(Command)
     * @generated
     */
    void unsetCommand();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getCommand <em>Command</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Command</em>' reference is set.
     * @see #unsetCommand()
     * @see #getCommand()
     * @see #setCommand(Command)
     * @generated
     */
    boolean isSetCommand();

    /**
     * Returns the value of the '<em><b>Discrete</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getDiscreteValues <em>Discrete Values</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Discrete</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Discrete</em>' reference.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #setDiscrete(Discrete)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscreteValue_Discrete()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete#getDiscreteValues
     * @model opposite="DiscreteValues" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscreteValue.Discrete' kind='element'"
     * @generated
     */
    Discrete getDiscrete();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getDiscrete <em>Discrete</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discrete</em>' reference.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @generated
     */
    void setDiscrete( Discrete value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getDiscrete <em>Discrete</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Discrete)
     * @generated
     */
    void unsetDiscrete();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue#getDiscrete <em>Discrete</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discrete</em>' reference is set.
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Discrete)
     * @generated
     */
    boolean isSetDiscrete();

} // DiscreteValue
