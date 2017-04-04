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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getCustomerCount <em>Customer Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPhaseConnection <em>Phase Connection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getEnergyConsumerPhase <em>Energy Consumer Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer()
 * @model
 * @generated
 */
public interface EnergyConsumer extends EnergyConnection {
    /**
     * Returns the value of the '<em><b>Customer Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Count</em>' attribute.
     * @see #isSetCustomerCount()
     * @see #unsetCustomerCount()
     * @see #setCustomerCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_CustomerCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.customerCount' kind='element'"
     * @generated
     */
    Integer getCustomerCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getCustomerCount <em>Customer Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Count</em>' attribute.
     * @see #isSetCustomerCount()
     * @see #unsetCustomerCount()
     * @see #getCustomerCount()
     * @generated
     */
    void setCustomerCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getCustomerCount <em>Customer Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerCount()
     * @see #getCustomerCount()
     * @see #setCustomerCount(Integer)
     * @generated
     */
    void unsetCustomerCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getCustomerCount <em>Customer Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Count</em>' attribute is set.
     * @see #unsetCustomerCount()
     * @see #getCustomerCount()
     * @see #setCustomerCount(Integer)
     * @generated
     */
    boolean isSetCustomerCount();

    /**
     * Returns the value of the '<em><b>Grounded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grounded</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #setGrounded(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_Grounded()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.grounded' kind='element'"
     * @generated
     */
    Boolean getGrounded();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @generated
     */
    void setGrounded( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    void unsetGrounded();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getGrounded <em>Grounded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounded</em>' attribute is set.
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    boolean isSetGrounded();

    /**
     * Returns the value of the '<em><b>P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #setP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_P()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.p' kind='element'"
     * @generated
     */
    Float getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #getP()
     * @generated
     */
    void setP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Float)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getP <em>P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P</em>' attribute is set.
     * @see #unsetP()
     * @see #getP()
     * @see #setP(Float)
     * @generated
     */
    boolean isSetP();

