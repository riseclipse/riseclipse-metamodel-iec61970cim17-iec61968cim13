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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformerEndInfoItemProvider extends AssetInfoItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerEndInfoItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addConnectionKindPropertyDescriptor( object );
            addEmergencySPropertyDescriptor( object );
            addEndNumberPropertyDescriptor( object );
            addInsulationUPropertyDescriptor( object );
            addPhaseAngleClockPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addRatedSPropertyDescriptor( object );
            addRatedUPropertyDescriptor( object );
            addShortTermSPropertyDescriptor( object );
            addGroundedEndShortCircuitTestsPropertyDescriptor( object );
            addEnergisedEndNoLoadTestsPropertyDescriptor( object );
            addTransformerStarImpedancePropertyDescriptor( object );
            addOpenEndOpenCircuitTestsPropertyDescriptor( object );
            addToMeshImpedancesPropertyDescriptor( object );
            addEnergisedEndShortCircuitTestsPropertyDescriptor( object );
            addEnergisedEndOpenCircuitTestsPropertyDescriptor( object );
            addTransformerTankInfoPropertyDescriptor( object );
            addCoreAdmittancePropertyDescriptor( object );
            addFromMeshImpedancesPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Connection Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_connectionKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TransformerEndInfo_connectionKind_feature", "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_ConnectionKind(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Emergency S feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEmergencySPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_emergencyS_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEndInfo_emergencyS_feature",
                                "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_EmergencyS(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the End Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_endNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEndInfo_endNumber_feature",
                                "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_EndNumber(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Insulation U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInsulationUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_insulationU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEndInfo_insulationU_feature",
                                "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_InsulationU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Phase Angle Clock feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhaseAngleClockPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_phaseAngleClock_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TransformerEndInfo_phaseAngleClock_feature", "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_PhaseAngleClock(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEndInfo_r_feature",
                                "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_R(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated S feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedSPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_ratedS_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEndInfo_ratedS_feature",
                                "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_RatedS(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_ratedU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEndInfo_ratedU_feature",
                                "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_RatedU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Short Term S feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShortTermSPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_shortTermS_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TransformerEndInfo_shortTermS_feature",
                                "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_ShortTermS(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Grounded End Short Circuit Tests feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroundedEndShortCircuitTestsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_TransformerEndInfo_GroundedEndShortCircuitTests_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_TransformerEndInfo_GroundedEndShortCircuitTests_feature", "_UI_TransformerEndInfo_type" ),
                CimPackage.eINSTANCE.getTransformerEndInfo_GroundedEndShortCircuitTests(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Energised End No Load Tests feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndNoLoadTestsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_TransformerEndInfo_EnergisedEndNoLoadTests_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_TransformerEndInfo_EnergisedEndNoLoadTests_feature", "_UI_TransformerEndInfo_type" ),
                CimPackage.eINSTANCE.getTransformerEndInfo_EnergisedEndNoLoadTests(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Transformer Star Impedance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransformerStarImpedancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_TransformerEndInfo_TransformerStarImpedance_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_TransformerEndInfo_TransformerStarImpedance_feature", "_UI_TransformerEndInfo_type" ),
                CimPackage.eINSTANCE.getTransformerEndInfo_TransformerStarImpedance(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Open End Open Circuit Tests feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOpenEndOpenCircuitTestsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_TransformerEndInfo_OpenEndOpenCircuitTests_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_TransformerEndInfo_OpenEndOpenCircuitTests_feature", "_UI_TransformerEndInfo_type" ),
                CimPackage.eINSTANCE.getTransformerEndInfo_OpenEndOpenCircuitTests(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the To Mesh Impedances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToMeshImpedancesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_ToMeshImpedances_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TransformerEndInfo_ToMeshImpedances_feature", "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_ToMeshImpedances(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Energised End Short Circuit Tests feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndShortCircuitTestsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_TransformerEndInfo_EnergisedEndShortCircuitTests_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_TransformerEndInfo_EnergisedEndShortCircuitTests_feature", "_UI_TransformerEndInfo_type" ),
                CimPackage.eINSTANCE.getTransformerEndInfo_EnergisedEndShortCircuitTests(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Energised End Open Circuit Tests feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndOpenCircuitTestsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_TransformerEndInfo_EnergisedEndOpenCircuitTests_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_TransformerEndInfo_EnergisedEndOpenCircuitTests_feature", "_UI_TransformerEndInfo_type" ),
                CimPackage.eINSTANCE.getTransformerEndInfo_EnergisedEndOpenCircuitTests(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Transformer Tank Info feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransformerTankInfoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_TransformerTankInfo_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TransformerEndInfo_TransformerTankInfo_feature", "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_TransformerTankInfo(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Core Admittance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCoreAdmittancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_CoreAdmittance_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TransformerEndInfo_CoreAdmittance_feature", "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_CoreAdmittance(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the From Mesh Impedances feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFromMeshImpedancesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_TransformerEndInfo_FromMeshImpedances_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_TransformerEndInfo_FromMeshImpedances_feature", "_UI_TransformerEndInfo_type" ),
                        CimPackage.eINSTANCE.getTransformerEndInfo_FromMeshImpedances(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns TransformerEndInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TransformerEndInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TransformerEndInfo ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TransformerEndInfo_type" )
                : getString( "_UI_TransformerEndInfo_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( TransformerEndInfo.class ) ) {
        case CimPackage.TRANSFORMER_END_INFO__CONNECTION_KIND:
        case CimPackage.TRANSFORMER_END_INFO__EMERGENCY_S:
        case CimPackage.TRANSFORMER_END_INFO__END_NUMBER:
        case CimPackage.TRANSFORMER_END_INFO__INSULATION_U:
        case CimPackage.TRANSFORMER_END_INFO__PHASE_ANGLE_CLOCK:
        case CimPackage.TRANSFORMER_END_INFO__R:
        case CimPackage.TRANSFORMER_END_INFO__RATED_S:
        case CimPackage.TRANSFORMER_END_INFO__RATED_U:
        case CimPackage.TRANSFORMER_END_INFO__SHORT_TERM_S:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
