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
 * A representation of the model object '<em><b>Energy Consumer Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase()
 * @model
 * @generated
 */
public interface EnergyConsumerPhase extends PowerSystemResource {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_P()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.p' kind='element'"
     * @generated
     */
    Float getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getP <em>P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Float)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getP <em>P</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_Pfixed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.pfixed' kind='element'"
     * @generated
     */
    Float getPfixed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixed <em>Pfixed</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixed <em>Pfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfixed()
     * @see #getPfixed()
     * @see #setPfixed(Float)
     * @generated
     */
    void unsetPfixed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixed <em>Pfixed</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_PfixedPct()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.pfixedPct' kind='element'"
     * @generated
     */
    Float getPfixedPct();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixedPct <em>Pfixed Pct</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixedPct <em>Pfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfixedPct()
     * @see #getPfixedPct()
     * @see #setPfixedPct(Float)
     * @generated
     */
    void unsetPfixedPct();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPfixedPct <em>Pfixed Pct</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Phase</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhase()
     * @see #unsetPhase()
     * @see #setPhase(SinglePhaseKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_Phase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.phase' kind='element'"
     * @generated
     */
    SinglePhaseKind getPhase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhase()
     * @see #unsetPhase()
     * @see #getPhase()
     * @generated
     */
    void setPhase( SinglePhaseKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhase()
     * @see #getPhase()
     * @see #setPhase(SinglePhaseKind)
     * @generated
     */
    void unsetPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getPhase <em>Phase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase</em>' attribute is set.
     * @see #unsetPhase()
     * @see #getPhase()
     * @see #setPhase(SinglePhaseKind)
     * @generated
     */
    boolean isSetPhase();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_Q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.q' kind='element'"
     * @generated
     */
    Float getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQ <em>Q</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Float)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQ <em>Q</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_Qfixed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.qfixed' kind='element'"
     * @generated
     */
    Float getQfixed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixed <em>Qfixed</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixed <em>Qfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQfixed()
     * @see #getQfixed()
     * @see #setQfixed(Float)
     * @generated
     */
    void unsetQfixed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixed <em>Qfixed</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_QfixedPct()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.qfixedPct' kind='element'"
     * @generated
     */
    Float getQfixedPct();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixedPct <em>Qfixed Pct</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixedPct <em>Qfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQfixedPct()
     * @see #getQfixedPct()
     * @see #setQfixedPct(Float)
     * @generated
     */
    void unsetQfixedPct();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getQfixedPct <em>Qfixed Pct</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Energy Consumer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getEnergyConsumerPhase <em>Energy Consumer Phase</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Consumer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Consumer</em>' reference.
     * @see #isSetEnergyConsumer()
     * @see #unsetEnergyConsumer()
     * @see #setEnergyConsumer(EnergyConsumer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEnergyConsumerPhase_EnergyConsumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getEnergyConsumerPhase
     * @model opposite="EnergyConsumerPhase" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EnergyConsumerPhase.EnergyConsumer' kind='element'"
     * @generated
     */
    EnergyConsumer getEnergyConsumer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Consumer</em>' reference.
     * @see #isSetEnergyConsumer()
     * @see #unsetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @generated
     */
    void setEnergyConsumer( EnergyConsumer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @see #setEnergyConsumer(EnergyConsumer)
     * @generated
     */
    void unsetEnergyConsumer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumerPhase#getEnergyConsumer <em>Energy Consumer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumer</em>' reference is set.
     * @see #unsetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @see #setEnergyConsumer(EnergyConsumer)
     * @generated
     */
    boolean isSetEnergyConsumer();

} // EnergyConsumerPhase
