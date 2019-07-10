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
 * A representation of the model object '<em><b>Dispatchable Power Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentActivePower <em>Current Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentApparentPower <em>Current Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentReactivePower <em>Current Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxActivePower <em>Max Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxApparentPower <em>Max Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxReactivePower <em>Max Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinActivePower <em>Min Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinApparentPower <em>Min Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinReactivePower <em>Min Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDeviceGroup <em>End Device Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDevice <em>End Device</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability()
 * @model
 * @generated
 */
public interface DispatchablePowerCapability extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Current Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Active Power</em>' attribute.
     * @see #isSetCurrentActivePower()
     * @see #unsetCurrentActivePower()
     * @see #setCurrentActivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_CurrentActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.currentActivePower' kind='element'"
     * @generated
     */
    Float getCurrentActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentActivePower <em>Current Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Active Power</em>' attribute.
     * @see #isSetCurrentActivePower()
     * @see #unsetCurrentActivePower()
     * @see #getCurrentActivePower()
     * @generated
     */
    void setCurrentActivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentActivePower <em>Current Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentActivePower()
     * @see #getCurrentActivePower()
     * @see #setCurrentActivePower(Float)
     * @generated
     */
    void unsetCurrentActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentActivePower <em>Current Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Active Power</em>' attribute is set.
     * @see #unsetCurrentActivePower()
     * @see #getCurrentActivePower()
     * @see #setCurrentActivePower(Float)
     * @generated
     */
    boolean isSetCurrentActivePower();

    /**
     * Returns the value of the '<em><b>Current Apparent Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Apparent Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Apparent Power</em>' attribute.
     * @see #isSetCurrentApparentPower()
     * @see #unsetCurrentApparentPower()
     * @see #setCurrentApparentPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_CurrentApparentPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.currentApparentPower' kind='element'"
     * @generated
     */
    Float getCurrentApparentPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentApparentPower <em>Current Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Apparent Power</em>' attribute.
     * @see #isSetCurrentApparentPower()
     * @see #unsetCurrentApparentPower()
     * @see #getCurrentApparentPower()
     * @generated
     */
    void setCurrentApparentPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentApparentPower <em>Current Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentApparentPower()
     * @see #getCurrentApparentPower()
     * @see #setCurrentApparentPower(Float)
     * @generated
     */
    void unsetCurrentApparentPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentApparentPower <em>Current Apparent Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Apparent Power</em>' attribute is set.
     * @see #unsetCurrentApparentPower()
     * @see #getCurrentApparentPower()
     * @see #setCurrentApparentPower(Float)
     * @generated
     */
    boolean isSetCurrentApparentPower();

    /**
     * Returns the value of the '<em><b>Current Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Reactive Power</em>' attribute.
     * @see #isSetCurrentReactivePower()
     * @see #unsetCurrentReactivePower()
     * @see #setCurrentReactivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_CurrentReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.currentReactivePower' kind='element'"
     * @generated
     */
    Float getCurrentReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentReactivePower <em>Current Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Reactive Power</em>' attribute.
     * @see #isSetCurrentReactivePower()
     * @see #unsetCurrentReactivePower()
     * @see #getCurrentReactivePower()
     * @generated
     */
    void setCurrentReactivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentReactivePower <em>Current Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentReactivePower()
     * @see #getCurrentReactivePower()
     * @see #setCurrentReactivePower(Float)
     * @generated
     */
    void unsetCurrentReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getCurrentReactivePower <em>Current Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Reactive Power</em>' attribute is set.
     * @see #unsetCurrentReactivePower()
     * @see #getCurrentReactivePower()
     * @see #setCurrentReactivePower(Float)
     * @generated
     */
    boolean isSetCurrentReactivePower();

    /**
     * Returns the value of the '<em><b>Max Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Active Power</em>' attribute.
     * @see #isSetMaxActivePower()
     * @see #unsetMaxActivePower()
     * @see #setMaxActivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_MaxActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.maxActivePower' kind='element'"
     * @generated
     */
    Float getMaxActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxActivePower <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Active Power</em>' attribute.
     * @see #isSetMaxActivePower()
     * @see #unsetMaxActivePower()
     * @see #getMaxActivePower()
     * @generated
     */
    void setMaxActivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxActivePower <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxActivePower()
     * @see #getMaxActivePower()
     * @see #setMaxActivePower(Float)
     * @generated
     */
    void unsetMaxActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxActivePower <em>Max Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Active Power</em>' attribute is set.
     * @see #unsetMaxActivePower()
     * @see #getMaxActivePower()
     * @see #setMaxActivePower(Float)
     * @generated
     */
    boolean isSetMaxActivePower();

    /**
     * Returns the value of the '<em><b>Max Apparent Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Apparent Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Apparent Power</em>' attribute.
     * @see #isSetMaxApparentPower()
     * @see #unsetMaxApparentPower()
     * @see #setMaxApparentPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_MaxApparentPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.maxApparentPower' kind='element'"
     * @generated
     */
    Float getMaxApparentPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxApparentPower <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Apparent Power</em>' attribute.
     * @see #isSetMaxApparentPower()
     * @see #unsetMaxApparentPower()
     * @see #getMaxApparentPower()
     * @generated
     */
    void setMaxApparentPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxApparentPower <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxApparentPower()
     * @see #getMaxApparentPower()
     * @see #setMaxApparentPower(Float)
     * @generated
     */
    void unsetMaxApparentPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxApparentPower <em>Max Apparent Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Apparent Power</em>' attribute is set.
     * @see #unsetMaxApparentPower()
     * @see #getMaxApparentPower()
     * @see #setMaxApparentPower(Float)
     * @generated
     */
    boolean isSetMaxApparentPower();

    /**
     * Returns the value of the '<em><b>Max Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Reactive Power</em>' attribute.
     * @see #isSetMaxReactivePower()
     * @see #unsetMaxReactivePower()
     * @see #setMaxReactivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_MaxReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.maxReactivePower' kind='element'"
     * @generated
     */
    Float getMaxReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxReactivePower <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Reactive Power</em>' attribute.
     * @see #isSetMaxReactivePower()
     * @see #unsetMaxReactivePower()
     * @see #getMaxReactivePower()
     * @generated
     */
    void setMaxReactivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxReactivePower <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxReactivePower()
     * @see #getMaxReactivePower()
     * @see #setMaxReactivePower(Float)
     * @generated
     */
    void unsetMaxReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMaxReactivePower <em>Max Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Reactive Power</em>' attribute is set.
     * @see #unsetMaxReactivePower()
     * @see #getMaxReactivePower()
     * @see #setMaxReactivePower(Float)
     * @generated
     */
    boolean isSetMaxReactivePower();

    /**
     * Returns the value of the '<em><b>Min Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Active Power</em>' attribute.
     * @see #isSetMinActivePower()
     * @see #unsetMinActivePower()
     * @see #setMinActivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_MinActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.minActivePower' kind='element'"
     * @generated
     */
    Float getMinActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinActivePower <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Active Power</em>' attribute.
     * @see #isSetMinActivePower()
     * @see #unsetMinActivePower()
     * @see #getMinActivePower()
     * @generated
     */
    void setMinActivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinActivePower <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinActivePower()
     * @see #getMinActivePower()
     * @see #setMinActivePower(Float)
     * @generated
     */
    void unsetMinActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinActivePower <em>Min Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Active Power</em>' attribute is set.
     * @see #unsetMinActivePower()
     * @see #getMinActivePower()
     * @see #setMinActivePower(Float)
     * @generated
     */
    boolean isSetMinActivePower();

    /**
     * Returns the value of the '<em><b>Min Apparent Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Apparent Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Apparent Power</em>' attribute.
     * @see #isSetMinApparentPower()
     * @see #unsetMinApparentPower()
     * @see #setMinApparentPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_MinApparentPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.minApparentPower' kind='element'"
     * @generated
     */
    Float getMinApparentPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinApparentPower <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Apparent Power</em>' attribute.
     * @see #isSetMinApparentPower()
     * @see #unsetMinApparentPower()
     * @see #getMinApparentPower()
     * @generated
     */
    void setMinApparentPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinApparentPower <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinApparentPower()
     * @see #getMinApparentPower()
     * @see #setMinApparentPower(Float)
     * @generated
     */
    void unsetMinApparentPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinApparentPower <em>Min Apparent Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Apparent Power</em>' attribute is set.
     * @see #unsetMinApparentPower()
     * @see #getMinApparentPower()
     * @see #setMinApparentPower(Float)
     * @generated
     */
    boolean isSetMinApparentPower();

    /**
     * Returns the value of the '<em><b>Min Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Reactive Power</em>' attribute.
     * @see #isSetMinReactivePower()
     * @see #unsetMinReactivePower()
     * @see #setMinReactivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_MinReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.minReactivePower' kind='element'"
     * @generated
     */
    Float getMinReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinReactivePower <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Reactive Power</em>' attribute.
     * @see #isSetMinReactivePower()
     * @see #unsetMinReactivePower()
     * @see #getMinReactivePower()
     * @generated
     */
    void setMinReactivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinReactivePower <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinReactivePower()
     * @see #getMinReactivePower()
     * @see #setMinReactivePower(Float)
     * @generated
     */
    void unsetMinReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getMinReactivePower <em>Min Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Reactive Power</em>' attribute is set.
     * @see #unsetMinReactivePower()
     * @see #getMinReactivePower()
     * @see #setMinReactivePower(Float)
     * @generated
     */
    boolean isSetMinReactivePower();

    /**
     * Returns the value of the '<em><b>End Device Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getDispatchablePowerCapability <em>Dispatchable Power Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Group</em>' reference.
     * @see #isSetEndDeviceGroup()
     * @see #unsetEndDeviceGroup()
     * @see #setEndDeviceGroup(EndDeviceGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_EndDeviceGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getDispatchablePowerCapability
     * @model opposite="DispatchablePowerCapability" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.EndDeviceGroup' kind='element'"
     * @generated
     */
    EndDeviceGroup getEndDeviceGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDeviceGroup <em>End Device Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Group</em>' reference.
     * @see #isSetEndDeviceGroup()
     * @see #unsetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @generated
     */
    void setEndDeviceGroup( EndDeviceGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDeviceGroup <em>End Device Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @see #setEndDeviceGroup(EndDeviceGroup)
     * @generated
     */
    void unsetEndDeviceGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDeviceGroup <em>End Device Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Group</em>' reference is set.
     * @see #unsetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @see #setEndDeviceGroup(EndDeviceGroup)
     * @generated
     */
    boolean isSetEndDeviceGroup();

    /**
     * Returns the value of the '<em><b>End Device</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getDispatchablePowerCapability <em>Dispatchable Power Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device</em>' reference.
     * @see #isSetEndDevice()
     * @see #unsetEndDevice()
     * @see #setEndDevice(EndDevice)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDispatchablePowerCapability_EndDevice()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getDispatchablePowerCapability
     * @model opposite="DispatchablePowerCapability" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DispatchablePowerCapability.EndDevice' kind='element'"
     * @generated
     */
    EndDevice getEndDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDevice <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device</em>' reference.
     * @see #isSetEndDevice()
     * @see #unsetEndDevice()
     * @see #getEndDevice()
     * @generated
     */
    void setEndDevice( EndDevice value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDevice <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDevice()
     * @see #getEndDevice()
     * @see #setEndDevice(EndDevice)
     * @generated
     */
    void unsetEndDevice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDevice <em>End Device</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device</em>' reference is set.
     * @see #unsetEndDevice()
     * @see #getEndDevice()
     * @see #setEndDevice(EndDevice)
     * @generated
     */
    boolean isSetEndDevice();

} // DispatchablePowerCapability
