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
 * A representation of the model object '<em><b>Wind Cont Pitch Angle IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC()
 * @model
 * @generated
 */
public interface WindContPitchAngleIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dthetamax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dthetamax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #setDthetamax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Dthetamax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.dthetamax' kind='element'"
     * @generated
     */
    Float getDthetamax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @generated
     */
    void setDthetamax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Float)
     * @generated
     */
    void unsetDthetamax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamax <em>Dthetamax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamax</em>' attribute is set.
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Float)
     * @generated
     */
    boolean isSetDthetamax();

    /**
     * Returns the value of the '<em><b>Dthetamin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dthetamin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dthetamin</em>' attribute.
     * @see #isSetDthetamin()
     * @see #unsetDthetamin()
     * @see #setDthetamin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Dthetamin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.dthetamin' kind='element'"
     * @generated
     */
    Float getDthetamin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamin</em>' attribute.
     * @see #isSetDthetamin()
     * @see #unsetDthetamin()
     * @see #getDthetamin()
     * @generated
     */
    void setDthetamin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamin()
     * @see #getDthetamin()
     * @see #setDthetamin(Float)
     * @generated
     */
    void unsetDthetamin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getDthetamin <em>Dthetamin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamin</em>' attribute is set.
     * @see #unsetDthetamin()
     * @see #getDthetamin()
     * @see #setDthetamin(Float)
     * @generated
     */
    boolean isSetDthetamin();

    /**
     * Returns the value of the '<em><b>Kic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kic</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kic</em>' attribute.
     * @see #isSetKic()
     * @see #unsetKic()
     * @see #setKic(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Kic()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.kic' kind='element'"
     * @generated
     */
    Float getKic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kic</em>' attribute.
     * @see #isSetKic()
     * @see #unsetKic()
     * @see #getKic()
     * @generated
     */
    void setKic( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKic()
     * @see #getKic()
     * @see #setKic(Float)
     * @generated
     */
    void unsetKic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKic <em>Kic</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kic</em>' attribute is set.
     * @see #unsetKic()
     * @see #getKic()
     * @see #setKic(Float)
     * @generated
     */
    boolean isSetKic();

    /**
     * Returns the value of the '<em><b>Kiomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiomega</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiomega</em>' attribute.
     * @see #isSetKiomega()
     * @see #unsetKiomega()
     * @see #setKiomega(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Kiomega()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.kiomega' kind='element'"
     * @generated
     */
    Float getKiomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiomega</em>' attribute.
     * @see #isSetKiomega()
     * @see #unsetKiomega()
     * @see #getKiomega()
     * @generated
     */
    void setKiomega( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiomega()
     * @see #getKiomega()
     * @see #setKiomega(Float)
     * @generated
     */
    void unsetKiomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKiomega <em>Kiomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiomega</em>' attribute is set.
     * @see #unsetKiomega()
     * @see #getKiomega()
     * @see #setKiomega(Float)
     * @generated
     */
    boolean isSetKiomega();

    /**
     * Returns the value of the '<em><b>Kpc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #setKpc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Kpc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.kpc' kind='element'"
     * @generated
     */
    Float getKpc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpc</em>' attribute.
     * @see #isSetKpc()
     * @see #unsetKpc()
     * @see #getKpc()
     * @generated
     */
    void setKpc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpc()
     * @see #getKpc()
     * @see #setKpc(Float)
     * @generated
     */
    void unsetKpc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpc <em>Kpc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpc</em>' attribute is set.
     * @see #unsetKpc()
     * @see #getKpc()
     * @see #setKpc(Float)
     * @generated
     */
    boolean isSetKpc();

    /**
     * Returns the value of the '<em><b>Kpomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpomega</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpomega</em>' attribute.
     * @see #isSetKpomega()
     * @see #unsetKpomega()
     * @see #setKpomega(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Kpomega()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.kpomega' kind='element'"
     * @generated
     */
    Float getKpomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpomega</em>' attribute.
     * @see #isSetKpomega()
     * @see #unsetKpomega()
     * @see #getKpomega()
     * @generated
     */
    void setKpomega( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpomega()
     * @see #getKpomega()
     * @see #setKpomega(Float)
     * @generated
     */
    void unsetKpomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpomega <em>Kpomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpomega</em>' attribute is set.
     * @see #unsetKpomega()
     * @see #getKpomega()
     * @see #setKpomega(Float)
     * @generated
     */
    boolean isSetKpomega();

    /**
     * Returns the value of the '<em><b>Kpx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpx</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpx</em>' attribute.
     * @see #isSetKpx()
     * @see #unsetKpx()
     * @see #setKpx(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Kpx()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.kpx' kind='element'"
     * @generated
     */
    Float getKpx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpx</em>' attribute.
     * @see #isSetKpx()
     * @see #unsetKpx()
     * @see #getKpx()
     * @generated
     */
    void setKpx( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpx()
     * @see #getKpx()
     * @see #setKpx(Float)
     * @generated
     */
    void unsetKpx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getKpx <em>Kpx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpx</em>' attribute is set.
     * @see #unsetKpx()
     * @see #getKpx()
     * @see #setKpx(Float)
     * @generated
     */
    boolean isSetKpx();

    /**
     * Returns the value of the '<em><b>Thetamax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetamax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetamax</em>' attribute.
     * @see #isSetThetamax()
     * @see #unsetThetamax()
     * @see #setThetamax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Thetamax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.thetamax' kind='element'"
     * @generated
     */
    Float getThetamax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetamax</em>' attribute.
     * @see #isSetThetamax()
     * @see #unsetThetamax()
     * @see #getThetamax()
     * @generated
     */
    void setThetamax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetamax()
     * @see #getThetamax()
     * @see #setThetamax(Float)
     * @generated
     */
    void unsetThetamax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamax <em>Thetamax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetamax</em>' attribute is set.
     * @see #unsetThetamax()
     * @see #getThetamax()
     * @see #setThetamax(Float)
     * @generated
     */
    boolean isSetThetamax();

    /**
     * Returns the value of the '<em><b>Thetamin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetamin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetamin</em>' attribute.
     * @see #isSetThetamin()
     * @see #unsetThetamin()
     * @see #setThetamin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Thetamin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.thetamin' kind='element'"
     * @generated
     */
    Float getThetamin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetamin</em>' attribute.
     * @see #isSetThetamin()
     * @see #unsetThetamin()
     * @see #getThetamin()
     * @generated
     */
    void setThetamin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetamin()
     * @see #getThetamin()
     * @see #setThetamin(Float)
     * @generated
     */
    void unsetThetamin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getThetamin <em>Thetamin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetamin</em>' attribute is set.
     * @see #unsetThetamin()
     * @see #getThetamin()
     * @see #setThetamin(Float)
     * @generated
     */
    boolean isSetThetamin();

    /**
     * Returns the value of the '<em><b>Ttheta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ttheta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ttheta</em>' attribute.
     * @see #isSetTtheta()
     * @see #unsetTtheta()
     * @see #setTtheta(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_Ttheta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.ttheta' kind='element'"
     * @generated
     */
    Float getTtheta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ttheta</em>' attribute.
     * @see #isSetTtheta()
     * @see #unsetTtheta()
     * @see #getTtheta()
     * @generated
     */
    void setTtheta( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTtheta()
     * @see #getTtheta()
     * @see #setTtheta(Float)
     * @generated
     */
    void unsetTtheta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getTtheta <em>Ttheta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ttheta</em>' attribute is set.
     * @see #unsetTtheta()
     * @see #getTtheta()
     * @see #setTtheta(Float)
     * @generated
     */
    boolean isSetTtheta();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type3 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindContPitchAngleIEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPitchAngleIEC
     * @model opposite="WindContPitchAngleIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindContPitchAngleIEC.WindTurbineType3IEC' kind='element'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @generated
     */
    void setWindTurbineType3IEC( WindTurbineType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    boolean isSetWindTurbineType3IEC();

} // WindContPitchAngleIEC
