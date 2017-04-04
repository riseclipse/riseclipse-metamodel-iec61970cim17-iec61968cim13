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
 * A representation of the model object '<em><b>Asynchronous Machine Equivalent Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineEquivalentCircuit()
 * @model
 * @generated
 */
public interface AsynchronousMachineEquivalentCircuit extends AsynchronousMachineDynamics {
    /**
     * Returns the value of the '<em><b>Rr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rr1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rr1</em>' attribute.
     * @see #isSetRr1()
     * @see #unsetRr1()
     * @see #setRr1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Rr1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineEquivalentCircuit.rr1' kind='element'"
     * @generated
     */
    Float getRr1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rr1</em>' attribute.
     * @see #isSetRr1()
     * @see #unsetRr1()
     * @see #getRr1()
     * @generated
     */
    void setRr1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRr1()
     * @see #getRr1()
     * @see #setRr1(Float)
     * @generated
     */
    void unsetRr1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rr1</em>' attribute is set.
     * @see #unsetRr1()
     * @see #getRr1()
     * @see #setRr1(Float)
     * @generated
     */
    boolean isSetRr1();

    /**
     * Returns the value of the '<em><b>Rr2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rr2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rr2</em>' attribute.
     * @see #isSetRr2()
     * @see #unsetRr2()
     * @see #setRr2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Rr2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineEquivalentCircuit.rr2' kind='element'"
     * @generated
     */
    Float getRr2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rr2</em>' attribute.
     * @see #isSetRr2()
     * @see #unsetRr2()
     * @see #getRr2()
     * @generated
     */
    void setRr2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRr2()
     * @see #getRr2()
     * @see #setRr2(Float)
     * @generated
     */
    void unsetRr2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rr2</em>' attribute is set.
     * @see #unsetRr2()
     * @see #getRr2()
     * @see #setRr2(Float)
     * @generated
     */
    boolean isSetRr2();

    /**
     * Returns the value of the '<em><b>Xlr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xlr1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xlr1</em>' attribute.
     * @see #isSetXlr1()
     * @see #unsetXlr1()
     * @see #setXlr1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Xlr1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineEquivalentCircuit.xlr1' kind='element'"
     * @generated
     */
    Float getXlr1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xlr1</em>' attribute.
     * @see #isSetXlr1()
     * @see #unsetXlr1()
     * @see #getXlr1()
     * @generated
     */
    void setXlr1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXlr1()
     * @see #getXlr1()
     * @see #setXlr1(Float)
     * @generated
     */
    void unsetXlr1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xlr1</em>' attribute is set.
     * @see #unsetXlr1()
     * @see #getXlr1()
     * @see #setXlr1(Float)
     * @generated
     */
    boolean isSetXlr1();

    /**
     * Returns the value of the '<em><b>Xlr2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xlr2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xlr2</em>' attribute.
     * @see #isSetXlr2()
     * @see #unsetXlr2()
     * @see #setXlr2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Xlr2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineEquivalentCircuit.xlr2' kind='element'"
     * @generated
     */
    Float getXlr2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xlr2</em>' attribute.
     * @see #isSetXlr2()
     * @see #unsetXlr2()
     * @see #getXlr2()
     * @generated
     */
    void setXlr2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXlr2()
     * @see #getXlr2()
     * @see #setXlr2(Float)
     * @generated
     */
    void unsetXlr2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xlr2</em>' attribute is set.
     * @see #unsetXlr2()
     * @see #getXlr2()
     * @see #setXlr2(Float)
     * @generated
     */
    boolean isSetXlr2();

    /**
     * Returns the value of the '<em><b>Xm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xm</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xm</em>' attribute.
     * @see #isSetXm()
     * @see #unsetXm()
     * @see #setXm(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Xm()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AsynchronousMachineEquivalentCircuit.xm' kind='element'"
     * @generated
     */
    Float getXm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xm</em>' attribute.
     * @see #isSetXm()
     * @see #unsetXm()
     * @see #getXm()
     * @generated
     */
    void setXm( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXm()
     * @see #getXm()
     * @see #setXm(Float)
     * @generated
     */
    void unsetXm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xm</em>' attribute is set.
     * @see #unsetXm()
     * @see #getXm()
     * @see #setXm(Float)
     * @generated
     */
    boolean isSetXm();

} // AsynchronousMachineEquivalentCircuit