    /**
     * Returns the value of the '<em><b>Pfixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pfixed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pfixed</em>' attribute.
     * @see #isSetPfixed()
     * @see #unsetPfixed()
     * @see #setPfixed(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_Pfixed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.pfixed' kind='element'"
     * @generated
     */
    Float getPfixed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pfixed</em>' attribute.
     * @see #isSetPfixed()
     * @see #unsetPfixed()
     * @see #getPfixed()
     * @generated
     */
    void setPfixed( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfixed()
     * @see #getPfixed()
     * @see #setPfixed(Float)
     * @generated
     */
    void unsetPfixed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pfixed</em>' attribute is set.
     * @see #unsetPfixed()
     * @see #getPfixed()
     * @see #setPfixed(Float)
     * @generated
     */
    boolean isSetPfixed();

    /**
     * Returns the value of the '<em><b>Pfixed Pct</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pfixed Pct</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pfixed Pct</em>' attribute.
     * @see #isSetPfixedPct()
     * @see #unsetPfixedPct()
     * @see #setPfixedPct(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_PfixedPct()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.pfixedPct' kind='element'"
     * @generated
     */
    Float getPfixedPct();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pfixed Pct</em>' attribute.
     * @see #isSetPfixedPct()
     * @see #unsetPfixedPct()
     * @see #getPfixedPct()
     * @generated
     */
    void setPfixedPct( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfixedPct()
     * @see #getPfixedPct()
     * @see #setPfixedPct(Float)
     * @generated
     */
    void unsetPfixedPct();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pfixed Pct</em>' attribute is set.
     * @see #unsetPfixedPct()
     * @see #getPfixedPct()
     * @see #setPfixedPct(Float)
     * @generated
     */
    boolean isSetPfixedPct();

    /**
     * Returns the value of the '<em><b>Phase Connection</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Connection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Connection</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind
     * @see #isSetPhaseConnection()
     * @see #unsetPhaseConnection()
     * @see #setPhaseConnection(PhaseShuntConnectionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_PhaseConnection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.phaseConnection' kind='element'"
     * @generated
     */
    PhaseShuntConnectionKind getPhaseConnection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPhaseConnection <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Connection</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseShuntConnectionKind
     * @see #isSetPhaseConnection()
     * @see #unsetPhaseConnection()
     * @see #getPhaseConnection()
     * @generated
     */
    void setPhaseConnection( PhaseShuntConnectionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPhaseConnection <em>Phase Connection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseConnection()
     * @see #getPhaseConnection()
     * @see #setPhaseConnection(PhaseShuntConnectionKind)
     * @generated
     */
    void unsetPhaseConnection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPhaseConnection <em>Phase Connection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Connection</em>' attribute is set.
     * @see #unsetPhaseConnection()
     * @see #getPhaseConnection()
     * @see #setPhaseConnection(PhaseShuntConnectionKind)
     * @generated
     */
    boolean isSetPhaseConnection();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_Q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.q' kind='element'"
     * @generated
     */
    Float getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #getQ()
     * @generated
     */
    void setQ( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Float)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQ <em>Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q</em>' attribute is set.
     * @see #unsetQ()
     * @see #getQ()
     * @see #setQ(Float)
     * @generated
     */
    boolean isSetQ();

    /**
     * Returns the value of the '<em><b>Qfixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qfixed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qfixed</em>' attribute.
     * @see #isSetQfixed()
     * @see #unsetQfixed()
     * @see #setQfixed(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_Qfixed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.qfixed' kind='element'"
     * @generated
     */
    Float getQfixed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qfixed</em>' attribute.
     * @see #isSetQfixed()
     * @see #unsetQfixed()
     * @see #getQfixed()
     * @generated
     */
    void setQfixed( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQfixed()
     * @see #getQfixed()
     * @see #setQfixed(Float)
     * @generated
     */
    void unsetQfixed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qfixed</em>' attribute is set.
     * @see #unsetQfixed()
     * @see #getQfixed()
     * @see #setQfixed(Float)
     * @generated
     */
    boolean isSetQfixed();

    /**
     * Returns the value of the '<em><b>Qfixed Pct</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qfixed Pct</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Qfixed Pct</em>' attribute.
     * @see #isSetQfixedPct()
     * @see #unsetQfixedPct()
     * @see #setQfixedPct(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_QfixedPct()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.qfixedPct' kind='element'"
     * @generated
     */
    Float getQfixedPct();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qfixed Pct</em>' attribute.
     * @see #isSetQfixedPct()
     * @see #unsetQfixedPct()
     * @see #getQfixedPct()
     * @generated
     */
    void setQfixedPct( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQfixedPct()
     * @see #getQfixedPct()
     * @see #setQfixedPct(Float)
     * @generated
     */
    void unsetQfixedPct();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qfixed Pct</em>' attribute is set.
     * @see #unsetQfixedPct()
     * @see #getQfixedPct()
     * @see #setQfixedPct(Float)
     * @generated
     */
    boolean isSetQfixedPct();

    /**
     * Returns the value of the '<em><b>Energy Consumer Phase</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Consumer Phase</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Consumer Phase</em>' reference list.
     * @see #isSetEnergyConsumerPhase()
     * @see #unsetEnergyConsumerPhase()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_EnergyConsumerPhase()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getEnergyConsumer
     * @model opposite="EnergyConsumer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.EnergyConsumerPhase' kind='element'"
     * @generated
     */
    EList< EnergyConsumerPhase > getEnergyConsumerPhase();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getEnergyConsumerPhase <em>Energy Consumer Phase</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumerPhase()
     * @see #getEnergyConsumerPhase()
     * @generated
     */
    void unsetEnergyConsumerPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getEnergyConsumerPhase <em>Energy Consumer Phase</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumer Phase</em>' reference list is set.
     * @see #unsetEnergyConsumerPhase()
     * @see #getEnergyConsumerPhase()
     * @generated
     */
    boolean isSetEnergyConsumerPhase();

    /**
     * Returns the value of the '<em><b>Load Response</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Response</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Response</em>' reference.
     * @see #isSetLoadResponse()
     * @see #unsetLoadResponse()
     * @see #setLoadResponse(LoadResponseCharacteristic)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_LoadResponse()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getEnergyConsumer
     * @model opposite="EnergyConsumer" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.LoadResponse' kind='element'"
     * @generated
     */
    LoadResponseCharacteristic getLoadResponse();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Response</em>' reference.
     * @see #isSetLoadResponse()
     * @see #unsetLoadResponse()
     * @see #getLoadResponse()
     * @generated
     */
    void setLoadResponse( LoadResponseCharacteristic value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadResponse()
     * @see #getLoadResponse()
     * @see #setLoadResponse(LoadResponseCharacteristic)
     * @generated
     */
    void unsetLoadResponse();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Response</em>' reference is set.
     * @see #unsetLoadResponse()
     * @see #getLoadResponse()
     * @see #setLoadResponse(LoadResponseCharacteristic)
     * @generated
     */
    boolean isSetLoadResponse();

    /**
     * Returns the value of the '<em><b>Load Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadDynamics#getEnergyConsumer <em>Energy Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Load Dynamics</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Load Dynamics</em>' reference.
     * @see #isSetLoadDynamics()
     * @see #unsetLoadDynamics()
     * @see #setLoadDynamics(LoadDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_LoadDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadDynamics#getEnergyConsumer
     * @model opposite="EnergyConsumer" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.LoadDynamics' kind='element'"
     * @generated
     */
    LoadDynamics getLoadDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Dynamics</em>' reference.
     * @see #isSetLoadDynamics()
     * @see #unsetLoadDynamics()
     * @see #getLoadDynamics()
     * @generated
     */
    void setLoadDynamics( LoadDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadDynamics()
     * @see #getLoadDynamics()
     * @see #setLoadDynamics(LoadDynamics)
     * @generated
     */
    void unsetLoadDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Dynamics</em>' reference is set.
     * @see #unsetLoadDynamics()
     * @see #getLoadDynamics()
     * @see #setLoadDynamics(LoadDynamics)
     * @generated
     */
    boolean isSetLoadDynamics();

    /**
     * Returns the value of the '<em><b>Power Cut Zone</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Cut Zone</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Cut Zone</em>' reference.
     * @see #isSetPowerCutZone()
     * @see #unsetPowerCutZone()
     * @see #setPowerCutZone(PowerCutZone)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumer_PowerCutZone()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getEnergyConsumers
     * @model opposite="EnergyConsumers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumer.PowerCutZone' kind='element'"
     * @generated
     */
    PowerCutZone getPowerCutZone();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Cut Zone</em>' reference.
     * @see #isSetPowerCutZone()
     * @see #unsetPowerCutZone()
     * @see #getPowerCutZone()
     * @generated
     */
    void setPowerCutZone( PowerCutZone value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerCutZone()
     * @see #getPowerCutZone()
     * @see #setPowerCutZone(PowerCutZone)
     * @generated
     */
    void unsetPowerCutZone();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Cut Zone</em>' reference is set.
     * @see #unsetPowerCutZone()
     * @see #getPowerCutZone()
     * @see #setPowerCutZone(PowerCutZone)
     * @generated
     */
    boolean isSetPowerCutZone();

} // EnergyConsumer
