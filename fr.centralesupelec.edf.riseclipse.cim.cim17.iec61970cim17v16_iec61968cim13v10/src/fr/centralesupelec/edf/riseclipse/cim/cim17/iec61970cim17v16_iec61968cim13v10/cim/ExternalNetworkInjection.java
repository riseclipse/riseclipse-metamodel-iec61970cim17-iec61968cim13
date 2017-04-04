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
 * A representation of the model object '<em><b>External Network Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection()
 * @model
 * @generated
 */
public interface ExternalNetworkInjection extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>Governor SCD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Governor SCD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #setGovernorSCD(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_GovernorSCD()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.governorSCD' kind='element'"
     * @generated
     */
    Float getGovernorSCD();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @generated
     */
    void setGovernorSCD( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Float)
     * @generated
     */
    void unsetGovernorSCD();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Governor SCD</em>' attribute is set.
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Float)
     * @generated
     */
    boolean isSetGovernorSCD();

    /**
     * Returns the value of the '<em><b>Ik Second</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ik Second</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ik Second</em>' attribute.
     * @see #isSetIkSecond()
     * @see #unsetIkSecond()
     * @see #setIkSecond(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_IkSecond()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.ikSecond' kind='element'"
     * @generated
     */
    Boolean getIkSecond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ik Second</em>' attribute.
     * @see #isSetIkSecond()
     * @see #unsetIkSecond()
     * @see #getIkSecond()
     * @generated
     */
    void setIkSecond( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIkSecond()
     * @see #getIkSecond()
     * @see #setIkSecond(Boolean)
     * @generated
     */
    void unsetIkSecond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ik Second</em>' attribute is set.
     * @see #unsetIkSecond()
     * @see #getIkSecond()
     * @see #setIkSecond(Boolean)
     * @generated
     */
    boolean isSetIkSecond();

    /**
     * Returns the value of the '<em><b>Max Initial Sym Sh CCurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Initial Sym Sh CCurrent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMaxInitialSymShCCurrent()
     * @see #unsetMaxInitialSymShCCurrent()
     * @see #setMaxInitialSymShCCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MaxInitialSymShCCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.maxInitialSymShCCurrent' kind='element'"
     * @generated
     */
    Float getMaxInitialSymShCCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMaxInitialSymShCCurrent()
     * @see #unsetMaxInitialSymShCCurrent()
     * @see #getMaxInitialSymShCCurrent()
     * @generated
     */
    void setMaxInitialSymShCCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxInitialSymShCCurrent()
     * @see #getMaxInitialSymShCCurrent()
     * @see #setMaxInitialSymShCCurrent(Float)
     * @generated
     */
    void unsetMaxInitialSymShCCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Initial Sym Sh CCurrent</em>' attribute is set.
     * @see #unsetMaxInitialSymShCCurrent()
     * @see #getMaxInitialSymShCCurrent()
     * @see #setMaxInitialSymShCCurrent(Float)
     * @generated
     */
    boolean isSetMaxInitialSymShCCurrent();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MaxP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.maxP' kind='element'"
     * @generated
     */
    Float getMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Float)
     * @generated
     */
    void unsetMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Max Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #setMaxQ(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MaxQ()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.maxQ' kind='element'"
     * @generated
     */
    Float getMaxQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @generated
     */
    void setMaxQ( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Float)
     * @generated
     */
    void unsetMaxQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Q</em>' attribute is set.
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Float)
     * @generated
     */
    boolean isSetMaxQ();

    /**
     * Returns the value of the '<em><b>Max R0 To X0 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max R0 To X0 Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max R0 To X0 Ratio</em>' attribute.
     * @see #isSetMaxR0ToX0Ratio()
     * @see #unsetMaxR0ToX0Ratio()
     * @see #setMaxR0ToX0Ratio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MaxR0ToX0Ratio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.maxR0ToX0Ratio' kind='element'"
     * @generated
     */
    Float getMaxR0ToX0Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max R0 To X0 Ratio</em>' attribute.
     * @see #isSetMaxR0ToX0Ratio()
     * @see #unsetMaxR0ToX0Ratio()
     * @see #getMaxR0ToX0Ratio()
     * @generated
     */
    void setMaxR0ToX0Ratio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxR0ToX0Ratio()
     * @see #getMaxR0ToX0Ratio()
     * @see #setMaxR0ToX0Ratio(Float)
     * @generated
     */
    void unsetMaxR0ToX0Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max R0 To X0 Ratio</em>' attribute is set.
     * @see #unsetMaxR0ToX0Ratio()
     * @see #getMaxR0ToX0Ratio()
     * @see #setMaxR0ToX0Ratio(Float)
     * @generated
     */
    boolean isSetMaxR0ToX0Ratio();

    /**
     * Returns the value of the '<em><b>Max R1 To X1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max R1 To X1 Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max R1 To X1 Ratio</em>' attribute.
     * @see #isSetMaxR1ToX1Ratio()
     * @see #unsetMaxR1ToX1Ratio()
     * @see #setMaxR1ToX1Ratio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MaxR1ToX1Ratio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.maxR1ToX1Ratio' kind='element'"
     * @generated
     */
    Float getMaxR1ToX1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max R1 To X1 Ratio</em>' attribute.
     * @see #isSetMaxR1ToX1Ratio()
     * @see #unsetMaxR1ToX1Ratio()
     * @see #getMaxR1ToX1Ratio()
     * @generated
     */
    void setMaxR1ToX1Ratio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxR1ToX1Ratio()
     * @see #getMaxR1ToX1Ratio()
     * @see #setMaxR1ToX1Ratio(Float)
     * @generated
     */
    void unsetMaxR1ToX1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max R1 To X1 Ratio</em>' attribute is set.
     * @see #unsetMaxR1ToX1Ratio()
     * @see #getMaxR1ToX1Ratio()
     * @see #setMaxR1ToX1Ratio(Float)
     * @generated
     */
    boolean isSetMaxR1ToX1Ratio();

    /**
     * Returns the value of the '<em><b>Max Z0 To Z1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Z0 To Z1 Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMaxZ0ToZ1Ratio()
     * @see #unsetMaxZ0ToZ1Ratio()
     * @see #setMaxZ0ToZ1Ratio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MaxZ0ToZ1Ratio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.maxZ0ToZ1Ratio' kind='element'"
     * @generated
     */
    Float getMaxZ0ToZ1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMaxZ0ToZ1Ratio()
     * @see #unsetMaxZ0ToZ1Ratio()
     * @see #getMaxZ0ToZ1Ratio()
     * @generated
     */
    void setMaxZ0ToZ1Ratio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxZ0ToZ1Ratio()
     * @see #getMaxZ0ToZ1Ratio()
     * @see #setMaxZ0ToZ1Ratio(Float)
     * @generated
     */
    void unsetMaxZ0ToZ1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Z0 To Z1 Ratio</em>' attribute is set.
     * @see #unsetMaxZ0ToZ1Ratio()
     * @see #getMaxZ0ToZ1Ratio()
     * @see #setMaxZ0ToZ1Ratio(Float)
     * @generated
     */
    boolean isSetMaxZ0ToZ1Ratio();

    /**
     * Returns the value of the '<em><b>Min Initial Sym Sh CCurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Initial Sym Sh CCurrent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMinInitialSymShCCurrent()
     * @see #unsetMinInitialSymShCCurrent()
     * @see #setMinInitialSymShCCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MinInitialSymShCCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.minInitialSymShCCurrent' kind='element'"
     * @generated
     */
    Float getMinInitialSymShCCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMinInitialSymShCCurrent()
     * @see #unsetMinInitialSymShCCurrent()
     * @see #getMinInitialSymShCCurrent()
     * @generated
     */
    void setMinInitialSymShCCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinInitialSymShCCurrent()
     * @see #getMinInitialSymShCCurrent()
     * @see #setMinInitialSymShCCurrent(Float)
     * @generated
     */
    void unsetMinInitialSymShCCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Initial Sym Sh CCurrent</em>' attribute is set.
     * @see #unsetMinInitialSymShCCurrent()
     * @see #getMinInitialSymShCCurrent()
     * @see #setMinInitialSymShCCurrent(Float)
     * @generated
     */
    boolean isSetMinInitialSymShCCurrent();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MinP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.minP' kind='element'"
     * @generated
     */
    Float getMinP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinP()
     * @see #getMinP()
     * @see #setMinP(Float)
     * @generated
     */
    void unsetMinP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Min Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #setMinQ(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MinQ()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.minQ' kind='element'"
     * @generated
     */
    Float getMinQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @generated
     */
    void setMinQ( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Float)
     * @generated
     */
    void unsetMinQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Q</em>' attribute is set.
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Float)
     * @generated
     */
    boolean isSetMinQ();

    /**
     * Returns the value of the '<em><b>Min R0 To X0 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min R0 To X0 Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min R0 To X0 Ratio</em>' attribute.
     * @see #isSetMinR0ToX0Ratio()
     * @see #unsetMinR0ToX0Ratio()
     * @see #setMinR0ToX0Ratio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MinR0ToX0Ratio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.minR0ToX0Ratio' kind='element'"
     * @generated
     */
    Float getMinR0ToX0Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min R0 To X0 Ratio</em>' attribute.
     * @see #isSetMinR0ToX0Ratio()
     * @see #unsetMinR0ToX0Ratio()
     * @see #getMinR0ToX0Ratio()
     * @generated
     */
    void setMinR0ToX0Ratio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinR0ToX0Ratio()
     * @see #getMinR0ToX0Ratio()
     * @see #setMinR0ToX0Ratio(Float)
     * @generated
     */
    void unsetMinR0ToX0Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min R0 To X0 Ratio</em>' attribute is set.
     * @see #unsetMinR0ToX0Ratio()
     * @see #getMinR0ToX0Ratio()
     * @see #setMinR0ToX0Ratio(Float)
     * @generated
     */
    boolean isSetMinR0ToX0Ratio();

    /**
     * Returns the value of the '<em><b>Min R1 To X1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min R1 To X1 Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min R1 To X1 Ratio</em>' attribute.
     * @see #isSetMinR1ToX1Ratio()
     * @see #unsetMinR1ToX1Ratio()
     * @see #setMinR1ToX1Ratio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MinR1ToX1Ratio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.minR1ToX1Ratio' kind='element'"
     * @generated
     */
    Float getMinR1ToX1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min R1 To X1 Ratio</em>' attribute.
     * @see #isSetMinR1ToX1Ratio()
     * @see #unsetMinR1ToX1Ratio()
     * @see #getMinR1ToX1Ratio()
     * @generated
     */
    void setMinR1ToX1Ratio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinR1ToX1Ratio()
     * @see #getMinR1ToX1Ratio()
     * @see #setMinR1ToX1Ratio(Float)
     * @generated
     */
    void unsetMinR1ToX1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min R1 To X1 Ratio</em>' attribute is set.
     * @see #unsetMinR1ToX1Ratio()
     * @see #getMinR1ToX1Ratio()
     * @see #setMinR1ToX1Ratio(Float)
     * @generated
     */
    boolean isSetMinR1ToX1Ratio();

    /**
     * Returns the value of the '<em><b>Min Z0 To Z1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Z0 To Z1 Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMinZ0ToZ1Ratio()
     * @see #unsetMinZ0ToZ1Ratio()
     * @see #setMinZ0ToZ1Ratio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_MinZ0ToZ1Ratio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.minZ0ToZ1Ratio' kind='element'"
     * @generated
     */
    Float getMinZ0ToZ1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMinZ0ToZ1Ratio()
     * @see #unsetMinZ0ToZ1Ratio()
     * @see #getMinZ0ToZ1Ratio()
     * @generated
     */
    void setMinZ0ToZ1Ratio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinZ0ToZ1Ratio()
     * @see #getMinZ0ToZ1Ratio()
     * @see #setMinZ0ToZ1Ratio(Float)
     * @generated
     */
    void unsetMinZ0ToZ1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Z0 To Z1 Ratio</em>' attribute is set.
     * @see #unsetMinZ0ToZ1Ratio()
     * @see #getMinZ0ToZ1Ratio()
     * @see #setMinZ0ToZ1Ratio(Float)
     * @generated
     */
    boolean isSetMinZ0ToZ1Ratio();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_P()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.p' kind='element'"
     * @generated
     */
    Float getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getP <em>P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Float)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getP <em>P</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_Q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.q' kind='element'"
     * @generated
     */
    Float getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getQ <em>Q</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Float)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getQ <em>Q</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Reference Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #setReferencePriority(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_ReferencePriority()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.referencePriority' kind='element'"
     * @generated
     */
    Integer getReferencePriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @generated
     */
    void setReferencePriority( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(Integer)
     * @generated
     */
    void unsetReferencePriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reference Priority</em>' attribute is set.
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(Integer)
     * @generated
     */
    boolean isSetReferencePriority();

    /**
     * Returns the value of the '<em><b>Voltage Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Factor</em>' attribute.
     * @see #isSetVoltageFactor()
     * @see #unsetVoltageFactor()
     * @see #setVoltageFactor(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExternalNetworkInjection_VoltageFactor()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ExternalNetworkInjection.voltageFactor' kind='element'"
     * @generated
     */
    Float getVoltageFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Factor</em>' attribute.
     * @see #isSetVoltageFactor()
     * @see #unsetVoltageFactor()
     * @see #getVoltageFactor()
     * @generated
     */
    void setVoltageFactor( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageFactor()
     * @see #getVoltageFactor()
     * @see #setVoltageFactor(Float)
     * @generated
     */
    void unsetVoltageFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Factor</em>' attribute is set.
     * @see #unsetVoltageFactor()
     * @see #getVoltageFactor()
     * @see #setVoltageFactor(Float)
     * @generated
     */
    boolean isSetVoltageFactor();

} // ExternalNetworkInjection
