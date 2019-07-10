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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExternalNetworkInjection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalNetworkInjectionItemProvider extends RegulatingCondEqItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExternalNetworkInjectionItemProvider( AdapterFactory adapterFactory ) {
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

            addGovernorSCDPropertyDescriptor( object );
            addIkSecondPropertyDescriptor( object );
            addMaxInitialSymShCCurrentPropertyDescriptor( object );
            addMaxPPropertyDescriptor( object );
            addMaxQPropertyDescriptor( object );
            addMaxR0ToX0RatioPropertyDescriptor( object );
            addMaxR1ToX1RatioPropertyDescriptor( object );
            addMaxZ0ToZ1RatioPropertyDescriptor( object );
            addMinInitialSymShCCurrentPropertyDescriptor( object );
            addMinPPropertyDescriptor( object );
            addMinQPropertyDescriptor( object );
            addMinR0ToX0RatioPropertyDescriptor( object );
            addMinR1ToX1RatioPropertyDescriptor( object );
            addMinZ0ToZ1RatioPropertyDescriptor( object );
            addPPropertyDescriptor( object );
            addQPropertyDescriptor( object );
            addReferencePriorityPropertyDescriptor( object );
            addVoltageFactorPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Governor SCD feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGovernorSCDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_governorSCD_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_governorSCD_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_GovernorSCD(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ik Second feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIkSecondPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExternalNetworkInjection_ikSecond_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ExternalNetworkInjection_ikSecond_feature", "_UI_ExternalNetworkInjection_type" ),
                        CimPackage.eINSTANCE.getExternalNetworkInjection_IkSecond(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Initial Sym Sh CCurrent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxInitialSymShCCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_maxInitialSymShCCurrent_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExternalNetworkInjection_maxInitialSymShCCurrent_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MaxInitialSymShCCurrent(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_maxP_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_maxP_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MaxP(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_maxQ_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_maxQ_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MaxQ(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max R0 To X0 Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxR0ToX0RatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_maxR0ToX0Ratio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_maxR0ToX0Ratio_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MaxR0ToX0Ratio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max R1 To X1 Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxR1ToX1RatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_maxR1ToX1Ratio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_maxR1ToX1Ratio_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MaxR1ToX1Ratio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Z0 To Z1 Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxZ0ToZ1RatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_maxZ0ToZ1Ratio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_maxZ0ToZ1Ratio_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MaxZ0ToZ1Ratio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Initial Sym Sh CCurrent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinInitialSymShCCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_minInitialSymShCCurrent_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExternalNetworkInjection_minInitialSymShCCurrent_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MinInitialSymShCCurrent(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_minP_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_minP_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MinP(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_minQ_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_minQ_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MinQ(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min R0 To X0 Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinR0ToX0RatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_minR0ToX0Ratio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_minR0ToX0Ratio_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MinR0ToX0Ratio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min R1 To X1 Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinR1ToX1RatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_minR1ToX1Ratio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_minR1ToX1Ratio_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MinR1ToX1Ratio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Z0 To Z1 Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinZ0ToZ1RatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_minZ0ToZ1Ratio_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_minZ0ToZ1Ratio_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_MinZ0ToZ1Ratio(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_p_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_p_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_P(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_q_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_q_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_Q(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reference Priority feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReferencePriorityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_referencePriority_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ExternalNetworkInjection_referencePriority_feature", "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_ReferencePriority(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageFactorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ExternalNetworkInjection_voltageFactor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ExternalNetworkInjection_voltageFactor_feature",
                        "_UI_ExternalNetworkInjection_type" ),
                CimPackage.eINSTANCE.getExternalNetworkInjection_VoltageFactor(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExternalNetworkInjection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExternalNetworkInjection" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExternalNetworkInjection ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExternalNetworkInjection_type" )
                : getString( "_UI_ExternalNetworkInjection_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExternalNetworkInjection.class ) ) {
        case CimPackage.EXTERNAL_NETWORK_INJECTION__GOVERNOR_SCD:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__IK_SECOND:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_INITIAL_SYM_SH_CCURRENT:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_P:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Q:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R0_TO_X0_RATIO:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_R1_TO_X1_RATIO:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MAX_Z0_TO_Z1_RATIO:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_INITIAL_SYM_SH_CCURRENT:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_P:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Q:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R0_TO_X0_RATIO:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_R1_TO_X1_RATIO:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__MIN_Z0_TO_Z1_RATIO:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__P:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__Q:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__REFERENCE_PRIORITY:
        case CimPackage.EXTERNAL_NETWORK_INJECTION__VOLTAGE_FACTOR:
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
