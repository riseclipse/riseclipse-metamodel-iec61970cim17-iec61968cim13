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
 * A representation of the model object '<em><b>Current Relay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit1 <em>Current Limit1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit2 <em>Current Limit2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit3 <em>Current Limit3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getInverseTimeFlag <em>Inverse Time Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay1 <em>Time Delay1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay2 <em>Time Delay2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay3 <em>Time Delay3</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay()
 * @model
 * @generated
 */
public interface CurrentRelay extends ProtectionEquipment {
    /**
     * Returns the value of the '<em><b>Current Limit1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Limit1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Limit1</em>' attribute.
     * @see #isSetCurrentLimit1()
     * @see #unsetCurrentLimit1()
     * @see #setCurrentLimit1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay_CurrentLimit1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentRelay.currentLimit1' kind='element'"
     * @generated
     */
    Float getCurrentLimit1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit1 <em>Current Limit1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Limit1</em>' attribute.
     * @see #isSetCurrentLimit1()
     * @see #unsetCurrentLimit1()
     * @see #getCurrentLimit1()
     * @generated
     */
    void setCurrentLimit1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit1 <em>Current Limit1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentLimit1()
     * @see #getCurrentLimit1()
     * @see #setCurrentLimit1(Float)
     * @generated
     */
    void unsetCurrentLimit1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit1 <em>Current Limit1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Limit1</em>' attribute is set.
     * @see #unsetCurrentLimit1()
     * @see #getCurrentLimit1()
     * @see #setCurrentLimit1(Float)
     * @generated
     */
    boolean isSetCurrentLimit1();

    /**
     * Returns the value of the '<em><b>Current Limit2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Limit2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Limit2</em>' attribute.
     * @see #isSetCurrentLimit2()
     * @see #unsetCurrentLimit2()
     * @see #setCurrentLimit2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay_CurrentLimit2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentRelay.currentLimit2' kind='element'"
     * @generated
     */
    Float getCurrentLimit2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit2 <em>Current Limit2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Limit2</em>' attribute.
     * @see #isSetCurrentLimit2()
     * @see #unsetCurrentLimit2()
     * @see #getCurrentLimit2()
     * @generated
     */
    void setCurrentLimit2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit2 <em>Current Limit2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentLimit2()
     * @see #getCurrentLimit2()
     * @see #setCurrentLimit2(Float)
     * @generated
     */
    void unsetCurrentLimit2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit2 <em>Current Limit2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Limit2</em>' attribute is set.
     * @see #unsetCurrentLimit2()
     * @see #getCurrentLimit2()
     * @see #setCurrentLimit2(Float)
     * @generated
     */
    boolean isSetCurrentLimit2();

    /**
     * Returns the value of the '<em><b>Current Limit3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Limit3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Limit3</em>' attribute.
     * @see #isSetCurrentLimit3()
     * @see #unsetCurrentLimit3()
     * @see #setCurrentLimit3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay_CurrentLimit3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentRelay.currentLimit3' kind='element'"
     * @generated
     */
    Float getCurrentLimit3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit3 <em>Current Limit3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Limit3</em>' attribute.
     * @see #isSetCurrentLimit3()
     * @see #unsetCurrentLimit3()
     * @see #getCurrentLimit3()
     * @generated
     */
    void setCurrentLimit3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit3 <em>Current Limit3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentLimit3()
     * @see #getCurrentLimit3()
     * @see #setCurrentLimit3(Float)
     * @generated
     */
    void unsetCurrentLimit3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getCurrentLimit3 <em>Current Limit3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Limit3</em>' attribute is set.
     * @see #unsetCurrentLimit3()
     * @see #getCurrentLimit3()
     * @see #setCurrentLimit3(Float)
     * @generated
     */
    boolean isSetCurrentLimit3();

    /**
     * Returns the value of the '<em><b>Inverse Time Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inverse Time Flag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inverse Time Flag</em>' attribute.
     * @see #isSetInverseTimeFlag()
     * @see #unsetInverseTimeFlag()
     * @see #setInverseTimeFlag(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay_InverseTimeFlag()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentRelay.inverseTimeFlag' kind='element'"
     * @generated
     */
    Boolean getInverseTimeFlag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getInverseTimeFlag <em>Inverse Time Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inverse Time Flag</em>' attribute.
     * @see #isSetInverseTimeFlag()
     * @see #unsetInverseTimeFlag()
     * @see #getInverseTimeFlag()
     * @generated
     */
    void setInverseTimeFlag( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getInverseTimeFlag <em>Inverse Time Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInverseTimeFlag()
     * @see #getInverseTimeFlag()
     * @see #setInverseTimeFlag(Boolean)
     * @generated
     */
    void unsetInverseTimeFlag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getInverseTimeFlag <em>Inverse Time Flag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inverse Time Flag</em>' attribute is set.
     * @see #unsetInverseTimeFlag()
     * @see #getInverseTimeFlag()
     * @see #setInverseTimeFlag(Boolean)
     * @generated
     */
    boolean isSetInverseTimeFlag();

    /**
     * Returns the value of the '<em><b>Time Delay1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Delay1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Delay1</em>' attribute.
     * @see #isSetTimeDelay1()
     * @see #unsetTimeDelay1()
     * @see #setTimeDelay1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay_TimeDelay1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentRelay.timeDelay1' kind='element'"
     * @generated
     */
    Float getTimeDelay1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay1 <em>Time Delay1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Delay1</em>' attribute.
     * @see #isSetTimeDelay1()
     * @see #unsetTimeDelay1()
     * @see #getTimeDelay1()
     * @generated
     */
    void setTimeDelay1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay1 <em>Time Delay1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeDelay1()
     * @see #getTimeDelay1()
     * @see #setTimeDelay1(Float)
     * @generated
     */
    void unsetTimeDelay1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay1 <em>Time Delay1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Delay1</em>' attribute is set.
     * @see #unsetTimeDelay1()
     * @see #getTimeDelay1()
     * @see #setTimeDelay1(Float)
     * @generated
     */
    boolean isSetTimeDelay1();

    /**
     * Returns the value of the '<em><b>Time Delay2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Delay2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Delay2</em>' attribute.
     * @see #isSetTimeDelay2()
     * @see #unsetTimeDelay2()
     * @see #setTimeDelay2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay_TimeDelay2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentRelay.timeDelay2' kind='element'"
     * @generated
     */
    Float getTimeDelay2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay2 <em>Time Delay2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Delay2</em>' attribute.
     * @see #isSetTimeDelay2()
     * @see #unsetTimeDelay2()
     * @see #getTimeDelay2()
     * @generated
     */
    void setTimeDelay2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay2 <em>Time Delay2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeDelay2()
     * @see #getTimeDelay2()
     * @see #setTimeDelay2(Float)
     * @generated
     */
    void unsetTimeDelay2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay2 <em>Time Delay2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Delay2</em>' attribute is set.
     * @see #unsetTimeDelay2()
     * @see #getTimeDelay2()
     * @see #setTimeDelay2(Float)
     * @generated
     */
    boolean isSetTimeDelay2();

    /**
     * Returns the value of the '<em><b>Time Delay3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Delay3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Delay3</em>' attribute.
     * @see #isSetTimeDelay3()
     * @see #unsetTimeDelay3()
     * @see #setTimeDelay3(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCurrentRelay_TimeDelay3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CurrentRelay.timeDelay3' kind='element'"
     * @generated
     */
    Float getTimeDelay3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay3 <em>Time Delay3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Delay3</em>' attribute.
     * @see #isSetTimeDelay3()
     * @see #unsetTimeDelay3()
     * @see #getTimeDelay3()
     * @generated
     */
    void setTimeDelay3( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay3 <em>Time Delay3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeDelay3()
     * @see #getTimeDelay3()
     * @see #setTimeDelay3(Float)
     * @generated
     */
    void unsetTimeDelay3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CurrentRelay#getTimeDelay3 <em>Time Delay3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Delay3</em>' attribute is set.
     * @see #unsetTimeDelay3()
     * @see #getTimeDelay3()
     * @see #setTimeDelay3(Float)
     * @generated
     */
    boolean isSetTimeDelay3();

} // CurrentRelay
